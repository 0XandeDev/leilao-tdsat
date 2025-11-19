import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // String de conexão - AJUSTE A SENHA SE PRECISAR
            String url = "jdbc:mysql://localhost:3306/leilao?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "Maguila02"; // ← Se seu MySQL tem senha, coloque aqui
            
            conn = DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + erro.getMessage());
        }
        return conn;
    }
}