
package modelo;

/**
 *
 * @author caill
 */
public class CierreCaja {
    
    private int idCierreCaja;
    private String fecha;
    private String turno;
    private double ventas;
    private double subtotal;
    private double retiro;
    private double total_caja;
    private String observacion;

    public CierreCaja() {
    }

    public CierreCaja(int idCierreCaja, String fecha, String turno, double ventas, double subtotal, double retiro, double total_caja, String observacion) {
        this.idCierreCaja = idCierreCaja;
        this.fecha = fecha;
        this.turno = turno;
        this.ventas = ventas;
        this.subtotal = subtotal;
        this.retiro = retiro;
        this.total_caja = total_caja;
        this.observacion = observacion;
    }

    public int getIdCierreCaja() {
        return idCierreCaja;
    }

    public void setIdCierreCaja(int idCierreCaja) {
        this.idCierreCaja = idCierreCaja;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getTotal_caja() {
        return total_caja;
    }

    public void setTotal_caja(double total_caja) {
        this.total_caja = total_caja;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "CierreCaja{" + "idCierreCaja=" + idCierreCaja + ", fecha=" + fecha + ", turno=" + turno + ", ventas=" + ventas + ", subtotal=" + subtotal + ", retiro=" + retiro + ", total_caja=" + total_caja + ", observacion=" + observacion + '}';
    }
    
    
    
}
