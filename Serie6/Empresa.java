
/**
 * Ejecuta la clase Empleado.
 * 
 * @author (Matias Grondona) 
 * @version 08/10/18
 */
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.*;
public class Empresa
{
    public static void main(String [] args)
    {
        long p_cuil = 03000002;
        String p_apellido = "Perez";
        String p_nombre = "Juan";
        double p_importe = 15000;
        int p_anio = 2013;
        int p_dni = 39000000;
        int p_year = 1990;
        int p_month = 7;
        int p_day = 29;
        
        //creaccion del objeto empleado1
        Empleado empleado1;
        
        empleado1 = new Empleado(p_cuil,p_apellido,p_nombre,p_importe,p_anio, p_dni, p_year);
        
        //prueba de metodos
        
        System.out.println("Apellido y nombre: "+empleado1.apeYNom());
        
        empleado1.mostrar();
        
        System.out.println(empleado1.mostrarLinea());
        
    }
}
