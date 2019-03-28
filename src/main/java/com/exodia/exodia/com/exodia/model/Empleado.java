package com.exodia.exodia.com.exodia.model;

import sun.util.calendar.BaseCalendar;


public class Empleado extends Persona {

    private String seguro;
    private double horasTrabajadas;
    private double horasExtra;
    private double pagoHora;
    private double comisiones;

    public Empleado(String nombre, String apellido, String identificacion, BaseCalendar.Date fechaNacimiento, String seguro, double horasTrabajadas, double horasExtra, double pagoHora, double comisiones) {
        super(nombre, apellido, identificacion, fechaNacimiento);
        this.seguro = seguro;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
        this.pagoHora = pagoHora;
        this.comisiones = comisiones;
    }
}
