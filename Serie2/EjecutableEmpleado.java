/**
 * Permite enviar mensajes a la clase Empleado con los parametros ingresados por la clase Scanner.
 * 
 * @author Matias Grondona 
 * @version 21/08/18
 */
import java.util.Scanner;
public class EjecutableEmpleado
{
    public static void main(String [] args)
    {
        long p_cuil;
        String p_apellido;
        String p_nombre;
        double p_importe;
        int p_anio;
        
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
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
        
        Empleado empleado1;
        
        empleado1 = new Empleado(p_cuil,p_apellido,p_nombre,p_importe,p_anio);
        
        System.out.println("Apellido y nombre: "+empleado1.apeYNom());
        
        empleado1.mostrar();
        
        System.out.println(empleado1.mostrarLinea());
    }
}
