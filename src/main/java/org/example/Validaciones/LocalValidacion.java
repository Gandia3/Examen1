package org.example.Validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class LocalValidacion {
    protected Util util=new Util();

    public LocalValidacion() {
    }
    public Boolean validarNit( String nit ) throws  Exception {
        String exprecionRegular = "\\d+";

        if (!util.buscarCoincidencia(exprecionRegular,nit)){
            throw new Exception(Mensajes.NUMEROS_NIT_VALIDOS.getMensaje());
        } else if (nit.length()<10) {
            throw new Exception(Mensajes.CARACTERES_NIT_ESTABLECIDOS.getMensaje());
        }else{
            return true;
        }
    }

    public Boolean validarNombreEmpresa(String nombre)throws  Exception{
        if (nombre.length()<30){
            return true;
        }else {
            throw new Exception(Mensajes.CARACTERES_EMPRESA_ESTABLECIDOS.getMensaje());
        }
    }
}
