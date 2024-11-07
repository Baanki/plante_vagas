package plantevagas.model.bean;

public class ExperienciaProfissional {
    
    private String cargo;
    private String empresa;
    private String inicioData;
    private String fimData;
    private String descricao;
    private Boolean empregoAtual;
    private int idCurriculo;

    public ExperienciaProfissional(String cargo, String empresa, String descricao, Boolean empregoAtual,int idCurriculo){

        this.cargo = cargo;
        this.empresa = empresa;
        this.descricao = descricao;
        this.empregoAtual = empregoAtual;
        this.idCurriculo = idCurriculo;

    }

    public String getCargo() {
        return cargo;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getEmpresa() {
        return empresa;
    }
    public String getFimData() {
        return fimData;
    }
    public String getInicioData() {
        return inicioData;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public void setFimData(String fimData) {
        this.fimData = fimData;
    }
    public void setInicioData(String inicioData) {
        this.inicioData = inicioData;
    }
    public int getIdCurriculo() {
        return idCurriculo;
    }
    public void setIdCurriculo(int idCurriculo) {
        this.idCurriculo = idCurriculo;
    }
    public Boolean getEmpregoAtual() {
        return empregoAtual;
    }
    public void setEmpregoAtual(Boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }
    
}
