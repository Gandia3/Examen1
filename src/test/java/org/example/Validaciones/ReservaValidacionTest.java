package org.example.Validaciones;

import org.junit.jupiter.api.Test;
import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaValidacionTest {

    @Test
    public void FormatoFechaCorrecto() throws Exception {
        ReservaValidacion reservaValidacion = new ReservaValidacion();
        assertTrue(reservaValidacion.formatoFecha("15/08/2023"));
    }

    @Test
    public void FormatoFechaIncorrecto() {
        ReservaValidacion reservaValidacion = new ReservaValidacion();
        assertThrows(Exception.class, () -> reservaValidacion.formatoFecha("2023-08-15"), "");
    }

    @Test
    public void testValidarCantidadReserva_ValidInput_ReturnsTrue() throws Exception {
        ReservaValidacion reservaValidacion = new ReservaValidacion();
        assertTrue(reservaValidacion.validarCantidadReserva(3));
    }

    @Test
    public void testValidarCantidadReserva_InvalidInput_ThrowsException() {
        ReservaValidacion reservaValidacion = new ReservaValidacion();
        assertThrows(Exception.class, () -> reservaValidacion.validarCantidadReserva(5), "");
    }
}
