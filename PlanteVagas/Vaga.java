public class Vaga {
    
    private Integer id;
    private String nome;
    private String cargo;
    private String beneficios;
    private String descricao;

    public Vaga(Integer id, String nome, String cargo, String beneficios, String descricao){
        
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.beneficios = beneficios;
        this.descricao = descricao;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    
}
