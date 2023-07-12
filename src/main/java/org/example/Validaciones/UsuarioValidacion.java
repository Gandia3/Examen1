package org.example.Validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    public UsuarioValidacion() {
    }

    //metodos ordinarios para validar datos

    public Boolean validarNombres(String nombres)throws Exception{
        String expresionRegular=" ^[a-zA-Z]+$ ";
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(nombres);

        if(coincidencia.matches()){
            throw new Exception("Señor, su nombre debe contener solo letras");
        }else if (nombres.length()<10){
            throw new Exception("Señor usuario es muy pequeña la cantidad de caracteres");

        }else {
            return true;
        }
    }

}




