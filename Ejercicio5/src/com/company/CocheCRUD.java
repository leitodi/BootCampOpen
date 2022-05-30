package com.company;

import java.util.List;

public interface CocheCRUD  {
    void guardar (Coche oCoche);

    List<Coche> mostrar();

    void borrar (int pos);
}
