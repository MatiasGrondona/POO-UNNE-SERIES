
/**
 * permite crear y manipular objetos de tipo CuentaBancaria.
 * 
 * @author (Matias Grondona) 
 * @version (16/08/18)
 */

public class CrearCuentaBancaria
{
    public static void main(String [] args)
    {
        Persona persona1;
        persona1 = new Persona(41333000,"juan","Perez",1999);
        
        CuentaBancaria cuenta1;
        cuenta1 = new CuentaBancaria(4141, persona1);
        
        cuenta1.depositar(540.98);
        cuenta1.extraer(345.66);
        
        cuenta1. mostrar();
        
        System.out.println("Informacion Cuenta: "+cuenta1.toString());

    }
}
