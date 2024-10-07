package plantevagas.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String url = "jdbc:mysql://localhost:3306/plante_vagas";
    private static final String user = "root";
    private static final String senha = "1234";

    private static Connection conn;

    public static Connection getConnection(){
        try {
            if(conn == null){
                conn = DriverManager.getConnection(url, user, senha);
                return conn;
            }else{
                return conn;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão" + e);

        }
        
    }

    public static void closeConnection(Connection conn){
       
        try {
            if(conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement stmt){
       
        closeConnection(conn);
        
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs){
       
        closeConnection(conn, stmt);
        
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
