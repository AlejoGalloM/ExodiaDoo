package exodia.com.exodia.model;

import exodia.com.exodia.facturacion.Servicio;
import sun.util.calendar.BaseCalendar;

import java.util.ArrayList;


public class Empleado extends Persona {

    private String seguro;
    private double horasTrabajadas;
    private double horasExtra;
    private double pagoHora;
    private double pagoHoraExtra;
    private double comisiones;
    private ArrayList<Servicio> trabajosRealizados;

    public Empleado(String nombre, String apellido, String identificacion, BaseCalendar.Date fechaNacimiento,
                    String seguro, double horasTrabajadas, double horasExtra, double pagoHora, double pagoHoraExtra) {
        super(nombre, apellido, identificacion, fechaNacimiento);
        this.seguro = seguro;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
        this.pagoHora = pagoHora;
        this.pagoHoraExtra = pagoHoraExtra;
        this.comisiones = comisiones;
    }

    public void agregarTrabajoRealizado(Servicio trabajoRealizado){
        if(trabajosRealizados == null){
            trabajosRealizados= new ArrayList<>();
            trabajosRealizados.add(trabajoRealizado);
        }else{
            trabajosRealizados.add(trabajoRealizado);
        }
    }

    public void realizarFacturación(){

    }

    public double getPagoHoraExtra() { return pagoHoraExtra; }

    public String getSeguro() {return seguro; }

    public double getHorasTrabajadas() { return horasTrabajadas; }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas += horasTrabajadas;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) { this.horasExtra += horasExtra; }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones += comisiones;
    }
}
