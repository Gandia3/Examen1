package org.example.Validaciones;

import org.junit.jupiter.api.Test;
import org.example.Modelos.Oferta;
import org.example.utilidades.Mensajes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import static org.junit.jupiter.api.Assertions.*;

public class OfertaValidacionTest {

    @Test
    public void ValidarTituloCorrecto() throws Exception {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertTrue(ofertaValidacion.validarTitulo("Titulo corto"));
    }

    @Test
    public void ValidarTituloIncorrecto() {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertThrows(Exception.class, () -> ofertaValidacion.validarTitulo("Este titulo es muy largo, no puede exceder los 20 caracteres"), "Exception should be thrown for invalid input");
    }

    @Test
    public void ValidarFechasCorrecta() throws Exception {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        LocalDate fechaInicio = LocalDate.parse("2023-08-01");
        LocalDate fechaFin = LocalDate.parse("2023-08-10");
        assertTrue(ofertaValidacion.validarFechas(fechaInicio, fechaFin));
    }

    @Test
    public void ValidarFechasIncorrecta() {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        LocalDate fechaInicio = LocalDate.parse("2023-08-10");
        LocalDate fechaFin = LocalDate.parse("2023-08-01");
        assertThrows(Exception.class, () -> ofertaValidacion.validarFechas(fechaInicio, fechaFin), "El formato fecha es invalido");
    }

    @Test
    public void ValidarFormatoFechaCorrecto() throws Exception {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertTrue(ofertaValidacion.validarFormatoFecha("15/08/2023"));
    }

    @Test
    public void ValidarFormatoFechaInorrecto() {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertThrows(Exception.class, () -> ofertaValidacion.validarFormatoFecha("27 de junio de 2023"), "");
    }

    @Test
    public void ValidarCostoCorrecto() throws Exception {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertTrue(ofertaValidacion.validarCosto(100.0));
    }

    @Test
    public void ValidarCostoIncorrecto() {
        OfertaValidacion ofertaValidacion = new OfertaValidacion();
        assertThrows(Exception.class, () -> ofertaValidacion.validarCosto(-50.0), "");
    }
}
