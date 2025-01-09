package controlador;

import conexion.Conexion;
import modelo.Producto;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author caill
 */
public class Ctrl_Producto {

    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "INSERT INTO tb_productos (nombre_producto, cantidad, pedido, entrega, precio, descripcion, porcentaje_iva, id_categoria, observacion) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, objeto.getNombreProducto());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setInt(3, objeto.getPedido());
            consulta.setInt(4, objeto.getEntrega());
            consulta.setDouble(5, objeto.getPrecio());
            consulta.setString(6, objeto.getDescripcion());
            consulta.setInt(7, objeto.getPorcentajeIva());
            consulta.setInt(8, objeto.getIdCategoria());
            consulta.setString(9, objeto.getObservacion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Inserción exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }
        return respuesta;
    }

    public ArrayList<Producto> buscar(String criterio) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "SELECT * FROM tb_productos WHERE nombre_producto LIKE ? OR descripcion LIKE ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, "%" + criterio + "%"); // Búsqueda parcial por nombre
            consulta.setString(2, "%" + criterio + "%"); // Búsqueda parcial por descripción

            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(resultado.getInt("id_producto"));
                producto.setNombreProducto(resultado.getString("nombre_producto"));
                producto.setCantidad(resultado.getInt("cantidad"));
                producto.setPedido(resultado.getInt("pedido"));
                producto.setEntrega(resultado.getInt("entrega"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setDescripcion(resultado.getString("descripcion"));
                producto.setPorcentajeIva(resultado.getInt("porcentaje_iva"));
                producto.setIdCategoria(resultado.getInt("id_categoria"));
                producto.setObservacion(resultado.getString("observacion"));
                listaProductos.add(producto);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar productos: " + e);
        }
        return listaProductos;
    }

    public boolean actualizar(Producto objeto, int idProducto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "UPDATE tb_productos SET nombre_producto = ?, cantidad = ?, pedido = ?, entrega = ?, precio = ?, descripcion = ?, "
                    + "porcentaje_iva = ?, id_categoria = ?, observacion = ? WHERE id_producto = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, objeto.getNombreProducto());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setInt(3, objeto.getPedido());
            consulta.setInt(4, objeto.getEntrega());
            consulta.setDouble(5, objeto.getPrecio());
            consulta.setString(6, objeto.getDescripcion());
            consulta.setInt(7, objeto.getPorcentajeIva());
            consulta.setInt(8, objeto.getIdCategoria());
            consulta.setString(9, objeto.getObservacion());
            consulta.setInt(10, idProducto);

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Actualización exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        }
        return respuesta;
    }

    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            String query = "DELETE FROM tb_productos WHERE id_producto = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setInt(1, idProducto);

            if (consulta.executeUpdate() > 0) {
                respuesta = true; // Eliminación exitosa
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }
        return respuesta;
    }
    
        //METODO PARA ACRTUALIZAR STOCK 
    public boolean actualizarStock(Producto object, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_productos set cantidad=? where id_producto ='" + idProducto + "'");
            consulta.setInt(1, object.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar Stock: " + e);
        }
        return respuesta;
    }

//    public boolean existeProducto(String nombreProducto) {
//        boolean existe = false;
//        Connection cn = conexion.Conexion.conectar();
//        try {
//            String query = "SELECT COUNT(*) FROM tb_productos WHERE nombre_producto = ?";
//            PreparedStatement consulta = cn.prepareStatement(query);
//            consulta.setString(1, nombreProducto);
//
//            ResultSet resultado = consulta.executeQuery();
//            if (resultado.next() && resultado.getInt(1) > 0) {
//                existe = true; // Si el conteo es mayor a 0, el producto existe
//            }
//            cn.close();
//        } catch (SQLException e) {
//            System.out.println("Error al verificar existencia de producto: " + e);
//        }
//        return existe;
//    }
}
