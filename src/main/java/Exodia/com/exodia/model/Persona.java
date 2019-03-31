package Exodia.com.exodia.model;

import sun.util.calendar.BaseCalendar;

public class Persona {
    private String nombre;
    private String apellido;
    private String identificacion;
    private BaseCalendar.Date fechaNacimiento;

    public Persona(String nombre, String apellido, String identificacion, BaseCalendar.Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public BaseCalendar.Date getFechaNacimiento() {
        return fechaNacimiento;
    }
}
