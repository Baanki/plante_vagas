package plantevagas.model.bean;

public class Certificado {
    
    private String nomeInstituicao;
    private String descricao;
    private int idCurriculo;

    public Certificado(String nomeInstituicao, String descricao, int idCurriculo){
        this.nomeInstituicao = nomeInstituicao;
        this.descricao = descricao;
        this.idCurriculo = idCurriculo;
    }

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
    public int getIdCandidato() {
        return idCurriculo;
    }
    public void setIdCandidato(int idCandidato) {
        this.idCurriculo = idCandidato;
    }

}
