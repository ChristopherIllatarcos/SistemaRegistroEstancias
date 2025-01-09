package controlador;

import modelo.Retiro;
import java.sql.*;

/**
 *
 * @author caill
 */
public class Ctrl_Retiro {

    public boolean guardar(Retiro objeto) {
        boolean respuesta = false;
        java.sql.Connection cn = conexion.Conexion.conectar();
        try {
            String query = "INSERT INTO tb_retiros (nombre, monto, observacion) VALUES (?, ?, ?)";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, objeto.getNombre());
            consulta.setDouble(2, objeto.getMonto());
            consulta.setString(3, objeto.getObsaervacion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Inserción exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar retiro: " + e);
        }
        return respuesta;
    }

    public Retiro buscarPorNombre(String nombre) {
        Retiro retiro = null;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "SELECT * FROM tb_retiros WHERE nombre = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, nombre);

            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                retiro = new Retiro();
                retiro.setIdRetiro(resultado.getInt("id_retiro"));
                retiro.setNombre(resultado.getString("nombre"));
                retiro.setMonto(resultado.getDouble("monto"));
                retiro.setObsaervacion(resultado.getString("observacion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar retiro por nombre: " + e);
        }
        return retiro;
    }

    public boolean actualizar(Retiro objeto, int idRetiro) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "UPDATE tb_retiros SET nombre = ?, monto = ?, observacion = ? WHERE id_retiro = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, objeto.getNombre());
            consulta.setDouble(2, objeto.getMonto());
            consulta.setString(3, objeto.getObsaervacion());
            consulta.setInt(4, idRetiro);

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Actualización exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar retiro: " + e);
        }
        return respuesta;
    }

    public boolean eliminar(int idRetiro) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "DELETE FROM tb_retiros WHERE id_retiro = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setInt(1, idRetiro);

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Eliminación exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar retiro: " + e);
        }
        return respuesta;
    }

    public boolean existeRetiro(String nombre) {
        boolean existe = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "SELECT COUNT(*) FROM tb_retiros WHERE nombre = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, nombre);

            ResultSet resultado = consulta.executeQuery();
            if (resultado.next() && resultado.getInt(1) > 0) {
                existe = true; // Si el conteo es mayor a 0, el retiro existe.
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al verificar existencia de retiro: " + e);
        }
        return existe;
    }

}
