package modelo;

/**
 *
 * @author caill
 */
public class CabeceraVenta {

    //Atributos
    private int idCabeceraVenta;
    private int idEstancia; // idCliente
    private double valorPagar;
    private String fechaVenta;

    public CabeceraVenta() {
    }

    public CabeceraVenta(int idCabeceraVenta, int idEstancia, double valorPagar, String fechaVenta) {
        this.idCabeceraVenta = idCabeceraVenta;
        this.idEstancia = idEstancia;
        this.valorPagar = valorPagar;
        this.fechaVenta = fechaVenta;
    }

    public int getIdCabeceraVenta() {
        return idCabeceraVenta;
    }

    public void setIdCabeceraVenta(int idCabeceraVenta) {
        this.idCabeceraVenta = idCabeceraVenta;
    }

    public int getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "CabeceraVenta{" + "idCabeceraVenta=" + idCabeceraVenta + ", idEstancia=" + idEstancia + ", valorPagar=" + valorPagar + ", fechaVenta=" + fechaVenta + '}';
    }
    
    

}
