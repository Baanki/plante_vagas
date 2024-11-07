package plantevagas.model.bean;

public class Idioma {
    
    private String idioma;
    private String nivel;
    private int idCurriculo;

    public Idioma(String idioma, String nivel, int idCurriculo){
        this.idioma = idioma;
        this.nivel = nivel;
        this.idCurriculo = idCurriculo;
    }

    public String getIdioma() {
        return idioma;
    }
    public String getNivel() {
        return nivel;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public int getIdCandidato() {
        return idCurriculo;
    }
    public void setIdCandidato(int idCandidato) {
        this.idCurriculo = idCandidato;
    }

}
