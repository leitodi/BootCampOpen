package com.company.Interfaces;

import com.company.Coche;

import java.awt.*;
import java.util.Scanner;

public class InterfacesMain {
    public static void main(String[] args) {


        CocheService service = new CocheServiceClasicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Coche coche1 = service.crearcocheDemo();
        Coche coche2 = service2.crearcocheDemo();
        Scanner oScanner = new Scanner(System.in);
        System.out.println("introduce un nombre");
        String nombre= oScanner.nextLine();
        System.out.println("introduce un numero");
        int numero= oScanner.nextInt();

        System.out.println("el nombre es "+ nombre);
        System.out.println("el numero es "+ numero);
    }
}
