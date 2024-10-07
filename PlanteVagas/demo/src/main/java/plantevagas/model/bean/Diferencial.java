package plantevagas.model.bean;

public class Diferencial {
    
    private int id;
    private String caracteristicas;
    private String fundamental;

    public String getCaracteristicas() {
        return caracteristicas;
    }
    public String getFundamental() {
        return fundamental;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public void setFundamental(String fundamental) {
        this.fundamental = fundamental;
    }
    public int getId() {
        return id;
    }
    
}
