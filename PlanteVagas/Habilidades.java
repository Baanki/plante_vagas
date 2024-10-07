import java.util.ArrayList;

public class Habilidades {
    
    private ArrayList<Experiencia> experiencias;
    private ArrayList<FormacaoAcademica> formacaoAcademica;
    private ArrayList<Certificados> certificados;
    private ArrayList<Idioma> idiomas;
    
    public Habilidades(){
        this.experiencias = new ArrayList<>();
        this.formacaoAcademica = new ArrayList<>();
        this.certificados = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public void addExperiencia(String cargo, String empresa, String inicioData, String fimData, String descricao){
        Experiencia novaExperiencia = new Experiencia(cargo,empresa,inicioData,fimData,descricao);
        
        this.experiencias.add(novaExperiencia);
    }

    public void addFormacao(String nivelFormacao, String grauFormacao, String status,String curso, String nomeInstituicao, String inicioData, String fimData){
        FormacaoAcademica novaFormacao = new FormacaoAcademica(nivelFormacao,grauFormacao,status,curso,nomeInstituicao,inicioData,fimData);
        
        this.formacaoAcademica.add(novaFormacao);
    }

    public void addCertificado(String certificado, String nomeInstituicao, String descricao){
        Certificados novoCertificado = new Certificados(certificado,nomeInstituicao,descricao);
        
        this.certificados.add(novoCertificado);
    }

    public void addIdioma(String idioma, String nivel){
        Idioma novoIdioma = new Idioma(idioma,nivel);
        
        this.idiomas.add(novoIdioma);
    }

    public ArrayList<Experiencia> getExperiencias() {
        return this.experiencias;
    }

    public ArrayList<FormacaoAcademica> getFormacaoAcademica() {
        return this.formacaoAcademica;
    }

    public ArrayList<Certificados> getCertificados() {
        return this.certificados;
    }

    public ArrayList<Idioma> getIdiomas() {
        return this.idiomas;
    }

    
 
    
}
