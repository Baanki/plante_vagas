package plantevagas.model.bean;

public class FormacaoAcademica {
    
    private String nivelFormacao;
    private String grauFormacao;
    private String status;
    private String curso;
    private String nomeInstituicao;
    private String inicioData;
    private String fimData;

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
    
}
