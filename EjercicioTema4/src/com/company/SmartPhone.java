package com.company;

public class SmartPhone extends SmartDevice {
    protected String tecnologia;
    protected String modelo;
    protected int cantChip;
    protected boolean resiste;

    public SmartPhone(){

    }
    public SmartPhone (String tecnologia,String modelo,int cantChip,boolean resiste,int corriente,int anioFabricacion, boolean blue,String marca,String SO){
        super(corriente,anioFabricacion, blue,marca,SO);
        this.tecnologia=tecnologia;
        this.modelo=modelo;
        this.cantChip=cantChip;
        this.resiste=resiste;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "corriente=" + corriente +
                ", anioFabricacion=" + anioFabricacion +
                ", blue=" + blue +
                ", marca='" + marca + '\'' +
                ", SO='" + SO + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cantChip=" + cantChip +
                ", resiste=" + resiste +
                '}';
    }
}
