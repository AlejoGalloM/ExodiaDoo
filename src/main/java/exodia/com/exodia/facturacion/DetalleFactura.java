package exodia.com.exodia.facturacion;

public class DetalleFactura {
    private double id;
    private Servicio servicio;

    public DetalleFactura(double id, Servicio servicio) {
        this.id = id;
        this.servicio= servicio;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Servicio getServicio() {
        return servicio;
    }
}
