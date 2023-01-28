using System.Drawing;
using System.Net.Http.Headers;
using System.Runtime;

//Ejercicio 1
//Variables Escribe un programa que reciba datos de una persona y genera un mensaje, usa una variable para cada dato y otra para el mensaje. 
//    Ej: nombre, apellido, edad, sabe programar, etc.
Console.WriteLine("Ingrese nombre");
string nombre = Console.ReadLine();
Console.WriteLine("Ingrese edad");
int edad = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Ingrese profesion");
string profesion = Console.ReadLine();

string persona = nombre + " " + edad + " " + profesion;
Console.WriteLine(persona);

//Ejercicio 2
//Tipos Usando los tipos de variables más adecuados, describe los objetos siguientes:
//Coche: puertas, ruedas, marca, ITV vigente
//Mesa: peso, largo, material, color
//Nota: puedes escribir estos datos por consola si prefieres verlos. La idea del ejercicio es almacenar los datos en los tipos más adecuados.

Console.WriteLine("ingrese cantidad de puertas");
int puertas = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("ingrese cantidad de ruedas");
int ruedas = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("ingrese la marca");
string marca = Console.ReadLine();
Console.WriteLine("Fecha de ITV");
DateTime ITV = Convert.ToDateTime(Console.ReadLine());
string coche = "Tiene: " + puertas + " puertas y " + ruedas + " ruedas, es de marca " + marca + " ,su ITV vence el: " + ITV;
Console.WriteLine(coche);
float largo = 1.85f;
Int32 kg = 22;
string color = "marron";
string mesa = "Mide: de largo " + largo + " su peso es de: " + kg + "kg, color: " + color;
Console.WriteLine(mesa);


//Ejercicio 3
//Operadores Determina los operadores para verificar las siguientes condiciones:
//Un número es mayor o igual a 18
//Un char es ‘a’
//Se cumplen dos conciones a la vez (ambas verdaderas)
//Se cumple una de dos condiciones a la vez (una true y otra false)
//Nota: puedes escribir estos datos por consola si prefieres verlos. La idea del ejercicio es almacenar los datos en los tipos más adecuados.

Console.WriteLine("ingrese un numero");
int num = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("ingrese un caracter");
string letra = Console.ReadLine();

if (num >= 18)
    Console.WriteLine("el numero "+num +" es mayor o igual a 18");
else Console.WriteLine("el numero " + num + " es menor a 18");

if (letra == "a")
    Console.WriteLine("el caracter " +" ' "+ letra+ " ' " + " es igual a: " + " ' "+ "a"+" '");
else
    Console.WriteLine("el caracter " + letra + " es distinto a: " + "a");





