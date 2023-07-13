package org.example.Validaciones;

import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    protected Util util = new Util();

    public UsuarioValidacion() {
    }

    //metodos ordinarios para validar datos

    public Boolean validarNombres(String nombres) throws Exception {
        String expresionRegular = " ^[a-zA-Z]+$ ";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombres);

        if (!util.buscarCoincidencia(expresionRegular, nombres)) {
            throw new Exception("Señor, su nombre debe contener solo letras");
        } else if (nombres.length() < 10) {
            throw new Exception("Señor usuario es muy pequeña la cantidad de caracteres");
        } else {
            return true;
        }
    }

    public Boolean validarCorreo(String correoElectronico) throws Exception {
        String expresionRegular = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@\"\n" + "+ \"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (!util.buscarCoincidencia(expresionRegular, correoElectronico)) {


            throw new Exception("Señor, su correo no es valido");
        } else {
            return true;
        }
    }

    public Boolean validarUbicacion(Integer ubicacion) throws Exception{
        if (ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4)) {
            return true;
        } else {
            throw new Exception("sU UBICACION  NO ES VALIDA");
        }

    }

}





