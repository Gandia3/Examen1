package org.example.Validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //1.PREPARANDO
    //Probando el objeto usuario validacion
    private UsuarioValidacion usuarioValidacion;

    @BeforeEach
    public void setUp(){
        this.usuarioValidacion=new UsuarioValidacion();
    }

    @Test
    public void validarNombreUsuarioCorrecto(){
        String nombreValido="Juan Jose Garcia";//Preparando
        //Ejecuto y verifico
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validarNombres(nombreValido));

    }

    @Test
    public void validarNombreUsuarioIncorrecto(){
        String nombreInvalido="Juan 1723 Garcia";//Preparando
        //Ejecuto y verifico
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje(),exception.getMessage());
    }

}