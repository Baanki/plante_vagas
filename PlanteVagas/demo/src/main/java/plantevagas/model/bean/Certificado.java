package plantevagas.model.bean;

public class Certificado {
    
    private String nomeInstituicao;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }
}
