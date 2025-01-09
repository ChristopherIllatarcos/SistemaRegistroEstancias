package controlador;

import com.mysql.jdbc.PreparedStatement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;
import java.sql.ResultSet;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Ctrl_Usuario {

    //METODO PARA NUEVO USUARIO
    public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            java.sql.PreparedStatement consulta = cn.prepareStatement("insert into tb_usuarios values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getContrasena());
            consulta.setString(6, objeto.getTelefono());
            consulta.setInt(7, objeto.getEstado());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Usuario: " + e);
        }
        return respuesta;
    }

    //METODO PARA CONSULTAR SI EL USUARIO YA ESTA REGISTRADO EN LA TABLA   
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from tb_usuarios where usuario = '" + usuario + "';";
        com.mysql.jdbc.Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = (com.mysql.jdbc.Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar Usuario: " + e);
        }
        return respuesta;
    }

    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Establecer la conexión
            cn = Conexion.conectar();

            // Generar el hash de la contraseña ingresada
            String hashedPassword = hashSHA256(objeto.getContrasena());

            // Consulta SQL segura con PreparedStatement
            String sql = "SELECT usuario, contrasena FROM tb_usuarios WHERE usuario = ? AND contrasena = ?";
            pst = (PreparedStatement) cn.prepareStatement(sql);
            pst.setString(1, objeto.getUsuario());
            pst.setString(2, hashedPassword);

            // Ejecutar la consulta
            rs = pst.executeQuery();

            // Procesar el resultado
            if (rs.next()) {
                respuesta = true;
                System.out.println("Inicio de sesión exitoso");
            }

        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");

        } finally {
            // Cerrar ResultSet, PreparedStatement y Connection para evitar fugas de memoria
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }

        return respuesta;

    }

    // Método para generar el hash SHA256
    private String hashSHA256(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al generar el hash SHA-256", e);
        }
    }

    //METODO PARA ACTUALIZAR USUARIO
    public boolean actualizar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            java.sql.PreparedStatement consulta = cn.prepareStatement("update tb_usuarios set nombre = ?, apellido = ?, usuario = ?, contrasena = ?, telefono = ?, estado = ? where idUsuario='" + idUsuario + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getUsuario());
            consulta.setString(4, objeto.getContrasena());
            consulta.setString(5, objeto.getTelefono());
            consulta.setInt(6, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Usuario: " + e);
        }
        return respuesta;
    }

    //METODO PARA ELIMINAR UN USUARIO
    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            java.sql.PreparedStatement consulta = cn.prepareStatement("delete from tb_usuarios where idUsuario='" + idUsuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar Usuario: " + e);
        }
        return respuesta;
    }

}
