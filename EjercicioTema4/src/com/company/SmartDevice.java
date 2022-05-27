package com.company;

public class SmartDevice {
    protected int corriente=220;
    protected int anioFabricacion;
    protected boolean blue;
    protected String marca;
    protected String SO;

    public SmartDevice(){

    }
    public SmartDevice(int corriente,int anioFabricacion, boolean blue,String marca,String SO){
        this.corriente=corriente;
        this.anioFabricacion=anioFabricacion;
        this.blue=blue;
        this.marca=marca;
        this.SO=SO;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "corriente=" + corriente +
                ", anioFabricacion=" + anioFabricacion +
                ", blue=" + blue +
                ", marca='" + marca + '\'' +
                ", SO='" + SO + '\'' +
                '}';
    }
}
