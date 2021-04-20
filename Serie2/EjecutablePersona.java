
/**
 * Permite enviar mensajes a la clase Persona con los parametros ingresados como constantes.
 * 
 * @author Matias Grondona
 * @version 16/08/18
 */

public class EjecutablePersona
{
    public static void main(String [] args)
    {
        Persona persona1;
        persona1 = new Persona(41333000,"juan","Perez",1999);
        
        System.out.println("Apellido y Nombre: "+persona1.apeYNom());
        System.out.println("Edad: "+persona1.edad());
        persona1.mostrar();

    }
}
