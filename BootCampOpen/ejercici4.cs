﻿using System.Diagnostics;
using System.Drawing;
using System.Net.Http.Headers;
using System.Runtime;
//Ejercicio 1 - While
//Escribe una tabla de multiplicar del 1 al 10 para un número entero que recibe por consola. Es decir, un programa que presente para el 1:
//1 x 1 = 1
//1 x 2 = 2
//…
//1 x 10 = 10
Console.WriteLine("ingrese nuemero");
int num = Convert.ToInt32(Console.ReadLine());
int i = 1;
while (i<=10)
{
    Console.WriteLine(num+ " x " +i +" = "+ i * num  );
    i++;
}

//Ejercicio 2 - Do while
//Escribe un programa que realice estos pasos:Reciba al menos un número por consola Determine si el número es positivo o negativo
//Presente un contador para cada tipo (positivo y negativo).
//Nota: el cero se puede abordar en una clase adicional ya que no es ni positivo ni negativo. 
//    Tienes completa libertad para elegir el formato de la salida.
//Ejercicio 3 - For
//Escribe un programa que realice estos pasos: Reciba 3 datos: ancho alto relleno o no Dibuje en consola con un mismo caracter,  
//    por ejemplo *, un rectángulo de las dimensiones introducidas y use el tercer dato para discernir si el rectángulo está relleno 
//    (tiene más * dentro) o no. En caso de recibir el mismo número n dos veces debe dibujar un cuadrado de lado
//Reto: Extiende el programa anterior para recibir otro número que sea el número de cuadrados o rectángulos que se deben dibujar en la pantalla.
//Ejemplos:Input: 2,2,2, relleno = true Output:** ** ** ** Input: 3, 4, 1, relleno = false
//Output:*** * * * * ***
