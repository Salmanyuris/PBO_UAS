package projectUAS;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author ALTAIR
 */
public class connDBMS {
    
    String driverdbms = "com.mysql.jdbc.Driver";
    String database = "jdbc:mysql://localhost/a122106622";
    String user = "root";
    String password = "";
    
    public connDBMS(){}
    public Connection getConnection() throws SQLException
    {
        Connection condbms = null;
        try
        {
            Class.forName(driverdbms);
            condbms = DriverManager.getConnection(database,user,password);
            
            return condbms;
        }
        catch (SQLException se)
        {
            System.out.println("Ada kesalahan pada SQL!");
            return null;
        } 
        catch(Exception ex)
        {
            System.out.println("Koneksi database tidak berhasil!");
            return null;
        }    
    }
    
}