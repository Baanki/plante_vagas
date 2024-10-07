package plantevagas.model.bean;

public class UsuarioCandidato {
    
    private int id;
    private String email;
    private String senha;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;
    private String rg;
    private Boolean portadorDeficiencia;
    private Endereco endereco;
    private Curriculo curriculo;

    public UsuarioCandidato(String email, String senha, String nome, String dataNascimento, String cpf, String telefone, String rg, Boolean portadorDeficiencia){
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.rg = rg;
        this.portadorDeficiencia = portadorDeficiencia;
    }

    public String getCpf() {
        return cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Boolean getPortadorDeficiencia() {
        return portadorDeficiencia;
    }
    public String getRg() {
        return rg;
    }
    public String getSenha() {
        return senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPortadorDeficiencia(Boolean portadorDeficiencia) {
        this.portadorDeficiencia = portadorDeficiencia;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Curriculo getCurriculo() {
        return curriculo;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
