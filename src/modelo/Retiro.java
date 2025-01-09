
package modelo;

/**
 *
 * @author caill
 */
public class Retiro {
    
    private int idRetiro;
    private String nombre;
    private double monto;
    private String obsaervacion;

    public Retiro() {
    }

    public Retiro(int idRetiro, String nombre, double monto, String obsaervacion) {
        this.idRetiro = idRetiro;
        this.nombre = nombre;
        this.monto = monto;
        this.obsaervacion = obsaervacion;
    }

    public int getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(int idRetiro) {
        this.idRetiro = idRetiro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getObsaervacion() {
        return obsaervacion;
    }

    public void setObsaervacion(String obsaervacion) {
        this.obsaervacion = obsaervacion;
    }

    @Override
    public String toString() {
        return "Retiro{" + "idRetiro=" + idRetiro + ", nombre=" + nombre + ", monto=" + monto + ", obsaervacion=" + obsaervacion + '}';
    }
    
    
    
}
