
/**
 * Permite instanciar objetos de tipo Persona, CajaDeAhorro y CuentaCorriente.
 * 
 * @author Matias Grondona 
 * @version 03/09/18
 */
public class Banco
{
    public static void main (String [] args)
    {
        Persona persona1;
        persona1 = new Persona(41333000,"juan","Perez",1990);
        
        CuentaCorriente cuentaCorriente1;
        cuentaCorriente1 = new CuentaCorriente(1735, persona1);
        
        CajaDeAhorro cajaDeAhorro1;
        cajaDeAhorro1 = new CajaDeAhorro(2135, persona1);
 
        System.out.println("Los objetos fueron creados por constantes." ); 
        //caja de ahorro
        cajaDeAhorro1.depositar(2000.0);
        System.out.println("Se agrego un saldo de 2000.0 en la Cuenta Corriente N°"+cuentaCorriente1.getNroCuenta());
        cuentaCorriente1.mostrar();
        System.out.println("Se intenta extraer un saldo igual a 700.0 en la Cuenta Corriente N°"+cuentaCorriente1.getNroCuenta());
        cuentaCorriente1.extraer(700.0);
        
        cuentaCorriente1.extraer(500.0);
        System.out.println("Se extrajo un saldo igual a 500.0 en la Cuenta Corriente N°"+cuentaCorriente1.getNroCuenta());
        cuentaCorriente1.mostrar();
        
        //cuenta corriente
        cuentaCorriente1.depositar(700.25);
        System.out.println("se agrego un saldo de 700.0 a la Caja de Ahorro N°"+cajaDeAhorro1.getNroCuenta());
        cajaDeAhorro1.mostrar();
        System.out.println("Se intenta extraer un saldo igual a 800.0 en la Caja de Ahorro N°"+cuentaCorriente1.getNroCuenta());
        cajaDeAhorro1.extraer(800.0);
        
        cajaDeAhorro1.extraer(545.0);
        System.out.println("Se extrajo un saldo igual a 545.0 en la Caja de Ahorro N°"+cajaDeAhorro1.getNroCuenta());
        cajaDeAhorro1.mostrar();
        
    }
}
