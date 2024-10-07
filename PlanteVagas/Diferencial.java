import java.util.ArrayList;

public class Diferencial {
    
    private ArrayList<String> caracteristicasTem;
    private ArrayList<String> caracteristicasAcham;
    private String inaceitavel;
    private String fundamental;

    public Diferencial(){
        this.caracteristicasTem = new ArrayList<>();
        this.caracteristicasAcham = new ArrayList<>();
    }

    public ArrayList<String> getCaracteristicasTem() {
        return caracteristicasTem;
    }

    public void addCaracteristicasTem(String caracteristica) {
        this.caracteristicasTem.add(caracteristica);
    }

    public ArrayList<String> getCaracteristicasAcham() {
        return caracteristicasAcham;
    }

    public void addCaracteristicasAcham(String caracteristica) {
        this.caracteristicasAcham.add(caracteristica);
    }

    public String getInaceitavel() {
        return inaceitavel;
    }

    public void setInaceitavel(String inaceitavel) {
        this.inaceitavel = inaceitavel;
    }

    public String getFundamental() {
        return fundamental;
    }

    public void setFundamental(String fundamental) {
        this.fundamental = fundamental;
    }

    
}
