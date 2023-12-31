package org.example.Modelos;

import org.example.Validaciones.UsuarioValidacion;

public  class Usuario {

    private Integer id;
    private String documento;
    private String nombre;
    private String correoElectronico;
    private Integer ubicacion;

    private final Double IVA=0.19;

    private final Integer costoAnual=2000000;

    private UsuarioValidacion validacion=new UsuarioValidacion();

    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombre, String correoElectronico, Integer ubicacion, UsuarioValidacion validacion) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.ubicacion = ubicacion;
        this.validacion = validacion;
    }

    public Usuario(Integer id, String documento, String nombre, String correoElectronico, Integer ubicacion) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.validacion.validarNombres(nombre);
            this.nombre=nombre;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
       try {
           this.validacion.validarCorreo(correoElectronico);
           this.correoElectronico=correoElectronico;
       }catch (Exception error){
           System.out.println(error.getMessage());
       }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try{
            this.validacion.validarUbicacion(ubicacion); //si las validaciones se cumplen
            this.ubicacion=ubicacion;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

    }


    public Integer getCostoAnual() {
        return costoAnual;
    }

    public Double getIVA() {
        return IVA;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", ubicacion=" + ubicacion +
                ", validacion=" + validacion +
                '}';
    }


    //Metodos ordinarios
    //public abstract Double calcularAnualidad();



}
