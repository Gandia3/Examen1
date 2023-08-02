package org.example.Validaciones;

import org.example.utilidades.Util;

public class AfiliadoValidaciones {

    private Util util= new Util();

    //valor de la membresia no puede ser menor a $20.000 ni puede ser mayor a $150.000 y la cedula del referido solo puede tener numeros

    public Boolean validarCostoMembresia(Integer costo) throws Exception{
        if (costo<20000 || costo>150000){
            throw new Exception("El costo de membresia es invalido: ");
        }else{
            return true;
        }
    }

    public Boolean validarDocumentoReferido(String documento) throws Exception{
        String expresionRegular = "^[a-zA-Z\s]+$";
        if (!this.util.buscarCoincidencia(expresionRegular,documento)){
            throw new Exception("El costo de membresia es: ");
        }else{
            return true;
        }
    }
}
