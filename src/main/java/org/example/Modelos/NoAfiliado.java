package org.example.Modelos;

public class NoAfiliado extends Usuario{


    private Integer numeroReserva;

    public NoAfiliado() {
    }




    public NoAfiliado(Integer id, String documento, String nombre, String correoElectronico, Integer ubicacion, Integer numeroReserva) {
        super(id, documento, nombre, correoElectronico, ubicacion);
        this.numeroReserva = numeroReserva;
    }

    public Integer getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(Integer numeroReserva) {
        this.numeroReserva = numeroReserva;
    }
}
