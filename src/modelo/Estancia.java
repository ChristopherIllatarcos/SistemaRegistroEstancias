package modelo;

/**
 *
 * @author caill
 */
public class Estancia {

    private int idEstancia;
    private String nombreCliente;
    private String patenteOIdentificacion;
    private int numeroSuite;
    private String horaLlegada;
    private int horas;
    private String ConsumoExtra;
    private double valorConsumoExtra;
    private double valorTotal;
    private String desayunoIncluido;
    private String observacion;

    public Estancia() {
    }

    public Estancia(int idEstancia, String nombreCliente, String patenteOIdentificacion, int numeroSuite, String horaLlegada, int horas, String ConsumoExtra, double valorConsumoExtra, double valorTotal, String desayunoIncluido, String observacion) {
        this.idEstancia = idEstancia;
        this.nombreCliente = nombreCliente;
        this.patenteOIdentificacion = patenteOIdentificacion;
        this.numeroSuite = numeroSuite;
        this.horaLlegada = horaLlegada;
        this.horas = horas;
        this.ConsumoExtra = ConsumoExtra;
        this.valorConsumoExtra = valorConsumoExtra;
        this.valorTotal = valorTotal;
        this.desayunoIncluido = desayunoIncluido;
        this.observacion = observacion;
    }

    public int getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPatenteOIdentificacion() {
        return patenteOIdentificacion;
    }

    public void setPatenteOIdentificacion(String patenteOIdentificacion) {
        this.patenteOIdentificacion = patenteOIdentificacion;
    }

    public int getNumeroSuite() {
        return numeroSuite;
    }

    public void setNumeroSuite(int numeroSuite) {
        this.numeroSuite = numeroSuite;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getConsumoExtra() {
        return ConsumoExtra;
    }

    public void setConsumoExtra(String ConsumoExtra) {
        this.ConsumoExtra = ConsumoExtra;
    }

    public double getValorConsumoExtra() {
        return valorConsumoExtra;
    }

    public void setValorConsumoExtra(double valorConsumoExtra) {
        this.valorConsumoExtra = valorConsumoExtra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDesayunoIncluido() {
        return desayunoIncluido;
    }

    public void setDesayunoIncluido(String desayunoIncluido) {
        this.desayunoIncluido = desayunoIncluido;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Estancia{" + "idEstancia=" + idEstancia + ", nombreCliente=" + nombreCliente + ", patenteOIdentificacion=" + patenteOIdentificacion + ", numeroSuite=" + numeroSuite + ", horaLlegada=" + horaLlegada + ", horas=" + horas + ", ConsumoExtra=" + ConsumoExtra + ", valorConsumoExtra=" + valorConsumoExtra + ", valorTotal=" + valorTotal + ", desayunoIncluido=" + desayunoIncluido + ", observacion=" + observacion + '}';
    }

    
}
