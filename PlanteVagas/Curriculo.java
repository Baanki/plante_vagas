public class Curriculo {
    
    private Habilidades habilidades;
    private Diferencial diferencial;

    public Curriculo(){
        this.habilidades = new Habilidades();
        this.diferencial = new Diferencial();
    }

    public Habilidades getHabilidades() {
        return habilidades;
    }

    public void addCaracteristicasTem(String característica){
        this.diferencial.addCaracteristicasTem(característica);
    }
    public void addCaracteristicasAcham(String característica){
        this.diferencial.addCaracteristicasAcham(característica);
    }

    public void setInaceitavel(String texto){
        this.diferencial.setInaceitavel(texto);
    }
    public void setFundamental(String texto){
        this.diferencial.setFundamental(texto);
    }

    public void addDiferencial(String caracteristicasTem,String caracteristicasAcham, String inaceitaval, String fundamental){
        this.diferencial.setInaceitavel(inaceitaval);
        this.diferencial.setFundamental(fundamental);
    }

    public void addExperiencia(String cargo, String empresa, String inicioData, String fimData, String descricao){
        
        this.habilidades.addExperiencia(cargo,empresa,inicioData,fimData,descricao);
    }
        
    public void addFormacao(String nivelFormacao, String grauFormacao, String status,String curso, String nomeInstituicao, String inicioData, String fimData){
        
        this.habilidades.addFormacao(nivelFormacao, grauFormacao, status, curso, nomeInstituicao, inicioData, fimData);
    }

    public void addCertificado(String certificado, String nomeInstituicao, String descricao){
        
        this.habilidades.addCertificado(certificado, nomeInstituicao, descricao);
    }

    public void addIdioma(String idioma, String nivel){
        
        this.habilidades.addIdioma(idioma, nivel);
    }

    public Diferencial getDiferencial() {
        return diferencial;
    }

    
}
