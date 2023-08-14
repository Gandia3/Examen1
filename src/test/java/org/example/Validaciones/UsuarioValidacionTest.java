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
    public void validarNombreUsuarioIncorrectoNumeros(){
        String nombreInvalido="Juan 1723 Garcia";//Preparando
        //Ejecuto y verifico
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarNombreUsuarioIncorrectoCorto(){
        String nombreInvalido="Ju";//Preparando
        //Ejecuto y verifico
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_MUY_CORTO.getMensaje(),exception.getMessage());
    }

    @Test
    public void validarCorreoElectronicoCorrecto(){
        String correoValido="juanjose@gmail.com";
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(correoValido));
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validarCorreo(correoValido));

    }



    @Test
    public void validarCorreoElectronicoIncorrecto(){
        String correoInvalido="juanjose.com";
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(correoInvalido));
        Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarCorreo(correoInvalido));
    }



}