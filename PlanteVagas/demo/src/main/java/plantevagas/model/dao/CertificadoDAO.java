package plantevagas.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import plantevagas.connection.ConnectionFactory;
import plantevagas.model.bean.Certificado;

public class CertificadoDAO {
    
    public void create(Certificado certificado){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO certificacao (nomeInstituicao, descricao, fk_curriculo) VALUES (?,?,?)";

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, certificado.getNomeInstituicao());
            stmt.setString(2, certificado.getDescricao());
            stmt.setInt(3, certificado.getIdCandidato());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Certificado adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar "+e);
        }
    }
}
