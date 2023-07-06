package org.example.Modelos;

public class Usuario {

    private Integer id;
    private String documento;
    private String nombre;
    private String correoElectronico;
    private Integer ubicacion;

    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombre, String correoElectronico, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.ubicacion = ubicacion;
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
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }
}
