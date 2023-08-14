package org.example.Modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    private Reserva reserva;

    @BeforeEach
    public void configuracionInicial(){this.reserva = new Reserva();}

    @Test
    public void setCorrectoNumeroPersonas(){
        Integer numeroPersonasValido =2;
        this.reserva.setReservaPersona(numeroPersonasValido);
        Assertions.assertEquals(numeroPersonasValido, reserva.getReservaPersona());
    }

    @Test
    public void setIncorrectoNumeroPersonas(){
        Integer numeroPersonasInvalido=6;
        this.reserva.setReservaPersona(numeroPersonasInvalido);
        Assertions.assertNotEquals(numeroPersonasInvalido, reserva.getReservaPersona());
    }

}