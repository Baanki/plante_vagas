package plantevagas.model.bean;

public class FormacaoAcademica {
    
    private String nivelFormacao;
    private String grauFormacao;
    private String status;
    private String curso;
    private String nomeInstituicao;
    private String inicioData;
    private String fimData;
    private int idCurriculo;

    public FormacaoAcademica(String nivelFormacao, String grauFormacao, String status, String curso, String nomeInstituicao, int idCurriculo){
        this.nivelFormacao = nivelFormacao;
        this.grauFormacao = grauFormacao;
        this.status = status;
        this.curso = curso;
        this.nomeInstituicao = nomeInstituicao;
        this.idCurriculo = idCurriculo;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setFimData(String fimData) {
        this.fimData = fimData;
    }
    public void setGrauFormacao(String grauFormacao) {
        this.grauFormacao = grauFormacao;
    }
    public void setInicioData(String inicioData) {
        this.inicioData = inicioData;
    }
    public void setNivelFormacao(String nivelFormacao) {
        this.nivelFormacao = nivelFormacao;
    }
    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCurso() {
        return curso;
    }
    public String getFimData() {
        return fimData;
    }
    public String getGrauFormacao() {
        return grauFormacao;
    }
    public String getInicioData() {
        return inicioData;
    }
    public String getNivelFormacao() {
        return nivelFormacao;
    }
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }
    public String getStatus() {
        return status;
    }
    public int getIdCandidato() {
        return idCurriculo;
    }
    public void setIdCandidato(int idCandidato) {
        this.idCurriculo = idCandidato;
    }

}
