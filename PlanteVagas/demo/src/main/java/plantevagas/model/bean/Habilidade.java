package plantevagas.model.bean;

import java.util.ArrayList;

public class Habilidade {
    
    private String caracteristicasTem;
    private String caracteristicasAcham;
    private String inaceitavel;
    private String fundamental;
    private ArrayList<FormacaoAcademica> formacaoAcademica;
    private ArrayList<Idioma> idioma;
    private ArrayList<Certificado> certificado;
    private ArrayList<ExperienciaProfissional> experienciaProfissional;

    public String getCaracteristicasAcham() {
        return caracteristicasAcham;
    }
    public String getCaracteristicasTem() {
        return caracteristicasTem;
    }
    public ArrayList<Certificado> getCertificado() {
        return certificado;
    }
    public ArrayList<ExperienciaProfissional> getExperienciaProfissional() {
        return experienciaProfissional;
    }
    public ArrayList<FormacaoAcademica> getFormacaoAcademica() {
        return formacaoAcademica;
    }
    public String getFundamental() {
        return fundamental;
    }
    public ArrayList<Idioma> getIdioma() {
        return idioma;
    }
    public String getInaceitavel() {
        return inaceitavel;
    }
    public void setCaracteristicasAcham(String caracteristicasAcham) {
        this.caracteristicasAcham = caracteristicasAcham;
    }
    public void setCaracteristicasTem(String caracteristicasTem) {
        this.caracteristicasTem = caracteristicasTem;
    }
    public void setCertificado(ArrayList<Certificado> certificado) {
        this.certificado = certificado;
    }
    public void setExperienciaProfissional(ArrayList<ExperienciaProfissional> experienciaProfissional) {
        this.experienciaProfissional = experienciaProfissional;
    }
    public void setFormacaoAcademica(ArrayList<FormacaoAcademica> formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }
    public void setFundamental(String fundamental) {
        this.fundamental = fundamental;
    }
    public void setIdioma(ArrayList<Idioma> idioma) {
        this.idioma = idioma;
    }
    public void setInaceitavel(String inaceitavel) {
        this.inaceitavel = inaceitavel;
    }
    
    
}
