package org.example.Modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario usuario;


    @BeforeEach
    public void setUp(){
        this.usuario= new Usuario();
    }

    @Test
    public void setCorrectoNombres(){
        String nombreValido="Juan Jose Garcia";//Preparar
        this.usuario.setNombre(nombreValido);//Ejecutar
        Assertions.assertEquals(nombreValido,usuario.getNombre());
    }

    @Test
    public void setIncorrectoNombres(){
        String nombreInvalido="Juan1123 Garcia";//Preparar
        this.usuario.setNombre(nombreInvalido);//Ejecutar
        Assertions.assertNotEquals(nombreInvalido,usuario.getNombre());
    }

}