package plantevagas.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import plantevagas.connection.ConnectionFactory;
import plantevagas.model.bean.Diferencial;

public class DiferencialDAO {
    
    public void create(Diferencial diferencial){

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO diferencial(caracteristicaTem, caracteristicaNaoTem, fk_curriculo) values (?,?,?)";

        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, diferencial.getCaracteristicasTem());
            stmt.setString(2, diferencial.getCaracteristicasNaoTem());
            stmt.setInt(3, diferencial.getIdCurriculo());
            stmt.executeUpdate();
            
            stmt.close();
            System.out.println("Diferencial adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar "+e);
        }

    }
}
