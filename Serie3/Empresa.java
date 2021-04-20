
/**
 * Ejecuta la clase Empleado.
 * 
 * @author (Matias Grondona) 
 * @version (21/08/18)
 */
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.*;
public class Empresa
{
    public static void main(String [] args)
    {
        long p_cuil;
        String p_apellido;
        String p_nombre;
        double p_importe;
        int p_anio;
        
        int p_year;
        int p_month;
        int p_day;
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        //ingreso por teclado de los estados de los atributos
        System.out.print("Ingrese el CUIL del empleado: ");
        p_cuil = teclado.nextLong();
        
        System.out.print("Ingrese el Apellido: ");
        p_apellido = teclado.next();
        
        System.out.print("Ingrese el Nombre: ");
        p_nombre = teclado.next();
        
        System.out.print("Ingrese el importe del sueldo basico: ");
        p_importe = teclado.nextDouble();
        
        System.out.print("Ingrese el año de ingreso: ");
        p_anio = teclado.nextInt();
        //creaccion del objeto empleado1
        Empleado empleado1;
        
        empleado1 = new Empleado(p_cuil,p_apellido,p_nombre,p_importe,p_anio);
        
        //prueba de metodos
        
        System.out.println("Apellido y nombre: "+empleado1.apeYNom());
        
        empleado1.mostrar();
        
        System.out.println(empleado1.mostrarLinea());
        
        
        
        //creaccion del objeto empleado2
        System.out.println("los siguientes datos son del empleado 2.");
        //ingreso por teclado de los estados de los atributos
        System.out.print("Ingrese el CUIL del empleado: ");
        p_cuil = teclado.nextLong();
        
        System.out.print("Ingrese el Apellido: ");
        p_apellido = teclado.next();
        
        System.out.print("Ingrese el Nombre: ");
        p_nombre = teclado.next();
        
        System.out.print("Ingrese el importe del sueldo basico: ");
        p_importe = teclado.nextDouble();
        
        System.out.print("Ingrese el año de ingreso: ");
        p_year = teclado.nextInt();
        
        System.out.print("Ingrese el mes de ingreso: ");
        p_month = teclado.nextInt();
        
        System.out.print("Ingrese el dia de ingreso: ");
        p_day = teclado.nextInt();
        
        Calendar p_fechaIngreso = new GregorianCalendar(p_year,p_month-1,p_day);
        
        Empleado empleado2;
        
        empleado2 = new Empleado(p_cuil,p_apellido,p_nombre,p_importe,p_fechaIngreso);
        
        //prueba de metodos
        
        System.out.println("Apellido y nombre: "+empleado2.apeYNom());
        
        empleado2.mostrar();
        
        System.out.println(empleado2.mostrarLinea());
        
        if (empleado2.esAniversario() == true){
            System.out.println("es el anivesario del empleado");
        }
    
    }
}
