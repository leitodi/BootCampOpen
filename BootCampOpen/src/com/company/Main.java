package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n1=5;
        int n2=6;
        int n3=30;
        System.out.println("la suma es: " + sumar(n1,n2,n3));
        Coche miCoche = new Coche();
        miCoche.puertas=2;
        miCoche.incrementar();
        miCoche.incrementar();
        System.out.println("tiene "+miCoche.puertas+" puertas");
    }
    public static int sumar (int n1, int n2,int n3){
        int resultado = n1+n2+n3;
        return resultado;
    }
    public static class Coche {
        int puertas = 2;
        public int   incrementar () {
            return this.puertas += +1;
        }
    }
}
  /*Primera parte:
          - Crear una función con tres parámetros que sean números que se suman entre sí.
          - Llamar a la función en el main y darle valores.
          Segunda parte:
          - Crear una clase coche.
          - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
          - Una función que incremente el número de puertas que tiene el coche.
          - Crear un objeto miCoche en el main y añadirle una puerta.
          - Mostrar el número de puertas que tiene el objeto.*/