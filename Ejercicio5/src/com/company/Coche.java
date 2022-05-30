package com.company;

public class Coche {
    String marca;
    int puertas;
    int modelo;
    String color;

    public Coche(){}

    public Coche(String marca, int puertas, int modelo, String color) {
        this.marca = marca;
        this.puertas = puertas;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", puertas=" + puertas +
                ", modelo=" + modelo +
                ", color='" + color + '\'' +
                '}';
    }
}
