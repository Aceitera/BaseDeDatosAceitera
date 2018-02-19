package logica;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion 
{
    public Connection Conectar()
    {
        Connection miConexion = null;
        try
        {
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_teoria1?autoReconnect=true&useSSL=false", "root", "");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return miConexion;
    }
}