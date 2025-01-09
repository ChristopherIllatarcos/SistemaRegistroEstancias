package controlador;

import conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import modelo.Turno;

/**
 *
 * @author caill
 */
public class Ctrl_Turno {

    public boolean guardar(Turno objeto) {
        boolean respuesta = false;
        Connection cn = null;
        try {
            // Conectar a la base de datos
            cn = conexion.Conexion.conectar();

            // Consulta SQL de inserción
            String query = "INSERT INTO tb_turnos (numero_ficha, nombre, turno, fecha, monto_caja) VALUES (?, ?, ?, ?, ?)";

            // Preparar la consulta con opción de devolver la clave generada automáticamente
            PreparedStatement consulta = cn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            // Asignar los valores a los parámetros del PreparedStatement
            consulta.setInt(1, objeto.getNumeroFicha());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getTurno());

            // Convertir la fecha de tipo Date a java.sql.Date
            java.sql.Date fecha = new java.sql.Date(objeto.getFecha().getTime());  
            consulta.setDate(4, fecha);

            consulta.setDouble(5, objeto.getMontoCaja());

            // Ejecutar la inserción
            int rowsAffected = consulta.executeUpdate();
            if (rowsAffected > 0) {
                // Si la inserción fue exitosa, obtener el id generado
                ResultSet rs = consulta.getGeneratedKeys();
                if (rs.next()) {
                    objeto.setIdTurno(rs.getInt(1)); // Obtener el id generado y asignarlo al objeto
                }
                respuesta = true; // Inserción exitosa
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar turno: " + e.getMessage());
        } finally {
            // Cerrar la conexión de manera segura
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return respuesta;
    }

    public ArrayList<Turno> buscar(String criterio) {
        ArrayList<Turno> listaProductos = new ArrayList<>();
        Connection cn = null;
        try {
            // Conectar a la base de datos
            cn = conexion.Conexion.conectar();
            String query = "SELECT * FROM tb_turnos WHERE nombre LIKE ? OR fecha LIKE ?";

            // Preparar la consulta
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, "%" + criterio + "%"); // Búsqueda parcial por nombre
            consulta.setString(2, "%" + criterio + "%"); // Búsqueda parcial por fecha

            // Ejecutar la consulta
            ResultSet resultado = consulta.executeQuery();

            // Procesar el resultado
            while (resultado.next()) {
                Turno turno = new Turno();
                turno.setIdTurno(resultado.getInt("id_turno"));
                turno.setNumeroFicha(resultado.getInt("numero_ficha"));
                turno.setNombre(resultado.getString("nombre"));
                turno.setTurno(resultado.getString("turno"));

                // Convertir la fecha de String a Date
                Date fecha = resultado.getDate("fecha");
                turno.setFecha(fecha);  // Asegúrate de que setFecha acepte un objeto Date

                turno.setMontoCaja(resultado.getDouble("monto_caja"));

                // Agregar el turno a la lista
                listaProductos.add(turno);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return listaProductos;
    }

    public boolean actualizar(Turno turno, int idTurno) {
        boolean respuesta = false;
        Connection cn = null;
        
        if (turno.getIdTurno() <= 0) {
        System.out.println("Error: ID de turno no válido para la actualización.");
        return false;
    }
        try {
            cn = Conexion.conectar();
            // Imprimir los valores antes de actualizar
            System.out.println("Insertando o Actualizando: " + turno);
            String query = "UPDATE tb_turnos SET numero_ficha = ?, nombre = ?, turno = ?, fecha = ?, monto_caja = ? WHERE id_turno = ?";
            PreparedStatement consulta = cn.prepareStatement(query);

            // Asignar valores
            consulta.setInt(1, turno.getNumeroFicha());
            consulta.setString(2, turno.getNombre());
            consulta.setString(3, turno.getTurno());
            consulta.setDate(4, new java.sql.Date(turno.getFecha().getTime()));
            consulta.setDouble(5, turno.getMontoCaja());
            consulta.setInt(6, idTurno);

            // Log de la consulta
            System.out.println("Consulta SQL: " + consulta);
            System.out.println("Valores asignados: Número ficha: " + turno.getNumeroFicha()
                    + ", Nombre: " + turno.getNombre()
                    + ", Turno: " + turno.getTurno()
                    + ", Fecha: " + turno.getFecha()
                    + ", Monto caja: " + turno.getMontoCaja()
                    + ", ID Turno: " + idTurno);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error en actualizar: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return respuesta;
    }

    public boolean existeTurno(String nombre, java.util.Date fecha) {
        boolean existe = false;
        Connection cn = null;
        try {
            // Conectar a la base de datos
            cn = conexion.Conexion.conectar();

            // Consulta SQL con parámetros
            String query = "SELECT COUNT(*) FROM tb_turnos WHERE nombre = ? AND fecha = ?";

            // Preparar la consulta
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, nombre);

            // Convertir java.util.Date a java.sql.Date
            java.sql.Date sqlFecha = new java.sql.Date(fecha.getTime());
            consulta.setDate(2, sqlFecha);

            // Ejecutar la consulta
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next() && resultado.getInt(1) > 0) {
                existe = true; // Si el conteo es mayor a 0, el turno existe
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar existencia de turno: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return existe;
    }

    // PRUEBA PARA EL MÉTODO ACTUALIZAR
    public void pruebaActualizarTurno() {
        Ctrl_Turno controlTurno = new Ctrl_Turno();

        // Crear objeto Turno con datos de prueba
        Turno turno = new Turno();
        turno.setIdTurno(3); // ID del registro existente
        turno.setNumeroFicha(43);
        turno.setNombre("Vale");
        turno.setTurno("Noche");  // Asumí que el campo "turno" es necesario
        turno.setMontoCaja(4000000);

        // Crear una fecha de prueba (por ejemplo, la fecha actual)
        java.util.Date fecha = new java.util.Date(); // Puedes cambiar esta fecha según sea necesario
        turno.setFecha(fecha);  // Asumimos que ahora `setFecha` acepta `java.util.Date`

        try {
            // Ejecutar el método actualizar
            boolean actualizado = controlTurno.actualizar(turno, turno.getIdTurno()); // Utiliza el ID del objeto directamente

            // Verificar resultado
            if (actualizado) {
                System.out.println("El turno fue actualizado correctamente.");
            } else {
                System.out.println("Hubo un error al actualizar el turno.");
            }
        } catch (Exception e) {
            // Capturar excepciones y mostrarlas
            System.out.println("Error al ejecutar la actualización: " + e.getMessage());
        }
    }

    // EJECUTAR EL MÉTODO ACTUALIZAR
    public static void main(String[] args) {
        // Llama al método de prueba
        new Ctrl_Turno().pruebaActualizarTurno();
    }
}
