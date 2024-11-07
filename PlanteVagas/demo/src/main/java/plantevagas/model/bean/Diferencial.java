package plantevagas.model.bean;

public class Diferencial {
    
    private int id;
    private String caracteristicasTem;
    private String caracteristicasNaoTem;
    private int idCurriculo; 

    public Diferencial(String caracteristicasTem, String caracteristicasNaoTem, int idCurriculo){
        this.caracteristicasTem = caracteristicasTem;
        this.caracteristicasNaoTem = caracteristicasNaoTem;
        this.idCurriculo = idCurriculo;
    }

    public int getId() {
        return id;
    }
    public String getCaracteristicasNaoTem() {
        return caracteristicasNaoTem;
    }
    public void setCaracteristicasNaoTem(String caracteristicasNaoTem) {
        this.caracteristicasNaoTem = caracteristicasNaoTem;
    }
    public String getCaracteristicasTem() {
        return caracteristicasTem;
    }
    public void setCaracteristicasTem(String caracteristicasTem) {
        this.caracteristicasTem = caracteristicasTem;
    }
    public int getIdCurriculo() {
        return idCurriculo;
    }
    public void setId(int id) {
        this.id = id;
    }

}
