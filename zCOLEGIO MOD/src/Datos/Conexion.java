package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/colegio";
    private String usuario = "root";
    private String contraseña = "Fabiola1903@";//kronos1996

    public Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de Conexión!!!" + ex.getMessage());

        }
    }

    public Connection getConexion() {
        return con;
    }

    public static void main(String[] args) {
        Conexion conn = new Conexion();
        conn.getConexion();

    }
}
