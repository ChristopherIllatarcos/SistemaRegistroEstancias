package controlador;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
import conexion.Conexion;
import modelo.Estancia;
//import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author caill
 */
public class Ctrl_Estancia {

    //METODO PARA REGISTRAR ESTANCIAS
    public boolean guardar(Estancia objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            // Modificar la consulta para que coincida con las columnas
            String query = "INSERT INTO tb_estancias (nombre_cliente, patente_o_identificacion, numero_suite, hora_llegada, horas, consumo_extra, valor_consumo_extra, valor_total, desayuno_incluido, observacion) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement consulta = cn.prepareStatement(query);

            // Establecer los valores correspondientes a cada columna
            consulta.setString(1, objeto.getNombreCliente());
            consulta.setString(2, objeto.getPatenteOIdentificacion());
            consulta.setInt(3, objeto.getNumeroSuite());
            consulta.setString(4, objeto.getHoraLlegada());
            consulta.setInt(5, objeto.getHoras());
            consulta.setString(6, objeto.getConsumoExtra());
            consulta.setDouble(7, objeto.getValorConsumoExtra());
            consulta.setDouble(8, objeto.getValorTotal());
            consulta.setString(9, objeto.getDesayunoIncluido());
            consulta.setString(10, objeto.getObservacion());

            // Ejecutar la consulta y verificar si se insertaron filas
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();  // Es una buena práctica cerrar la conexión después de usarla
        } catch (SQLException e) {
            System.out.println("Error al guardar estancia: " + e);
        }
        return respuesta;
    }

    public boolean existeEstancia(String rutOPatente) {
        boolean existe = false;
        Connection cn = Conexion.conectar();
        try {
            String query = "SELECT COUNT(*) FROM tb_estancias WHERE patente_o_identificacion = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, rutOPatente);

            ResultSet resultado = consulta.executeQuery();
            if (resultado.next() && resultado.getInt(1) > 0) {
                existe = true; // Si el conteo es mayor a 0, la estancia existe.
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al verificar existencia de estancia: " + e);
        }
        return existe;
    }

    public boolean actualizar(Estancia objeto, int idEstancia) {
        boolean respuesta = false;
        String query = "UPDATE tb_estancias SET nombre_cliente = ?, "
                + "patente_o_identificacion = ?, numero_suite = ?, hora_llegada = ?, horas = ?, "
                + "consumo_extra = ?, valor_consumo_extra = ?, valor_total = ?, desayuno_incluido = ?, "
                + "observacion = ? WHERE id_estancia = ?";

        try (Connection cn = Conexion.conectar(); PreparedStatement consulta = cn.prepareStatement(query)) {

            consulta.setString(1, objeto.getNombreCliente());
            consulta.setString(2, objeto.getPatenteOIdentificacion());
            consulta.setInt(3, objeto.getNumeroSuite());
            consulta.setString(4, objeto.getHoraLlegada());
            consulta.setInt(5, objeto.getHoras());
            consulta.setString(6, objeto.getConsumoExtra());
            consulta.setDouble(7, objeto.getValorConsumoExtra());
            consulta.setDouble(8, objeto.getValorTotal());
            consulta.setString(9, objeto.getDesayunoIncluido());
            consulta.setString(10, objeto.getObservacion());
            consulta.setInt(11, idEstancia); // Parámetro seguro

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar Estancia: " + e.getMessage());
        }
        return respuesta;
    }

    public boolean eliminar(int idEstancia) {

        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "DELETE FROM tb_estancias WHERE id_estancia = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setInt(1, idEstancia);

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Eliminación exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar estancia: " + e.getMessage());
        }
        return respuesta;

    }

    public Estancia buscarPorRutOPatente(String criterio) {
        Estancia estancia = null;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "SELECT * FROM tb_estancias WHERE patente_o_identificacion = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, criterio);

            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                estancia = new Estancia();
                estancia.setIdEstancia(resultado.getInt("id_estancia"));
                estancia.setNombreCliente(resultado.getString("nombre_cliente"));
                estancia.setPatenteOIdentificacion(resultado.getString("patente_o_identificacion"));
                estancia.setNumeroSuite(resultado.getInt("numero_suite"));
                estancia.setHoraLlegada(resultado.getString("hora_llegada"));
                estancia.setHoras(resultado.getInt("horas"));
                estancia.setConsumoExtra(resultado.getString("consumo_extra"));  // Corregido de "nombre_consumo" a "consumo_extra"
                estancia.setValorConsumoExtra(resultado.getDouble("valor_consumo_extra"));
                estancia.setValorTotal(resultado.getDouble("valor_total"));
                estancia.setDesayunoIncluido(resultado.getString("desayuno_incluido"));
                estancia.setObservacion(resultado.getString("observacion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar estancia: " + e);
        }
        return estancia;
    }

    //PRUEBA PARA EL METODO ACTUALIZAR 
    public void pruebaActualizarEstancia() {
        Ctrl_Estancia controlEstancia = new Ctrl_Estancia();

        // Crear objeto Estancia con datos de prueba
        Estancia estancia = new Estancia();
        estancia.setIdEstancia(1); // ID del registro existente
        estancia.setNombreCliente("Alvaro López");
        estancia.setPatenteOIdentificacion("ABC123");
        estancia.setNumeroSuite(202);
        estancia.setHoras(5);
        estancia.setConsumoExtra("Minibar");
        estancia.setValorConsumoExtra(5000);
        estancia.setValorTotal(20000);
        estancia.setDesayunoIncluido("Sí");
        estancia.setObservacion("Cliente frecuente");

        // Formatear fecha para el campo hora_llegada
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date horaLlegada = new java.util.Date(); // Puedes cambiar esta fecha según sea necesario
        estancia.setHoraLlegada(sdf.format(horaLlegada));

        // Ejecutar el método actualizar
        boolean actualizado = controlEstancia.actualizar(estancia, 1); // Cambiar el ID según sea necesario

        // Verificar resultado
        if (actualizado) {
            System.out.println("La estancia fue actualizada correctamente.");
        } else {
            System.out.println("Hubo un error al actualizar la estancia.");
        }
    }

    //EJECUTAR EL METODO ACTUALIZAR
    public static void main(String[] args) {
        // Llama al método de prueba
        new Ctrl_Estancia().pruebaEliminarEstancia();
    }

    //PRUEBA PARA EL METODO ELIMINAR 
    public void pruebaEliminarEstancia() {
        Ctrl_Estancia controlEstancia = new Ctrl_Estancia();

        // ID de estancia que deseas eliminar (asegúrate de que exista en la base de datos)
        int idEstancia = 1;

        // Llamar al método eliminar
        boolean eliminado = controlEstancia.eliminar(idEstancia);

        // Mostrar el resultado
        if (eliminado) {
            System.out.println("Estancia con ID " + idEstancia + " eliminada exitosamente.");
        } else {
            System.out.println("No se pudo eliminar la estancia con ID " + idEstancia + ".");
        }
    }

}
