package com.company;

import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {
        System.out.println("ingrese precio");
        Scanner oScanner = new Scanner(System.in);
        double precio = oScanner.nextDouble();
        System.out.println(precioFinal(precio));
    }
    //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    static double precioFinal(double precio){
        return   precio*1.21;
    }
}
