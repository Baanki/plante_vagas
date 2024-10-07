package plantevagas.model.bean;

import java.util.ArrayList;

public class Curriculo {
    
    private int id;
    private ArrayList<Diferencial> diferencial;
    private ArrayList<Habilidade> habilidade;

    public Curriculo(){
        this.diferencial = new ArrayList<>();
        this.habilidade = new ArrayList<>();
    }

    public ArrayList<Diferencial>  getDiferencial() {
        return diferencial;
    }
    public ArrayList<Habilidade> getHabilidade() {
        return habilidade;
    }
    public int getId() {
        return id;
    }
    public void setDiferencial(ArrayList<Diferencial> diferencial) {
        this.diferencial = diferencial;
    }
    public void setHabilidade(ArrayList<Habilidade> habilidade) {
        this.habilidade = habilidade;
    }
    public void setId(int id) {
        this.id = id;
    }

}
