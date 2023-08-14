package org.example.Modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalTest {
    private Local local;

    @BeforeEach
    public void configuracionInicial(){
        this.local= new Local();
    }
    @Test
    public void setCorrectoNit(){
        String nitValido="0101001000";
        this.local.setNit(nitValido);
        Assertions.assertEquals(nitValido, local.getNit());
    }

    @Test
    public void setIncorrectoNit(){
        String nitInvalido="0110101010101010101010";
        this.local.setNit(nitInvalido);
        Assertions.assertNotEquals(nitInvalido, local.getNit());
    }

    @Test
    public void setCorrectoNombreEmpresa(){
        String nombreEmpresaValido = "EA Sport";
        this.local.setNombre(nombreEmpresaValido);
        Assertions.assertEquals(nombreEmpresaValido, local.getNombre());
    }

    @Test
    public void setIncorrectoNombreEmpresa(){
        String nombreEmpresaInvalido = "EA sport in the game a lot of people in the pitch";
        this.local.setNombre(nombreEmpresaInvalido);
        Assertions.assertNotEquals(nombreEmpresaInvalido, local.getNombre());
    }
}