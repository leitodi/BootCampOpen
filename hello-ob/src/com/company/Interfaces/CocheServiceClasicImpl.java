package com.company.Interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.Interfaces.CocheService;

public class CocheServiceClasicImpl implements CocheService {
    @Override
    public Coche crearcocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }
}
