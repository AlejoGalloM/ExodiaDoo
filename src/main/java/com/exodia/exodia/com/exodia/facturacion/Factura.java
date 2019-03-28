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
}
