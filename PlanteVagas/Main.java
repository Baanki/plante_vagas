
public class Main {
    
    public static void main(String[] args) {
        
        UsuarioCandidato usuario1 = new UsuarioCandidato(1,"igor@gmail.com","123","Igor","12/02/2024","123456789","451234567","Masculino",false);

        usuario1.setEndereco(new Endereco("Brasil","Paraná","Cascavel","XIV de Novembro","BLABLA","123","casa","123456789"));
        usuario1.setCurriculo(new Curriculo());
        usuario1.curriculo.addExperiencia("Professor","Escola","01/01/2024","04/05/2024","Ministrava aulas");
        usuario1.curriculo.addFormacao("Bacharel","Ensino Superior","Incompleto","Engenharia de Software","FAG","15/02/2023","10/12/2026");
        usuario1.curriculo.addCertificado("Curso de Informática Básico","Qualycenter","Pacote Office, Windows e Digitação");
        usuario1.curriculo.addIdioma("Inglês","C1");

        System.out.println(usuario1.curriculo.getHabilidades());

        usuario1.curriculo.addCaracteristicasTem("Inteligente");
        usuario1.curriculo.addCaracteristicasTem("Ágil");
        usuario1.curriculo.addCaracteristicasTem("Focado");
        usuario1.curriculo.addCaracteristicasAcham("Divertido");
        usuario1.curriculo.addCaracteristicasAcham("Lindo");

        usuario1.curriculo.setInaceitavel("Atrasarem salário");
        usuario1.curriculo.setFundamental("Tem q ter café");
    
        System.out.println(usuario1.curriculo.getDiferencial());
    
        UsuarioEmpresa empresa1 = new UsuarioEmpresa(1, "qualycenter@gmail.com", "123456","RodriguesLTDA","Qualycenter","12345789","123465789");
        empresa1.setEndereco(new Endereco("Brasil", "Paraná","Cascavel","Centro","Avenida Brasil","123","Prédio","1234567"));


        empresa1.addVaga("Professor de Informáitca","Professor","VA + VT","Vai da aula");

        usuario1.seCandidatar(empresa1.getVaga(1));
    }
}
