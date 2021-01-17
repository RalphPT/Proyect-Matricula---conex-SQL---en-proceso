
package Datos;

import Entidad.Apoderado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ApoderadoDB extends Conexion{
    
    PreparedStatement ps = null;
    Connection conn = null;
    ResultSet rs = null;
    String sql = "";
    Apoderado apoderado = new Apoderado();
    
     public boolean graba_Apoderado(Apoderado apoderado){

        conn = getConexion();

            sql = "Insert into Apoderado values (null,Id_Alumno,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, apoderado.getDni());
            ps.setInt(2, apoderado.getTipo_Parentesco());
            ps.setString(3, apoderado.getA_Nombres_Apellidos());
            ps.setString(4, apoderado.getA_Dni());
            ps.setInt(5, apoderado.getA_Estado_Civil());
            ps.setString(6, apoderado.getA_Domicilio());
            ps.setString(7, apoderado.getA_Celular());
            ps.setString(8, apoderado.getA_Centro_Trabajo());
            ps.setString(9, apoderado.getA_Ocupacion());
            ps.setString(10,apoderado.getA_Telf_Trabajo());

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al grabar en la Tabla Apoderado" + ex.getMessage());
            return false;
        }
    }
    public boolean edita_Apoderado(Apoderado apoderado) {
        conn = getConexion();

        sql = "update Apoderado set Tipo_Parentesco=?,A_Nombres_Apellidos=?,A_Dni=?,A_Estado_Civil=?,"
                + "A_Domicilio=?,A_Celular=?,A_Centro_Trabajo=?,A_Ocupacion=?, A_Telf_Trabajo=? where Dni=?";
        try {
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, apoderado.getTipo_Parentesco());
            ps.setString(2, apoderado.getA_Nombres_Apellidos());
            ps.setString(3, apoderado.getA_Dni());
            ps.setInt(4, apoderado.getA_Estado_Civil());
            ps.setString(5, apoderado.getA_Domicilio());
            ps.setString(6, apoderado.getA_Celular());
            ps.setString(7, apoderado.getA_Centro_Trabajo());
            ps.setString(8, apoderado.getA_Ocupacion());
            ps.setString(9,apoderado.getA_Telf_Trabajo());
            ps.setString(10, apoderado.getDni());
            

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Editar los Datos Apoderado" + ex.getMessage());
            return false;
        }
    }
    public Apoderado busca_Apoderado(String dni) {
        conn = (Connection) getConexion();
        sql = "Select * from Apoderado where dni = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                apoderado.setTipo_Parentesco(rs.getInt("Tipo_Parentesco"));
                apoderado.setA_Nombres_Apellidos(rs.getString("A_Nombres_Apellidos"));
                apoderado.setA_Dni(rs.getString("A_Dni"));
                apoderado.setA_Estado_Civil(rs.getInt("A_Estado_Civil"));
                apoderado.setA_Domicilio(rs.getString("A_Domicilio"));
                apoderado.setA_Celular(rs.getString("A_Celular"));
                apoderado.setA_Centro_Trabajo(rs.getString("A_Centro_Trabajo"));
                apoderado.setA_Ocupacion(rs.getString("A_Ocupacion"));
                apoderado.setA_Telf_Trabajo(rs.getString("A_Telf_Trabajo"));
                
                return apoderado;
            } else {
                JOptionPane.showMessageDialog(null, "No existe DNI");//producto.setDescripcion("nada"); <<AQUÍ NO>>
                return apoderado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Error en la búsqueda de la TBApoderado " + ex.getMessage());
            //producto.setDescripcion("nada");<<AQUÍ SÍ>>
            return apoderado;
        }
    }
}

