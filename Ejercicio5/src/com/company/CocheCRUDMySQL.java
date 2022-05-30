package com.company;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDMySQL implements CocheCRUD {
    List<Coche> auto = new ArrayList<>();
    @Override
    public void guardar(Coche oCoche) {
    auto.add(oCoche);
    }

    @Override
    public List<Coche> mostrar() {
        return auto;
    }

    @Override
    public void borrar(int pos) {
    auto.remove(pos);
    }
}
