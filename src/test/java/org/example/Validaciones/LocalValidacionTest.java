package org.example.Validaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LocalValidacionTest {

    @Test
    public void ValidarNit() throws Exception {
        LocalValidacion localValidacion = new LocalValidacion();
        assertTrue(localValidacion.validarNit("1234567890"));
    }

    @Test
    public void ValidarNitIncorrecto() {
        LocalValidacion localValidacion = new LocalValidacion();
        assertThrows(Exception.class, () -> localValidacion.validarNit("12345"), "Exception should be thrown for invalid input");
    }

    @Test
    public void ValidarNombreEmpresaCorrecto() throws Exception {
        LocalValidacion localValidacion = new LocalValidacion();
        assertTrue(localValidacion.validarNombreEmpresa("Example Company"));
    }

    @Test
    public void ValidarNombreEmpresaIncorrecto() {
        LocalValidacion localValidacion = new LocalValidacion();
        assertThrows(Exception.class, () -> localValidacion.validarNombreEmpresa("A Very Long Name for a Company"), "Exception should be thrown for invalid input");
    }

    @Test
    public void ValidarUbicacionCorrecto() throws Exception {
        LocalValidacion localValidacion = new LocalValidacion();
        assertTrue(localValidacion.validarUbicacion(1));
    }

    @Test
    public void ValidarUbicacionCorrector() {
        LocalValidacion localValidacion = new LocalValidacion();
        assertThrows(Exception.class, () -> localValidacion.validarUbicacion(5), "Exception should be thrown for invalid input");
    }
}
