package plantevagas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import plantevagas.connection.ConnectionFactory;
import plantevagas.model.bean.Certificado;
import plantevagas.model.bean.Curriculo;
import plantevagas.model.bean.Diferencial;
import plantevagas.model.bean.ExperienciaProfissional;
import plantevagas.model.bean.FormacaoAcademica;
import plantevagas.model.bean.Idioma;
import plantevagas.model.bean.UsuarioCandidato;
import plantevagas.model.dao.CertificadoDAO;
import plantevagas.model.dao.CurriculoDAO;
import plantevagas.model.dao.DiferencialDAO;
import plantevagas.model.dao.ExperienciaProfissionalDAO;
import plantevagas.model.dao.FormacaoAcademicaDAO;
import plantevagas.model.dao.IdiomaDAO;
import plantevagas.model.dao.UsuarioCandidatoDAO;

public class Main {

    public static int logar(String email, String senha){
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT id FROM usuariocandidato where email = ? AND senha = ?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                return -1;
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão" + e);
        }
    }

    public static void main( String[] args ){

        int idUsuario = -1;
        Scanner read = new Scanner(System.in);

        Boolean continuarAplicacaoGeral = true;
        while (continuarAplicacaoGeral == true) {
            System.out.println("[1] Login");
            System.out.println("[2] Cadastrar");
            System.out.println("[0] Sair da aplicação");
            int escolha = read.nextInt();
            read.nextLine();
            
            switch (escolha) {
                case 1:
                    Boolean continuarLogin = true;
                    while (continuarLogin == true) {
                        System.out.println("Digite seu email");
                            String email = read.nextLine();

                        System.out.println("Digite sua senha");
                            String senha = read.nextLine();

                        int usuarioLogin = logar(email, senha);

                        if(usuarioLogin == -1){
                            System.out.println("Email não encontrado ou senha incorreta");
                        }else{
                            idUsuario = usuarioLogin;
                            continuarLogin = false;
                        };
                    }
                    Boolean continuarAplicacao = true;
                    while (continuarAplicacao == true) {

                        Curriculo curriculo = new CurriculoDAO().read(idUsuario);
                        if(curriculo == null){
                            Curriculo novoCurriculo = new Curriculo(idUsuario);
                            new CurriculoDAO().create(novoCurriculo);
                            curriculo = new CurriculoDAO().read(idUsuario);
                        }

                        System.out.println("----CURRICULO----");
                        System.out.println("[1] Adicionar Certificado");
                        System.out.println("[2] Adicionar Diferencial");
                        System.out.println("[3] Adicionar Experiência Profissional");
                        System.out.println("[4] Adicionar Formação Acadêmica");
                        System.out.println("[5] Adicionar Idioma");
                        System.out.println("[0] Sair da conta");
                        int escolhaCurriculo = read.nextInt();
                        read.nextLine();
                        switch (escolhaCurriculo) {
                            case 1:
                                System.out.println("Nome da instituição: ");
                                    String nomeInstituicao = read.nextLine();
                                System.out.println("Descrição: ");
                                    String descricao = read.nextLine();

                                Certificado novoCertificado = new Certificado(nomeInstituicao, descricao, curriculo.getId());
                                new CertificadoDAO().create(novoCertificado);
                                
                            break;
                            case 2:
                                System.out.println("Digite suas características");
                                    String caracteristicasTem = read.nextLine();
                                System.out.println("Digite as características que você não possui");
                                    String caracteristicasNaoTem = read.nextLine();

                                Diferencial novoDiferencial = new Diferencial(caracteristicasTem, caracteristicasNaoTem, curriculo.getId());
                                new DiferencialDAO().create(novoDiferencial);

                            break;
                            case 3:
                                System.out.println("Cargo: ");
                                    String cargo = read.nextLine();
                                System.out.println("Empresa: ");
                                    String empresa = read.nextLine();
                                System.out.println("Descricao: ");
                                    String descricaoExperiencia = read.nextLine();

                                Boolean continuarEmpregoAtual = true;
                                Boolean empregoAtual = false;
                                    while (continuarEmpregoAtual == true) {
                                        System.out.println("É seu emprego atual? \n[1] Sim \n[2] Não");
                                        int testeEmpregoAtual = read.nextInt();
                                        if(testeEmpregoAtual == 1){
                                            empregoAtual = true;
                                            continuarEmpregoAtual = false;
                                        }else if(testeEmpregoAtual == 2){
                                            empregoAtual = false;
                                            continuarEmpregoAtual = false;
                                        }else{
                                            continuarEmpregoAtual = true;
                                        }
                                    }
                                ExperienciaProfissional novaExperienciaProfissional = new ExperienciaProfissional(cargo, empresa, descricaoExperiencia, empregoAtual, curriculo.getId());
                                new ExperienciaProfissionalDAO().create(novaExperienciaProfissional);
       
                            break;
                            case 4:
                                System.out.println("Nivel da formação: ");
                                    String nivelFormacao = read.nextLine();
                                System.out.println("Grau da formação: ");
                                    String grauFormacao = read.nextLine();
                                System.out.println("Status: ");
                                    String statusFormacao = read.nextLine();
                                System.out.println("Curso: ");
                                    String cursoFormacao = read.nextLine();
                                System.out.println("Instituição: ");
                                    String intituicaoFormacao = read.nextLine();

                                FormacaoAcademica novaFormacao = new FormacaoAcademica(nivelFormacao, grauFormacao, statusFormacao, cursoFormacao, intituicaoFormacao, curriculo.getId());
                                new FormacaoAcademicaDAO().create(novaFormacao);
                            
                            break;
                            case 5:
                                System.out.println("Idioma: ");
                                    String idioma = read.nextLine();
                                System.out.println("Nível: ");
                                    String nivelIdioma = read.nextLine();

                                Idioma novoIdioma = new Idioma(idioma, nivelIdioma, curriculo.getId());
                                new IdiomaDAO().create(novoIdioma);

                            break;
                            case 0:
                                continuarAplicacao = false;
                            break;
                            default:
                                System.out.println("Opção indisponível, tente novamente.");
                            break;
                        }
                    }
                break;
                case 2:

                break;
                case 0:
                    read.close();
                    continuarAplicacaoGeral = false;
                break;
                default:
                    System.out.println("Opção indisponível, tente novamente.");
                break;
            }
        }

    }
}
