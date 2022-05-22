package com.company;

public class CocheMain {

    public static void main(String[] args) {
        String coche= "alfa romeo";
        //Coche oCoche = new Coche();
        Coche oCoche1= new CocheElectrico("rojo","honda","civic",1430.45,54.8,"ELE");
        oCoche1.acelerar(50);

        System.out.println(oCoche1);
        oCoche1.peso=1350.8;
        System.out.println(oCoche1);
        CocheElectrico oCocheElectrico = new CocheElectrico("azul","fiat","punto",1120.5,2.3,"TXZ");



    }
}
