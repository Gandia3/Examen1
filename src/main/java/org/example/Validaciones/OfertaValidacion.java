package org.example.Validaciones;

import org.example.Modelos.Oferta;

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
            throw new Exception("Digite la cantidad de caracteres permitidos");
        }

    }

    public Boolean validarFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaInicio.isAfter(fechaFin)==false && fechaFin.isEqual(fechaInicio)==false){
            return true;
        }else{
            throw new Exception("La fecha de inicio no puede ser mayor que la fecha fin");
        }

    }

    public <DateTimeFormatterException> Boolean validarFormatoFecha(String Fecha) throws Exception{

        try {
            LocalDate.parse(Fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return true;
        }catch (DateTimeParseException error ){
            throw new Exception("Las fechas deben ser en el formato dd/MM/YYYY");
        }




    }


}
