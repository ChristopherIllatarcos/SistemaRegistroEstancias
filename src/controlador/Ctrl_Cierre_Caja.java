package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import modelo.CierreCaja;

/**
 *
 * @author caill
 */
public class Ctrl_Cierre_Caja {

    public boolean guardar(CierreCaja objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "INSERT INTO tb_cierre_caja (fecha, turno, ventas, subtotales, retiros, total_caja, observacion) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, objeto.getFecha());
            consulta.setString(2, objeto.getTurno());
            consulta.setDouble(3, objeto.getVentas());
            consulta.setDouble(4, objeto.getSubtotal());
            consulta.setDouble(5, objeto.getRetiro());
            consulta.setDouble(6, objeto.getTotal_caja());
            consulta.setString(7, objeto.getObservacion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Inserción exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cierre de caja: " + e);
        }
        return respuesta;
    }

    public boolean actualizar(CierreCaja objeto, int idCierre) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "UPDATE tb_cierre_caja SET "
                    + "fecha = ?, "
                    + "turno = ?, "
                    + "ventas = ?, "
                    + "subtotales = ?, "
                    + "retiros = ?, "
                    + "total_caja = ?, "
                    + "observacion = ? "
                    + "WHERE id_cierre = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, objeto.getFecha());
            consulta.setString(2, objeto.getTurno());
            consulta.setDouble(3, objeto.getVentas());
            consulta.setDouble(4, objeto.getSubtotal());
            consulta.setDouble(5, objeto.getRetiro());
            consulta.setDouble(6, objeto.getTotal_caja());
            consulta.setString(7, objeto.getObservacion());
            consulta.setInt(8, idCierre);

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Actualización exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cierre de caja: " + e);
        }
        return respuesta;
    }

    public boolean eliminar(int idCierre) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "DELETE FROM tb_cierre_caja WHERE id_cierre = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setInt(1, idCierre);

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Eliminación exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cierre de caja: " + e);
        }
        return respuesta;
    }

    public boolean existeCaja(String fecha) {
        boolean existe = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "SELECT COUNT(*) FROM tb_cierre_caja WHERE fecha = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, fecha);

            ResultSet resultado = consulta.executeQuery();
            if (resultado.next() && resultado.getInt(1) > 0) {
                existe = true; // Si el conteo es mayor a 0, el cierre de caja existe.
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al verificar existencia de cierre de caja: " + e);
        }
        return existe;
    }

}
