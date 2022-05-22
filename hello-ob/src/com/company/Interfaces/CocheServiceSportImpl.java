package com.company.Interfaces;

import com.company.Coche;
import com.company.CocheElectrico;

public class CocheServiceSportImpl implements CocheService{
    @Override
    public Coche crearcocheDemo() {
        System.out.println("Creando coche sport");
        return new CocheElectrico();
    }
}
