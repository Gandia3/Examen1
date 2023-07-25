package org.example.Validaciones;

import org.example.Modelos.Reserva;
import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class ReservaValidacion {


    protected Util util = new Util();

    public ReservaValidacion() {
    }

    public Boolean formatoFecha(String fechaReserva) throws Exception {
        String expresionRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (!util.buscarCoincidencia(expresionRegular, fechaReserva)) {
            throw new Exception(Mensajes.FORMATO_FECHA_INCORRECTO.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarCantidadReserva(Integer reservaPersona) throws Exception {
        if (reservaPersona <= 4 && reservaPersona > 0) {
            return true;
        }
        throw new Exception(Mensajes.CANTIDAD_PERSONAS.getMensaje());
    }
}
