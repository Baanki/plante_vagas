package plantevagas.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import plantevagas.connection.ConnectionFactory;
import plantevagas.model.bean.FormacaoAcademica;

public class FormacaoAcademicaDAO {
    
    public void create(FormacaoAcademica formacaoAcademica){

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO formacaoacademica(nivelFormacao, grauFormacao, status,curso,instituicao,fk_curriculo) values(?,?,?,?,?,?)";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, formacaoAcademica.getNivelFormacao());
            stmt.setString(2, formacaoAcademica.getGrauFormacao());
            stmt.setString(3, formacaoAcademica.getStatus());
            stmt.setString(4, formacaoAcademica.getCurso());
            stmt.setString(5, formacaoAcademica.getNomeInstituicao());
            stmt.setInt(6, formacaoAcademica.getIdCandidato());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Salvo com sucesso!");

        } catch (Exception e) {
          System.out.println("Erro ao salvar "+e);
        }
    }
}
