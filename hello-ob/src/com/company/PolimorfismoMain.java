package com.company;

public class PolimorfismoMain {
    public static void main(String[] args) {
        //Coche coche =new Coche();
        CocheElectrico oElectrico=new CocheElectrico();
        CocheHibrido oHibrido = new CocheHibrido();
        //polimorfismo
        Coche coche4 =new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        if (coche4 instanceof CocheElectrico){
            System.out.println("Coche electrico");
        }
        if (coche5 instanceof CocheHibrido){
            System.out.println("Coche Hibrido");
        }
    }
}
