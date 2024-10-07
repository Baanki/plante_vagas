package plantevagas.model.bean;

public class ExperienciaProfissional {
    
    private String cargo;
    private String empresa;
    private String inicioData;
    private String fimData;
    private String descricao;

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
    
}
