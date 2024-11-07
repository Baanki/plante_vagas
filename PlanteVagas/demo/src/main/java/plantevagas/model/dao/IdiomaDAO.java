package plantevagas.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import plantevagas.connection.ConnectionFactory;
import plantevagas.model.bean.Idioma;

public class IdiomaDAO {
    
    public void create(Idioma idioma){

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO idioma(idioma, nivel, fk_curriculo) values (?,?,?)";

        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idioma.getIdioma());
            stmt.setString(2, idioma.getNivel());
            stmt.setInt(3, idioma.getIdCandidato());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar "+e);
        }

    }
}
