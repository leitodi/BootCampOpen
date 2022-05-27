package com.company;

public class SmartWatch extends SmartDevice {
    protected String color;
    protected String malla;
    protected int tamanio;
    protected boolean resistente;
    protected String material;
    public SmartWatch(){

    }
    public SmartWatch (String color,String malla,int tamanio,boolean resistente,String material,int corriente,int anioFabricacion, boolean blue,String marca,String SO){
        super(corriente,anioFabricacion,blue,marca,SO);
        this.color=color;
        this.malla=malla;
        this.tamanio=tamanio;
        this.resistente=resistente;
        this.material=material;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "corriente=" + corriente +
                ", anioFabricacion=" + anioFabricacion +
                ", blue=" + blue +
                ", marca='" + marca + '\'' +
                ", SO='" + SO + '\'' +
                ", color='" + color + '\'' +
                ", malla='" + malla + '\'' +
                ", tamanio=" + tamanio +
                ", resistente=" + resistente +
                ", material='" + material + '\'' +
                '}';
    }
}
