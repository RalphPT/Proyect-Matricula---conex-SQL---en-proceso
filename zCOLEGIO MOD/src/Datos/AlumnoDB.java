/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.Alumno;
import Presentacion.frmMatricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AlumnoDB extends Conexion {

    PreparedStatement ps = null;
    Connection conn = null;
    ResultSet rs = null;
    String sql = "";

    Alumno alumno = new Alumno();
    public boolean graba_Alumno(Alumno alumno) {

        conn = getConexion();

        sql = "Insert into Alumno values (null,?,?,?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, alumno.getDni());
            ps.setString(2, alumno.getNomb_alum());
            ps.setString(3, alumno.getApell_pat());
            ps.setString(4, alumno.getApell_mat());
            ps.setString(5, alumno.getSexo());
            ps.setString(6, alumno.getFecha_nac());
            ps.setString(7, alumno.getDireccion());
            ps.setString(8, alumno.getEstado());
            ps.setInt(9, alumno.getReligion());
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al grabar en la Tabla Alumno" + ex.getMessage());
            return false;
        }
    }

    public boolean edita_Alumno(Alumno alumno) {
        conn = getConexion();
        sql = "update Alumno set dni=?, Nomb_Alum=?, Apell_Pat=?,Apell_Mat=?,Sexo=?,"
                + "Fecha_Nac=?,Direccion=?,Estado=?,Religion=? where dni=?";
        
        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, alumno.getDni());
            ps.setString(2, alumno.getNomb_alum());
            ps.setString(3, alumno.getApell_pat());
            ps.setString(4, alumno.getApell_mat());
            ps.setString(5, alumno.getSexo());
            ps.setString(6, alumno.getFecha_nac());
            ps.setString(7, alumno.getDireccion());
            ps.setString(8, alumno.getEstado());
            ps.setInt(9, alumno.getReligion());
            ps.setString(10, alumno.getDni());
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Editar los Datos Alumno" + ex.getMessage());
            return false;
        }
    }
    public Alumno busca_Alumno(String dni) {
        conn = (Connection) getConexion();
        sql = "Select * from Alumno where Dni = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                alumno.setDni(rs.getString("Dni"));
                alumno.setNomb_alum(rs.getString("Nomb_Alum"));
                alumno.setApell_pat(rs.getString("Apell_Pat"));
                alumno.setApell_mat(rs.getString("Apell_Mat"));
                alumno.setSexo(rs.getString("Sexo"));
                alumno.setFecha_nac(rs.getString("Fecha_Nac"));
                alumno.setDireccion(rs.getString("Direccion"));
                alumno.setEstado(rs.getString("Estado"));
                alumno.setReligion(rs.getInt("Religion"));
                return alumno;
            } else {
                JOptionPane.showMessageDialog(null, "No existe DNI");//producto.setDescripcion("nada"); <<AQUÍ NO>>
                return alumno;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Error en la búsqueda de la TBAlumno " + ex.getMessage());
            //producto.setDescripcion("nada");<<AQUÍ SÍ>>
            return alumno;
        }
    }
    public Alumno bussca_Alumno(String dni){

        
        conn = getConexion();

        sql = "Select * from Alumno where Dni=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                alumno.setNomb_alum(rs.getString("Nomb_Alum"));
                alumno.setApell_pat(rs.getString("Apell_pat"));
                alumno.setApell_mat(rs.getString("Apell_mat"));
                return alumno;
            } else {
                return alumno;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar en la Tabla Alumno" + ex.getMessage());
            return alumno;
        }
    }
    public boolean busssca_Alumno(String dni){
        conn = getConexion();
        sql = "Select * from Alumno where Dni=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                alumno.setNomb_alum(rs.getString("Nomb_Alum"));
                alumno.setApell_pat(rs.getString("Apell_pat"));
                alumno.setApell_mat(rs.getString("Apell_mat"));
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar en la Tabla Alumno" + ex.getMessage());
            return false;
        }
    }
}
