public class Certificados {
    
    private String certificado;
    private String nomeInstituicao;
    private String descricao;

    public Certificados(String certificado, String nomeInstituicao, String descricao){
        
        this.certificado = certificado;
        this.nomeInstituicao = nomeInstituicao;
        this.descricao = descricao;

    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
