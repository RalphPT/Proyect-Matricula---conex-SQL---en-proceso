package Datos;

import Entidad.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDB extends Conexion {

    PreparedStatement ps = null;
    Connection conn = null;
    ResultSet rs = null;
    String sql = "";

    public boolean graba_usuario(Login login) {
        conn = getConexion();

        sql = "INSERT into Usuario values (null,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getContraseña());
            ps.setString(3, login.getApellido());
            ps.setString(4, login.getNombre());
            ps.setString(5, login.getEstado());

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de grabación"+ex.getMessage());
            return false;
        }
    }

    public boolean busca_Login(String Usuario, String Contraseña) {
        conn = getConexion();
        sql = "select * from Usuario where Usuario=? and Contraseña=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Contraseña);
            rs = ps.executeQuery();
            if (rs.next()) {
                
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "¡Usuario No Existe, debe Registrarse!");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la lectura de la tabla Login"+ex.getMessage());
            return false;
        }

    }

}
