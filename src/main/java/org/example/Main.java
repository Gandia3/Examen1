package org.example;

import org.example.Modelos.Local;
import org.example.Modelos.Oferta;
import org.example.Modelos.Reserva;
import org.example.Modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Local local = new Local();
        Oferta oferta = new Oferta();
        Reserva reserva = new Reserva();

        System.out.print("****Bienvenido****");
        System.out.print("1: Recogiendo datos del usuario: ");
        System.out.print("Digita tu ID de usuario: ");
        usuario.setId(teclado.nextInt());
        teclado.nextLine();
        System.out.print("ingresa el numero de documento: ");
        usuario.setDocumento(teclado.nextLine());
        System.out.print("Digita tus nombres y apellidos: ");
        usuario.setNombre(teclado.nextLine());
        System.out.print("Digita tu correo electronico: ");
        usuario.setCorreoElectronico(teclado.nextLine());
        System.out.print("Ingresa tu ubicacion de residencia(1-4)(Zona centro, sur, norte y otras): ");
        usuario.setUbicacion(teclado.nextInt());


        //Local


        System.out.print("2. Datos del local: ");
        System.out.print("id");
        local.setId(teclado.nextInt());
        System.out.print("Ingresa el nit respectivo: ");
        local.setNit(teclado.nextLine());
        System.out.print("Digita el nombre del local: ");
        local.setNombre(teclado.nextLine());
        System.out.print("Ingresa tu ubicacion del local (1-4)(Zona centro, sur, norte y otras): ");
        local.setUbicacion(teclado.nextInt());
        teclado.nextLine();
        System.out.print("Ingrese una descripcion detallada del local: ");
        local.setDescripcion(teclado.nextLine());

        //Oferta

        System.out.print("3. Datos de la Oferta: ");
        System.out.print("Ingresa el titulo de la oferta: ");
        oferta.setTitulo(teclado.nextLine());
        System.out.print("Ingresa una descripcion detallada acerca de la oferta: ");
        oferta.setDescripcion(teclado.nextLine());
        System.out.print("Ingrese la fecha inicio de la oferta: ");
        oferta.setFechaInicio(teclado.nextLine());
        System.out.print("Ingrese la fecha fin de la oferta: ");
        oferta.setFechaFin(teclado.nextLine());
        System.out.print("Ingrese el valor que tiene la oferta por persona: ");
        oferta.setCostoPersona(teclado.nextDouble());
        System.out.print("IdLocal: ");
        oferta.setIdLocal(teclado.nextInt());


        //Reserva


        System.out.print("4. Datos de la Reserva");
        System.out.print("Id: ");
        reserva.setId(teclado.nextInt());
        System.out.print("IdUsuario: ");
        reserva.setIdUsuario(teclado.nextInt());
        System.out.print("IdOferta: ");
        reserva.setIdOferta(teclado.nextInt());
        System.out.print("Cual es el costo total de la reserva: ");
        reserva.setCostoTotal(teclado.nextDouble());
        teclado.nextLine();
        System.out.print("Cual es la fecha de reserva: ");
        reserva.setFechaReserva(teclado.nextLine());
        System.out.print("Cual es el numero de personas en la reserva: ");
        reserva.setReservaPersona(teclado.nextInt());


        
    }
}