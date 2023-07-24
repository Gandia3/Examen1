package org.example.Validaciones;

import org.example.Modelos.Oferta;
import org.example.utilidades.Mensajes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class OfertaValidacion {

    protected Oferta oferta=new Oferta();

    public OfertaValidacion() {
    }


    public Boolean validarTitulo( String Titulo ) throws Exception {

        if (Titulo.length() < 20) {
            return true;
        } else {
            throw new Exception(Mensajes.TITULO_CARACTERES_INVALIDOS.getMensaje());
        }

    }

    public Boolean validarFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaInicio.isAfter(fechaFin)){
            return true;
        }else{
            throw new Exception(Mensajes.FECHAINICIO_MAYOR_FECHAFIN.getMensaje());
        }

    }

    public <DateTimeFormatterException> Boolean validarFormatoFecha(String Fecha) throws Exception{

        try {
            LocalDate.parse(Fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return true;
        }catch (DateTimeParseException error ){
            throw new Exception(Mensajes.FORMATOFECHA_ESTABLECIDO.getMensaje());
        }

    }

    public Boolean validarCosto (Double costoTotal) throws Exception {
        if (costoTotal <0 ){
            throw new Exception(Mensajes.VALOR_COSTOS.getMensaje());
        }
        return true;
    }





}
