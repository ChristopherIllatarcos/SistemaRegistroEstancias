package conexion;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author caill
 */
public class Conexion {

    //conexión local
    public static Connection conectar() {

        try {

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_motelTantra?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "admin");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local" + e);
        }
        return null;
    }

}
