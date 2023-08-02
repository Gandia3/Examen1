package org.example.Modelos;

import org.example.utilidades.MetodosPago;

public class Afiliado extends Usuario{

    private Integer valorMembresia;
    private MetodosPago metodoPago;
    private String documentoReferido;



    public Afiliado() {
    }

    @Override
    public Double calcularAnualidad() {
        //costo anual y restar el 20% del alor
        return this.getCostoAnual()-(this.getValorMembresia()*0.2);

    }

    public Afiliado(Integer id, String documento, String nombre, String correoElectronico, Integer ubicacion, Integer valorMembresia, MetodosPago metodoPago, String documentoReferido) {
        super(id, documento, nombre, correoElectronico, ubicacion);
        this.valorMembresia = valorMembresia;
        this.metodoPago = metodoPago;
        this.documentoReferido = documentoReferido;
    }


    public Integer getValorMembresia() {
        return valorMembresia;
    }

    public void setValorMembresia(Integer valorMembresia) {
        this.valorMembresia = valorMembresia;
    }

    public MetodosPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodosPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDocumentoReferido() {
        return documentoReferido;
    }

    public void setDocumentoReferido(String documentoReferido) {
        this.documentoReferido = documentoReferido;
    }


    //metodos ordinarios
    public Double aplicarIvaMembresia(){
        return this.valorMembresia+this.getIVA()*this.valorMembresia;

    }

}
