package modelo;

import java.util.Date;

/**
 *
 * @author caill
 */
import java.util.Date;

public class Turno {

    private int idTurno;
    private int numeroFicha;
    private String nombre;
    private String turno;
    private Date fecha;  
    private double montoCaja;

    public Turno() {
    }

    public Turno(int idTurno, int numeroFicha, String nombre, String turno, Date fecha, double montoCaja) {
        this.idTurno = idTurno;
        this.numeroFicha = numeroFicha;
        this.nombre = nombre;
        this.turno = turno;
        this.fecha = fecha;
        this.montoCaja = montoCaja;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public int getNumeroFicha() {
        return numeroFicha;
    }

    public void setNumeroFicha(int numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getFecha() {
        return fecha;  // Cambiado a Date
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;  // Cambiado a Date
    }

    public double getMontoCaja() {
        return montoCaja;
    }

    public void setMontoCaja(double montoCaja) {
        this.montoCaja = montoCaja;
    }

    @Override
    public String toString() {
        return "Turno{" + "idTurno=" + idTurno + ", numeroFicha=" + numeroFicha + ", nombre=" + nombre + ", turno=" + turno + ", fecha=" + fecha + ", montoCaja=" + montoCaja + '}';
    }
}
