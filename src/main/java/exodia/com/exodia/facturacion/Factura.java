package exodia.com.exodia.facturacion;

import exodia.com.exodia.model.Cliente;

public class Factura {
    private double idFactura;
    private DetalleFactura detalleFactura;
    private int valor;

    public Factura(double idFactura, DetalleFactura detalleFactura) {
        this.idFactura = idFactura;
        this.detalleFactura = detalleFactura;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getIdFactura() {
        return idFactura;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

}
