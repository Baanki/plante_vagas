public class Experiencia{

    private String cargo;
    private String empresa;
    private String inicioData;
    private String fimData;
    private String descricao;
    
    public Experiencia(String cargo, String empresa, String inicioData, String fimData, String descricao){
        this.cargo = cargo;
        this.empresa = empresa;
        this.inicioData = inicioData;
        this.fimData = fimData;
        this.descricao = descricao;

    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getEmpresa() {
        return empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
            this.descricao = descricao;
    }
    
}
    