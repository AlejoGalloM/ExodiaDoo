package Exodia.com.exodia.model;

import sun.util.calendar.BaseCalendar;

public class Cliente extends Persona {
    private BaseCalendar.Date fechaRegistro;

    public Cliente(String nombre, String apellido, String identificacion, BaseCalendar.Date fechaNacimiento, BaseCalendar.Date fechaRegistro) {
        super(nombre, apellido, identificacion, fechaNacimiento);
        this.fechaRegistro = fechaRegistro;
    }

    public BaseCalendar.Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(BaseCalendar.Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

