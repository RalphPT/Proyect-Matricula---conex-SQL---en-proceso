package Datos;

import Entidad.Alumno;
import Entidad.Pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PagoDB extends Conexion {

    PreparedStatement ps = null;
    Connection conn = null;
    ResultSet rs = null;
    String sql = "";

    Pago pago = new Pago();

    public boolean graba_Pago(Pago pago) {

        conn = getConexion();

        sql = "Insert into Pago values (null,?,?,?,?,?,Alumno_Id_Alumno)";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, pago.getNropago());
            ps.setString(2, pago.getDni());
            ps.setString(3, pago.getFecha());
            ps.setDouble(4, pago.getImporte());
            ps.setInt(5, pago.getTipo_pago());

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al grabar en la Tabla Pago" + ex.getMessage());
            return false;
        }
    }

    public boolean busca_Pago(String dni) {
        conn = (Connection) getConexion();
        sql = "Select * from Pago where dni = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {

                return true;
            } else {
                //JOptionPane.showMessageDialog(null, "No existe Código");//producto.setDescripcion("nada"); <<AQUÍ NO>>
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Error en la búsqueda de la TBPago " + ex.getMessage());
            //producto.setDescripcion("nada");<<AQUÍ SÍ>>
            return false;
        }
    }

}
