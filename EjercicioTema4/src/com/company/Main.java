package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
        //Agregaréis atributos tal cual tendrían esos objetos en la realidad.
        //Crear constructor vacío y con todos los parámetros para cada clase.
        //Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
        SmartPhone oSmartPhone = new SmartPhone();
        SmartPhone oSmartPhone1 = new SmartPhone("6g","15",2,true,220,2021,true,"iphone","Mac");
        SmartWatch oSmartWatch = new SmartWatch();
        SmartWatch oSmartWatch1 = new SmartWatch("Negro","Gris",6,true,"Cuero",12,2020,true,"Siaomi","Win");
        System.out.println(oSmartPhone1.toString());
        System.out.println(oSmartWatch1.toString());

        Scanner oScanner = new Scanner (System.in);
        System.out.println("ingrese marca del celular");
        oSmartPhone.marca=oScanner.next();
        System.out.println("Resistente al agua?");
        oSmartPhone.resiste=oScanner.hasNextBoolean();

        System.out.println("resiste agua? "+oSmartPhone.resiste);

        System.out.println("ingrese color de malla");
        oSmartWatch.malla=oScanner.next();
        System.out.println("Ingrese material");
        oSmartWatch.material= oScanner.next();
        System.out.println(oSmartWatch.corriente);

    }
}
