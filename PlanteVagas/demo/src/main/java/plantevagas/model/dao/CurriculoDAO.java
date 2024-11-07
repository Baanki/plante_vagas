package plantevagas.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import plantevagas.connection.ConnectionFactory;
import plantevagas.model.bean.Curriculo;

public class CurriculoDAO {
    
    public void create(Curriculo curriculo){

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO curriculo (fk_usuarioCandidato) values (?)";

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1,curriculo.getIdCandidato());
            stmt.executeUpdate();

            stmt.close();
        } catch (Exception e) {
            System.out.println("Erro ao criar "+e);
        }
    }

    public Curriculo read(int idUsuario){

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT id FROM curriculo WHERE fk_usuarioCandidato = ?";
        Curriculo curriculo = null;

        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idUsuario);

            rs = stmt.executeQuery();
            
            while(rs.next()){

                curriculo = new Curriculo(
                    idUsuario
                );
                curriculo.setId(rs.getInt("id"));
            
            }


        } catch (Exception e) {
            // TODO: handle exception
        }

        return curriculo;
    }

}
