package exodia.com.exodia.facturacion;

import exodia.com.exodia.model.Empleado;

public class Servicio {
    private String detalleServicio;
    private double duraciónEnHoras;
    private String idPersonaQueRealiza;
    private String idClienteAlQueRealiza;

    public Servicio(String detalleServicio, double duraciónEnHoras, String idPersonaQueRealiza, String idClienteAlQueRealiza){
        this.detalleServicio = detalleServicio;
        this.duraciónEnHoras = duraciónEnHoras;
        this.idPersonaQueRealiza = idPersonaQueRealiza;
        this.idClienteAlQueRealiza = idClienteAlQueRealiza;
    }

    public String getDetalleServicio() {
        return detalleServicio;
    }

    public double getDuraciónEnHoras() {
        return duraciónEnHoras;
    }

    public String getIdPersonaQueRealiza() {
        return idPersonaQueRealiza;
    }
}
