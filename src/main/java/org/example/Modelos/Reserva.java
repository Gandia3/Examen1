package org.example.Modelos;

import java.time.LocalDate;

import org.example.utilidades.Util;
import org.example.Validaciones.ReservaValidacion;

public class Reserva {

    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;

    private Integer reservaPersona;

    private ReservaValidacion validacion = new ReservaValidacion();

    private Util util = new Util();

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario,Integer reservaPersona , Integer idOferta, Double costoTotal, LocalDate fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.reservaPersona = reservaPersona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
       try {
           this.validacion.formatoFecha(fechaReserva);
           LocalDate fechaLocalDate = util.formatearFechaStringLocalDate(fechaReserva,"dd/MM/yyyy");
           this.fechaReserva = fechaLocalDate;
       }
       catch (Exception error){
           System.out.println(error.getMessage());
       }
    }


    public Integer getReservaPersona() {
        return reservaPersona;
    }

    public void setReservaPersona(Integer reservaPersona) {
        try {
            this.validacion.validarCantidadReserva(reservaPersona);
            this.reservaPersona = reservaPersona;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idOferta=" + idOferta +
                ", costoTotal=" + costoTotal +
                ", fechaReserva=" + fechaReserva +
                '}';
    }
}
