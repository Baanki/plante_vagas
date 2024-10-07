public class FormacaoAcademica {
   
    private String nivelFormacao;
    private String grauFormacao;
    private String status;
    private String curso;
    private String nomeInstituicao;
    private String inicioData;
    private String fimData;

    public FormacaoAcademica(String nivelFormacao,String grauFormacao, String status, String curso, String nomeInstituicao, String inicioData, String fimData){
        
        this.nivelFormacao = nivelFormacao;
        this.grauFormacao = grauFormacao;
        this.status = status;
        this.curso = curso;
        this.nomeInstituicao = nomeInstituicao;
        this.inicioData = inicioData;
        this.fimData = fimData;

    }

    public String getNivelFormacao() {
        return nivelFormacao;
    }

    public void setNivelFormacao(String nivelFormacao) {
        this.nivelFormacao = nivelFormacao;
    }

    public String getGrauFormacao() {
        return grauFormacao;
    }

    public void setGrauFormacao(String grauFormacao) {
        this.grauFormacao = grauFormacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getInicioData() {
        return inicioData;
    }

    public void setInicioData(String inicioData) {
        this.inicioData = inicioData;
    }

    public String getFimData() {
        return fimData;
    }

    public void setFimData(String fimData) {
        this.fimData = fimData;
    }

    
}
