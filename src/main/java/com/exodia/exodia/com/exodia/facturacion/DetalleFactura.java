package com.exodia.exodia.com.exodia.facturacion;

public class DetalleFactura {
    private double id;
    private Factura factura;

    public DetalleFactura(double id, Factura factura) {
        this.id = id;
        this.factura = factura;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
