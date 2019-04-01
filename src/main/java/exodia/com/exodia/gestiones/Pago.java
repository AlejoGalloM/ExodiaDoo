package exodia.com.exodia.gestiones;
import exodia.com.exodia.model.Empleado;

import java.util.ArrayList;

public class Pago {

    public static String calcularPagos(ArrayList<Empleado> empleado ){
        String listaPagos="";
        for (Empleado empleadoApagar: empleado) {
            double valorPago = (empleadoApagar.getPagoHora()* empleadoApagar.getHorasTrabajadas()) +
                    (empleadoApagar.getHorasExtra() * empleadoApagar.getPagoHoraExtra()) + empleadoApagar.getComisiones();
            listaPagos = "Nombre Empleado: " + empleadoApagar.getNombre() + "  Pago:  " + valorPago + " \n";
        }
        return listaPagos;
    }
}
