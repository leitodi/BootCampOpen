using System.Drawing;
using System.Net.Http.Headers;
using System.Runtime;
//Crea una estructura de datos para un cliente con estos campos:
//Nombre completo
//Teléfono
//Dirección
//Email
//Si es nuevo cliente
//Bonus: escribe un método para presentar estos datos desde la estructura al hacer Console.WriteLine(...)
cliente c1 = new cliente("leonardo", 3513890116, "mzna 79 lote 32", "davidleodifra@gmail.com", false);
string cliente = " ";
if (c1.pnuevo == true)
    cliente = "nuevo";


Console.WriteLine(c1.ToString()+" "+cliente);
public struct cliente
{
    public cliente(string nombre, Int64 telefono, string direccion, string email, bool nuevo)
    {
        pnombre = nombre;
        ptelefono = telefono;
        pdireccion = direccion;
        pemail = email;
        pnuevo = nuevo;

    }    
   
    public string pnombre { get; }

    public Int64 ptelefono { get; set; }

    public string pdireccion { get; set; }

    public string pemail { get; set; }

    public bool pnuevo { get; set; }

    

    public override string ToString()
    {
        return "el nombre es: "+pnombre+", su telefono es: "+ptelefono+", direccion: "+pdireccion+" email: "+pemail ;
    }

}





