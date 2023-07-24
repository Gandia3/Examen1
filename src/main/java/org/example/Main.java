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

        System.out.println("****Bienvenido****");
        System.out.println("1: Recogiendo datos del usuario: ");
        System.out.print("Digita tus nombres y apellidos: ");
        usuario.setNombre(teclado.nextLine());
        System.out.print("Digita tu correo electronico: ");
        usuario.setCorreoElectronico(teclado.nextLine());
        System.out.println("Ingresa tu ubicacion de residencia(1-4)(Zona centro, sur, norte y otras): ");
        usuario.setUbicacion(teclado.nextInt());
        System.out.println("2. Datos del local");
        System.out.println("id");
        local.setId(teclado.nextInt());
        System.out.println("Ingresa el nit respectivo");






    }
}