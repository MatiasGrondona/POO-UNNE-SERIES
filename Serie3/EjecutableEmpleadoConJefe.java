
/**
 * Permite crear manipular objetos de tipo EmpleadoConJefe.
 * 
 * @author Matias Grondona 
 * @version 06/09/18
 */
import java.util.Scanner;
import java.util.*;
import java.util.GregorianCalendar;
public class EjecutableEmpleadoConJefe
{
    public static void main(String [] args)
    {
        Scanner teclado;
        teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        long p_cuil;
        String p_apellido;
        String p_nombre;
        double p_importe;
        int p_anio;
        
        int p_year;
        int p_month;
        int p_day;
        
        //ingreso por teclado de los estados de los atributos
        System.out.println("Ingrese los datos para empleadoConJefe1");
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
        //creaccion del objeto empleadoConJefe1, este objeto no conoce a otro.
        EmpleadoConJefe empleadoConJefe1;
        
        empleadoConJefe1 = new EmpleadoConJefe(p_cuil,p_apellido,p_nombre,p_importe,p_anio);
        
        //prueba de metodos
        System.out.println("Apellido y nombre: "+empleadoConJefe1.apeYNom());
        
        empleadoConJefe1.mostrar();
        
        System.out.println(empleadoConJefe1.mostrarLinea());
        
        //creaccion del objeto empleado2
        System.out.println("los siguientes datos son del EmpleadoConJefe 2.");
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
        
        EmpleadoConJefe empleadoConJefe2;
        
        empleadoConJefe2 = new EmpleadoConJefe(p_cuil,p_apellido,p_nombre,p_importe,p_fechaIngreso,empleadoConJefe1);
        
        //prueba de metodos
        
        System.out.println("Apellido y nombre: "+empleadoConJefe2.apeYNom());
        
        empleadoConJefe2.mostrar();
        
        System.out.println(empleadoConJefe2.mostrarLinea());
        
        if (empleadoConJefe2.esAniversario() == true){
            System.out.println("es el anivesario del empleado");
        }
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Permiso de Salida.");
        System.out.println("El empleado: "+empleadoConJefe2.apeYNom()+"\t tiene autorizada la salida.\n FIRMA: "
                                +empleadoConJefe2.getJefe().nomYApe());
        
    }
}
