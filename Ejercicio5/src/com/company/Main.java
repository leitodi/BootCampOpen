package com.company;

public class Main {

    static CocheCRUD oCocheCRUD = new CocheCRUDMySQL();

    public static void main(String[] args) {
	// write your code here
       // Crear una interfaz CocheCRUD.
       // Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
       // Como métodos de CocheCRUD podemos poner:
       // save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
       // Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
       // Ejemplo:
       // CocheCRUD cocheCrud = new CocheCRUDImpl()

                //   CocheCRUD1 oCocheCRUD = new CocheCRUD1();
                //   Coche oCoche= new Coche ("Peugeot","207",4,2012);
                //   Coche oCoche1= new Coche ("vw","Amarok",4,2012);
                //   Coche oCoche2= new Coche ("vw","Fox",3,2013);
                //   Coche oCoche3= new Coche ("Renault","Sandero",5,2022);
                // guardar coche
                //   oCocheCRUD.guardar(oCoche);
                //   oCocheCRUD.guardar(oCoche1);
                //   oCocheCRUD.guardar(oCoche2);
                //   oCocheCRUD.guardar(oCoche3);
                //mostrar todos los coches
                //   List<Coche> coches =  oCocheCRUD.mostrar();
                //   System.out.println(coches);

                oCocheCRUD.guardar(new Coche("Peugeot",5,2012,"Champagne"));
                oCocheCRUD.guardar(new Coche("vw",4,2012,"Blanco"));
                oCocheCRUD.guardar(new Coche("vw",3,2013,"Gris"));
                oCocheCRUD.guardar(new Coche("Renault",5,2022,"Blanco"));
                oCocheCRUD.guardar(new Coche("fiat",2,2014,"Crema"));
                oCocheCRUD.mostrar();
                System.out.println(oCocheCRUD.mostrar());
                oCocheCRUD.borrar(4);
                System.out.println("Nueva lista" +oCocheCRUD.mostrar());

            }
        }

