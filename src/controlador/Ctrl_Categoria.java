package controlador;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Categoria;
import java.sql.ResultSet;

/**
 *
 * @author caill
 */
public class Ctrl_Categoria {
//
    //METODO PARA REGISTRAR CATEGORIA

    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_categorias values(?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Categoria: " + e);
        }
        return respuesta;
    }

    //METODO PARA CONSULTAR SI EXISTE LA CATEGORIA
    public boolean existeCategoria(String categoria) {
        boolean respuesta = false;
        String sql = "select descripcion from tb_categorias where descripcion = '" + categoria + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar Categoria: " + e);
        }
        return respuesta;
    }

    //METODO PARA ACTUALIZAR CATEGORIA
    public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_categorias set descripcion =? where id_categoria='" + idCategoria + "'");
            consulta.setString(1, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Categoria: " + e);
        }
        return respuesta;
    }

    //METODO PARA ELIMINAR CATEGORIA
    public boolean eliminar(int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("delete from tb_categorias where id_categoria ='" + idCategoria + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar Categoria: " + e);
        }
        return respuesta;
    }

}
