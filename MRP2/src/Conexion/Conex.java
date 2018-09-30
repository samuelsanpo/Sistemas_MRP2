
package Conexion;
import java.sql.*;

public class Conex {
   
   
 public String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/demanda_mrp1";
String user = "root";
String pass = "Online123";
public Connection connect() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
             System.out.println ("Conectado");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}