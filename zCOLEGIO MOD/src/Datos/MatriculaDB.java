package Datos;

import Entidad.Alumno;
import Entidad.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MatriculaDB extends Conexion {

    PreparedStatement ps = null;
    Connection conn = null;
    ResultSet rs = null;
    String sql = "";

    Matricula matricula = new Matricula();
    Alumno alumno = new Alumno();

    public boolean graba_Matricula(Matricula matricula) {

        conn = getConexion();

        sql = "Insert into Matricula values (null,?,?,?,?,Alumno_Id_Alumno)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, matricula.getDni());
            ps.setInt(2, matricula.getGrado());
            ps.setInt(3, matricula.getNivel());
            ps.setInt(4, matricula.getTurno());

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al grabar en la Tabla Matricula" + ex.getMessage());
            return false;
        }
    }

    public Matricula busca_Matricula(String dni) {
        conn = getConexion();
        sql = "select * from Matricula where Dni=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                matricula.setGrado(rs.getInt("Grado"));
                matricula.setNivel(rs.getInt("Nivel"));
                matricula.setTurno(rs.getInt("Turno"));
                return matricula;
            } else {
                JOptionPane.showMessageDialog(null, "¡Usuario No Existe, debe Registrarse!");
                return matricula;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la lectura de la tabla Login" + ex.getMessage());
            return matricula;
        }

    }

    public boolean edita_Matricula(Matricula matricula) {
        conn = getConexion();

        sql = "update Matricula set Grado=?,Nivel=?,Turno=? where Dni=?";
        try {
            ps = conn.prepareStatement(sql);

            ps.setInt(1, matricula.getGrado());
            ps.setInt(2, matricula.getNivel());
            ps.setInt(3, matricula.getTurno());
            ps.setString(4, matricula.getDni());
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Editar los Datos Matrícula " + ex.getMessage());
            return false;
        }

    }

    public Matricula bussca_Matricula(String dni) {

        conn = getConexion();

        sql = "Select * from Matricula M where Dni=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                matricula.setGrado(rs.getInt("Grado"));
                matricula.setNivel(rs.getInt("Nivel"));
                matricula.setTurno(rs.getInt("Turno"));

                return matricula;
            } else {
                return matricula;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar en la Tabla Matricula" + ex.getMessage());
            return matricula;
        }
    }
}
