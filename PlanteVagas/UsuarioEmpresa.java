import java.util.ArrayList;

public class UsuarioEmpresa{

    private Integer id;
    private String email;
    private String senha;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String telefone;
    private Endereco endereco;
    private ArrayList<Vaga> vagas;

    public UsuarioEmpresa(Integer id, String email, String senha,String razaoSocial,String nomeFantasia,String cnpj, String telefone){
        
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.vagas = new ArrayList<>();

    }

    public Vaga getVaga(Integer id){
        Vaga vaga = vagas.get(id-1);
        return vaga;
    }

    public void addVaga(String nome, String vaga, String beneficios, String descricao){
        Vaga novaVaga = new Vaga(1,nome,vaga,beneficios,descricao);
        this.vagas.add(novaVaga);
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

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
