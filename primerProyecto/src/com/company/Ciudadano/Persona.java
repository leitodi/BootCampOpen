package com.company.Ciudadano;

import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;
    double energia;
    String sexo;

    public Persona(){

    }
    public Persona (String nombre,int edad, double energia,String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.energia=energia;
        this.sexo=sexo;

    }

    public boolean puedeTrabajar (int horas){
        return !(horas * 5 > energia);
    }

    public boolean esMayor (int edad){
        boolean mayor = false;
         return (edad>18);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", energia=" + energia +
                ", sexo=" + sexo +
                '}';
    }

    public static void main(String[] args) {
        Scanner oScanner = new Scanner (System.in);
        Persona oPersona = new Persona("Leonardo",32,30,"masculino");


        System.out.println("Cuantas horas quiere trabajar? "+oPersona.nombre);
        int horas = oScanner.nextInt();

        Persona oPersona2=new Persona ();

        System.out.println("introduce un nombre");
        oPersona2.nombre = oScanner.next();
        System.out.println("introduce edad");
        oPersona2.edad= oScanner.nextInt();
        System.out.println("introduce energia");
        oPersona2.energia =oScanner.nextDouble();
        System.out.println("Introduce sexo");
        oPersona2.sexo = oScanner.next();
        System.out.println("Cuantas horas quiere trabajar?");
        int horas2 = oScanner.nextInt();
        System.out.println(oPersona);
        System.out.println("Esta capacitado para trabajar "+ oPersona.nombre+": " + oPersona.puedeTrabajar(horas));
        System.out.println("Es mayor de edad "+ oPersona.nombre+": " +oPersona.esMayor(oPersona.edad));


        System.out.println(oPersona2);
        System.out.println("Esta capacitado para trabajar "+oPersona2.nombre+": " + oPersona2.puedeTrabajar(horas2));
        System.out.println("Esta capacitado para trabajar: "+oPersona2.nombre+": " + oPersona2.esMayor(oPersona.edad));

    }

}
        /*Crea un proyecto de Java desde 0
        Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
        Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
        Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.*/
