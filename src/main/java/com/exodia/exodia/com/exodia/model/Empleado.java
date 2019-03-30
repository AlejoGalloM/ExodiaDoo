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

    public String getSeguro() {
        return seguro;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas += horasTrabajadas;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra += horasExtra;
    }

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
        this.comisiones = comisiones;
    }
}
