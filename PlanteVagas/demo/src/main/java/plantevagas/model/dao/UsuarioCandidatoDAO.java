package plantevagas.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import plantevagas.connection.ConnectionFactory;
import plantevagas.model.bean.UsuarioCandidato;

public class UsuarioCandidatoDAO {
    
    public void create(UsuarioCandidato usuario){

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO usuariocandidato (email, senha, nome, dataNascimento, cpf, telefone, rg, portadorDeficiencia) VALUES (?,?,?,?,?,?,?,?)";

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getNome());
            stmt.setString(4, usuario.getDataNascimento());
            stmt.setString(5, usuario.getCpf());
            stmt.setString(6, usuario.getTelefone());
            stmt.setString(7, usuario.getRg());
            stmt.setBoolean(8, usuario.getPortadorDeficiencia());

            stmt.executeUpdate();
            stmt.close();
            System.out.println("Salvo com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar "+e);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public void delete(UsuarioCandidato usuario){

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "DELETE FROM usuariocandidato WHERE(email=?)";

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario.getEmail());
            stmt.executeUpdate();

            stmt.close();
            System.out.println("Apagado com sucesso!");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    /*public static ArrayList<UsuarioCandidato> read(){

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuariocandidato";
        ArrayList<UsuarioCandidato> usuarios = new ArrayList<>();

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                UsuarioCandidato usuario = new UsuarioCandidato();
                
                usuario.setId(rs.getInt("id"));
                usuario.setEmail(rs.getString("email"));
                usuario.setNome(rs.getString("nome"));
                usuario.setDataNascimento(rs.getString("dataNascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setTelefone(rs.getString("telefone"));                    
                usuario.setRg(rs.getString("rg"));
                usuario.setPortadorDeficiencia(rs.getBoolean("portadorDeficiencia"));
                
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            // TODO: handle exception
        }finally{
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }

        return usuarios;

    }*/
}
