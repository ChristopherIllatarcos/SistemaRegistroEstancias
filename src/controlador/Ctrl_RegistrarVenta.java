package controlador;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.CabeceraVenta;
import java.sql.ResultSet;
import modelo.DetalleVenta;

/**
 *
 * @author caill
 */
public class Ctrl_RegistrarVenta {

    //Ultimo id de la canbecera
    public static int idCabeceraRegistrada;
    java.math.BigDecimal idColvar;

    //METODO PARA GUARDARLA CABECERA DE VENTAS
    public boolean guardar(CabeceraVenta objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_cabecera_venta values(?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getIdEstancia());
            consulta.setDouble(3, objeto.getValorPagar());
            consulta.setString(4, objeto.getFechaVenta());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            ResultSet rs = consulta.getGeneratedKeys();
            while (rs.next()) {
                idColvar = rs.getBigDecimal(1);
                idCabeceraRegistrada = idColvar.intValue();
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cabecera de venta: " + e);
        }
        return respuesta;
    }

    //METODO PARA GUARDAR EL DETALLE DE VENTA
    public boolean guardarDetalle(DetalleVenta objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_detalle_ventas1 values(?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getIdCabeceraVenta());
            consulta.setInt(3, objeto.getIdProducto());
            consulta.setInt(4, objeto.getCanitdad());
            consulta.setDouble(5, objeto.getPrecioUnitario());
            consulta.setDouble(6, objeto.getSubTotal());
            consulta.setDouble(7, objeto.getDescuento());
            consulta.setDouble(8, objeto.getIva());
            consulta.setDouble(9, objeto.getTotalPagar());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de venta: " + e);
        }
        return respuesta;
    }

    //METODO PARA ACTUALIZAR PRODUCTO
    public boolean actualizar(CabeceraVenta objeto, int idCabeceraVenta) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_cabecera_venta set id_estancia = ? where id_cabecera_Venta ='" + idCabeceraVenta + "'");
            consulta.setInt(1, objeto.getIdEstancia());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cabecera de ventas: " + e);
        }
        return respuesta;
    }

}
