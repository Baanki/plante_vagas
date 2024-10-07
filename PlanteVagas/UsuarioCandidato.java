import java.util.ArrayList;

public class UsuarioCandidato{

    private Integer id;
    private String email;
    private String senha;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;
    private String genero;
    private Boolean portadorDeficiencia;
    public Endereco endereco;
    public Curriculo curriculo;
    private ArrayList<Vaga> vagas;

    public UsuarioCandidato(Integer id, String email,String senha,String nome,String dataNascimento,String cpf,String telefone,String genero,Boolean portadorDeficiencia){

        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.portadorDeficiencia = portadorDeficiencia;
        this.vagas = new ArrayList<>();

    }

    public void seCandidatar(Vaga vaga){
        this.vagas.add(vaga);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getPortadorDeficiencia() {
        return portadorDeficiencia;
    }

    public void setPortadorDeficiencia(Boolean portadorDeficiencia) {
        this.portadorDeficiencia = portadorDeficiencia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }

}

