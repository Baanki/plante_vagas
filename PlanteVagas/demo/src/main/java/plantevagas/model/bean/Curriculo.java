package plantevagas.model.bean;

public class Curriculo {
    
    private int id;
    private int idCandidato;

    public Curriculo(int idCandidato){
        this.idCandidato = idCandidato;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdCandidato() {
        return idCandidato;
    }
    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

}
