using System.Diagnostics;
using System.Drawing;
using System.Net.Http.Headers;
using System.Runtime;


//Ejercicio 1 - If
//Escribe un programa que:
//Pida datos a un cliente: Nombre, email, cupón Determine si un cliente tiene un cupon descuento 
//Muestre un precio rebajado en función del descuento Muestre el precio de un producto sin descuento si no hay cupón
//Nota: puedes poner un precio fijo de un producto o uno variable.

Console.WriteLine("Ingrese nombre");
string nombre = Console.ReadLine();
Console.WriteLine("Ingrese Email");
string email = Console.ReadLine();
Console.WriteLine("Tiene cupon?");
bool cupon = Convert.ToBoolean(Console.ReadLine());
int precio = 400;

if (cupon == true)
    Console.WriteLine("el precio a pagar es: " + precio * 0.90);
else Console.WriteLine("el precio a pagar es: " + precio);


//Ejercicio 2 - Switch
//Haz una lista de lenguajes de programación, por ejemplo: C#, Java, C++. Presenta la lista en consola y pide que el usuario seleccione el lenguaje mediante 1, 2, 3 o a, b, c.
//Presenta el resultado en consola.Nota: puedes añadir al resultado el “Hola, mundo” para el caso de C#.

Console.WriteLine("elija lenguaje");
Console.WriteLine("c# = 1 , java = 2, c++ = 3");
int opcion = Convert.ToInt32(Console.ReadLine());

switch (opcion)
{
	case 1: Console.WriteLine("Usted elijio c#");
		break;
    case 2:
        Console.WriteLine("Usted elijio java");
        break;
    case 3:
        Console.WriteLine("Usted elijio c++");
        break;
    default:
        Console.WriteLine("vuelva a elejir entre 1, 2 o 3");
        break;
}