package exodia.com.exodia.model;

import exodia.com.exodia.facturacion.Factura;
import exodia.com.exodia.facturacion.Servicio;
import sun.util.calendar.BaseCalendar;

import java.util.ArrayList;

public class Cliente extends Persona {
    private BaseCalendar.Date fechaRegistro;
    private ArrayList<Factura> trabajosQueLeHanRealizado;

    public Cliente(String nombre, String apellido, String identificacion, BaseCalendar.Date fechaNacimiento, BaseCalendar.Date fechaRegistro) {
        super(nombre, apellido, identificacion, fechaNacimiento);
        this.fechaRegistro = fechaRegistro;
    }

    public BaseCalendar.Date getFechaRegistro() {
        return fechaRegistro;
    }

    public ArrayList<Factura> getTrabajosQueLeHanRealizado() {
        return trabajosQueLeHanRealizado;
    }

    public void agregartrabajos( Factura trabajo){
        trabajosQueLeHanRealizado.add(trabajo);
    }
}

