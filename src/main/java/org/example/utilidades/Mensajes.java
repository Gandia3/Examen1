package org.example.utilidades;

public enum Mensajes {

    NOMBRE_SOLO_LETRAS("Señor, su nombre debe contener solo letras"),
    NOMBRE_MUY_CORTO("Señor usuario es muy pequeña la cantidad de caracteres"),
    CORREO_INVALIDO("Señor, su correo no es valido"),
    ZONA_INVALIDA("su ubicacion no es valida"),
    NUMEROS_NIT_VALIDOS("Porfavor digite los datos validos"),
    CARACTERES_NIT_ESTABLECIDOS("Digite el numero de caracteres establecidos"),
    CARACTERES_EMPRESA_ESTABLECIDOS("Digite el numero de caracteres establecidos"),
    TITULO_CARACTERES_INVALIDOS("Digite la cantidad de caracteres permitidos"),
    FECHAINICIO_MAYOR_FECHAFIN("La fecha de inicio no puede ser mayor que la fecha fin"),
    FORMATOFECHA_ESTABLECIDO("Las fechas deben ser en el formato dd/MM/YYYY"),
    VALOR_COSTOS ("El valor del costo por persona no puede ser negativo");


    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}

