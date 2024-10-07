package plantevagas.model.bean;

public class Endereco {
    
    private int id;
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }
    public String getCidade() {
        return cidade;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getEstado() {
        return estado;
    }
    public int getId() {
        return id;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public String getPais() {
        return pais;
    }
    
}
