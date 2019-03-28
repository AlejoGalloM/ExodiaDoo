package com.exodia.exodia.com.exodia.facturacion;

import com.exodia.exodia.com.exodia.model.Cliente;

public class Factura {
    private double idFactura;
    private Cliente cliente;
    private String detalleFactura;

    public Factura(double idFactura, Cliente cliente, String detalleFactura) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.detalleFactura = detalleFactura;
    }

    public double getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(double idFactura) {
        this.idFactura = idFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(String detalleFactura) {
        this.detalleFactura = detalleFactura;
    }
}
