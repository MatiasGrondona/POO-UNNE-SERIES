
/**
 * permite ejecutar las clases Persona, CuentaBancaria, Localidad, Empleado, Banco.
 * 
 * @author Matias Grondona 
 * @version 14/10/18
 */
import java.util.*;
public class AplicacionBanco
{
    public static void main(String [] args){
        System.out.println("-------------------------------------------------------------------------");
        Persona persona1 = new Persona(12345678, "Juan", "Perez",new GregorianCalendar(1990,04,23));
        Persona persona2 = new Persona(23456789, "Elba", "Martinez", new GregorianCalendar(1990,04,24));
        System.out.println("Se crean dos Objetos persona1 y persona2");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Se crean dos cuentas bancarias ");
        CuentaBancaria cuenta1 = new CuentaBancaria(00234, persona1, 0);
        CuentaBancaria cuenta2 = new CuentaBancaria(00123, persona2, 8500);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Se crea un ArrayList con las dos cuentas bancarias");
        ArrayList<CuentaBancaria> p_cuentas = new ArrayList<CuentaBancaria>();
        p_cuentas.add(cuenta1);
        p_cuentas.add(cuenta2);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se crean dos objetos empleado1 y empleado 2");
        Empleado empleado1 = new Empleado(12345678, "Conor", "Sara", 7500, new GregorianCalendar(2005, 9,19));
        Empleado empleado2 = new Empleado(23456789, "Lennon", "Jhon", 9500, new GregorianCalendar(2008, 07,7));
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Se crea un objeto Localidad");
        Localidad localidad = new Localidad("Esquina","Corrientes");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se crea un ArrayList con los empleados");
        ArrayList<Empleado> p_empleados = new ArrayList<Empleado>();
        p_empleados.add(empleado1);
        p_empleados.add(empleado2);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se crean dos objetos tipo Banco, banco1 y banco2, uno con los ArrayList y otro Vacio");
        Banco banco1 = new Banco("Galicia", 0023, localidad, p_empleados, p_cuentas);
        Banco banco2 = new Banco("Patagonia", 0045, localidad, empleado1);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Se muestra el banco1");
        System.out.println("INFORMACION CUENTAS BANCARIAS");
        banco1.mostrarResumen();
        System.out.println("INFORMACION EMPLEADOS");
        banco1.mostrar();
        System.out.println("-------------------------------------------------------------------------");
        banco1.quitarEmpleado(empleado1);
        banco1.quitarCuentaBancaria(cuenta2);
        System.out.println("se elimina un Empleado y una Cuenta Bancaria del banco1 y se muetra la informacion actualizada");
        System.out.println("INFORMACION CUENTAS BANCARIAS");
        banco1.mostrarResumen();
        System.out.println("INFORMACION EMPLEADOS");
        banco1.mostrar();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se agrega un Empleado y una Cuenta Bancaria del banco2 y se muetra la informacion actualizada");
        banco2.agregarEmpleado(empleado1);
        banco2.agregarCuentaBancaria(cuenta1);
        System.out.println("INFORMACION CUENTAS BANCARIAS");
        banco1.mostrarResumen();
        System.out.println("INFORMACION EMPLEADOS");
        banco1.mostrar();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
         System.out.println("");
    }
}
/*
 * crear:
 * 2 Persona * 
 * 2 CuentaBancaria *
 * 1 ArrayList CuentasBancarias *
 * 1 ArrayList Empleados *
 * 2 Empleado *
 * 1 Localidad *
 * 2 Banco
 */