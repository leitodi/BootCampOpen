package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente oCliente = new Cliente ();
        int edad = oCliente.edad=32;
        String nombre = oCliente.nombre="Leonardo";
        int tel = oCliente.telefono=4550809;
        boolean credito = oCliente.credito=true;
        System.out.println(nombre +" tiene: "+ edad+" años, su telefono es: "+tel+". Puede tener credito?: "+ credito);
        Trabajador oTrabajador = new Trabajador ();
        int edadT = oTrabajador.edad=28;
        String nombreT = oTrabajador.nombre="Maiquel";
        int telT = oTrabajador.telefono=4551373;
        int salario = oTrabajador.salario= 35000;
        System.out.println(nombreT +" tiene: "+ edadT+" años, su telefono es: "+telT+". Su salario es: "+ salario);
     }
}
     class Persona {
        int edad;
        String nombre;
        int telefono;
    }
    class Cliente extends Persona{
        boolean credito;
    }
    class Trabajador extends Persona, Cliente  {
        int salario;
    }
         //Crea una clase Persona con las siguientes variables:
        //La edad
         //El nombre
         //El teléfono
         //Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
         //esta nueva clase tendrá la variable credito solo para esa clase.
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades
         //la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        //Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario
        //que solo tenga la clase Trabajador.