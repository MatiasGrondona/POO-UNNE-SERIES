
/**
 * permite ejecutar las clases Empleado y Comercio.
 * 
 * @author Matias Grondona
 * @version 14/10/18
 */
import java.util.*;
import java.util.HashMap;
public class GestionComercio
{
    public static void main(String [] args){
        long p_cuil = 12345678;
        String p_nombre = "Juan";
        String p_apellido = "Gonzalez";
        double p_sueldo = 18000;
        Calendar p_fechaIngreso = new GregorianCalendar(1998,05,29);
        
        System.out.println("-------------------------------------------------------------------------");
        
        Empleado empleado1 = new Empleado(p_cuil, p_apellido, p_nombre,  p_sueldo, p_fechaIngreso);
        System.out.println("se crea un empleado1  ");
        
        p_cuil = 23456789;
        p_nombre = "Mercedes";
        p_apellido = "Martinez";
        p_sueldo = 17000;
        Empleado empleado2 = new Empleado(p_cuil, p_apellido, p_nombre,  p_sueldo, p_fechaIngreso);
        System.out.println("se crea otro empleado2");
        
        p_cuil = 34567899;
        p_nombre = "Virginia";
        p_apellido = "Gomez";
        p_sueldo = 19000;
        Empleado empleado3 = new Empleado(p_cuil, p_apellido, p_nombre, p_sueldo, p_fechaIngreso);
        System.out.println("se crea otro empleado3");
        
        System.out.println("-------------------------------------------------------------------------");
        HashMap<Long, Empleado> p_empleados = new HashMap<Long, Empleado>();
        p_empleados.put(new Long(empleado1.getCuil()),empleado1);
        p_empleados.put(new Long(empleado2.getCuil()),empleado2);
        p_empleados.put(new Long(empleado3.getCuil()),empleado3);
        System.out.println("Se crea un HashMap con los empleados: ");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        String p_nombreComercio = "Carniceria";
        Comercio comercio1 = new Comercio(p_nombreComercio,p_empleados);
        p_nombreComercio = "Farmacia";
        Comercio comercio2 = new Comercio(p_nombreComercio);
        System.out.println("Se crea un Comercio con el HashMap y otro Vacio. ");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Se Muestran los datos del primer comercio");
        System.out.println("");
        comercio1.nomina();
        System.out.println("-------------------------------------------------------------------------");
        comercio1.bajaEmpleado(empleado1.getCuil());
        
        System.out.println("Se elimina un empleado del primer comercio y se muestra ");
        System.out.println("");
        comercio1.nomina();
        System.out.println("-------------------------------------------------------------------------");
        comercio2.altaEmpleado(empleado1);
        comercio2.altaEmpleado(empleado2);
        System.out.println("Se agregan dos empleados al segundo comercio y se muestra");
        System.out.println("");
        comercio2.nomina();
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("cantidad de empleados del comercio 1: "+ comercio1.cantidadEmpleados());
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Busca un empleado en el comercio 1:");
        System.out.println("");
        comercio1.buscarEmpleado(empleado2.getCuil()).mostrar();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Avisa si un empleado esta de alta en el comercio 2");
        
        System.out.println("el empleado "+empleado3.nomYApe()+" esta dado de alta en el comercio? "+comercio2.esEmpleado(empleado3.getCuil()));
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("mustra el sueldo neto de un empleado del comercio 1 ");
        System.out.println("");
        comercio1.sueldoNeto(empleado3.getCuil());
        System.out.println("-------------------------------------------------------------------------");
        
    }
}
/*
 * crear
 * 3 empleados
 * 2 comercios
 */