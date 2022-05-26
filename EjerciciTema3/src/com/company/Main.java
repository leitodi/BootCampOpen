package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
    //Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
    //String[] nombres = {"", "", "", ""}

        Scanner oScanner = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String nombre = oScanner.next();

        System.out.println("Ingrese apellido");
        String apellido = oScanner.next();

        System.out.println("Ingrese edad");
        int edad = oScanner.nextInt();

        System.out.println("Ingrese calle");
        String dom = oScanner.next();
        //Integer.toString(edad)

        String array []={nombre,apellido,Integer.toString(edad),dom};
        String nombreCompleto= "persona: ";

        for(int i=0;i<array.length;i++){

            //nombreCompleto = nombreCompleto.concat(array[i])+" ";
            nombreCompleto = nombreCompleto + array[i] + " ";

        }
       System.out.println(nombreCompleto);

        for(int i=0;i<nombre.length();i++){
            char letra=nombre.charAt(i);
               System.out.println(letra);
        }
        String nuevo;

        System.out.println(nombre.replace('l','f'));
        int acu=0;
        for (int i=0;i<10;i++){
             acu+=i;
        }
        System.out.println(acu);
    }
}

