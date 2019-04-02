package exodia.com.exodia.gestiones;

import exodia.com.exodia.facturacion.DetalleFactura;
import exodia.com.exodia.facturacion.Servicio;
import exodia.com.exodia.model.Cliente;
import exodia.com.exodia.model.Empleado;
import exodia.com.exodia.model.Persona;
import sun.util.calendar.BaseCalendar;

import java.util.ArrayList;

public class Administrador extends Empleado {
    private String claveDeSeguridad;
    private ArrayList<Empleado> listaEmpleados;

    public Administrador(String nombre, String apellido, String identificacion, BaseCalendar.Date fechaNacimiento,
                         String seguro, double horasTrabajadas, double horasExtra, double pagoHora, double pagoHoraExtra, String clave) {
        super(nombre, apellido, identificacion, fechaNacimiento, seguro, horasTrabajadas, horasExtra, pagoHora, pagoHoraExtra);
        this.claveDeSeguridad= clave;
    }

    public boolean registrarEmpleado(Empleado empleado){
        boolean registroExitoso = false;
        if(listaEmpleados==null){
            listaEmpleados = new ArrayList<>();
            listaEmpleados.add(empleado);
            registroExitoso=true;
        }else{
            listaEmpleados.add(empleado);
            registroExitoso=true;
        }
        return registroExitoso;
    }

    public String realizarPagos(){
        String pago= "";
        if(listaEmpleados!=null){
            pago=Pago.calcularPagos(listaEmpleados);
        }else{
            pago="Aún no se encuentran empleados registrados";
        }
        return pago;
    }

    public String agregarComisionEmpleado(String idEmpleado, double comision ){
        String comisionExitosa="";
        if(listaEmpleados!=null){
            for (Empleado empleado: listaEmpleados) {
                if(empleado.getIdentificacion()==idEmpleado){
                    empleado.setComisiones(comision);
                    comisionExitosa= "La comisión se ha registrado exitosamente";
                }
            }
        }else{
            comisionExitosa="Aún no se encuentran empleados registrados";
        }
            return comisionExitosa;
        }

    @Override
    public void agregarTrabajoRealizado(Servicio trabajoRealizado) {
        super.agregarTrabajoRealizado(trabajoRealizado);
    }

    @Override
    public void realizarFacturación(DetalleFactura trabajoAFacturar, Cliente cliente, double idfactura) {
        super.realizarFacturación(trabajoAFacturar, cliente, idfactura);
    }
}

