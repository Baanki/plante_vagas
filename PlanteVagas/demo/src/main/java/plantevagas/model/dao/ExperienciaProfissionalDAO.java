package plantevagas.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import plantevagas.connection.ConnectionFactory;
import plantevagas.model.bean.ExperienciaProfissional;

public class ExperienciaProfissionalDAO {
    
    public void create(ExperienciaProfissional experienciaprofissional){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO experienciaprofissional(cargo, empresa, descricao, empregoAtual,fk_curriculo) values (?,?,?,?,?)";

        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, experienciaprofissional.getCargo());
            stmt.setString(2, experienciaprofissional.getEmpresa());
            stmt.setString(3, experienciaprofissional.getDescricao());
            stmt.setBoolean(4, experienciaprofissional.getEmpregoAtual());
            stmt.setInt(5, experienciaprofissional.getIdCurriculo());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Experiência profissional adicionada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar "+e);
        }
    }
}
