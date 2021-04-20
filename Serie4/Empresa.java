
/**
 * Ejecuta la clase Empleado.
 * 
 * @author (Matias Grondona) 
 * @version (18/09/18)
 */
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.*;
import java.io.*;
public class Empresa
{
    public static void main(String [] args)
    {
        long p_cuil = 0;
        String p_apellido = "";
        String p_nombre = "";
        double p_importe = 0;
        int p_anio = 0;
        int controlObjNuevo = 0;
        
        int p_year = 0;
        int p_month = 0;
        int p_day = 0;
        
        //creando un objeto teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            //creando un objeto de tipo archivo secuencial
            FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\Empleado.dat",true);
            
            DataOutputStream archiDOS = new DataOutputStream(archiFOS);
            
            System.out.print("Quiere grabar un objeto en el archivo? (1 - si) (2 - no): ");
            controlObjNuevo = Integer.parseInt(teclado.readLine());
        
            while(controlObjNuevo == 1)
            {
                System.out.print("Ingrese el CUIL del empleado: ");
                p_cuil = Long.parseLong(teclado.readLine());
        
                System.out.print("Ingrese el Apellido: ");
                p_apellido = teclado.readLine();
        
                System.out.print("Ingrese el Nombre: ");
                p_nombre = teclado.readLine();
        
                System.out.print("Ingrese el importe del sueldo basico: ");
                p_importe = Double.parseDouble(teclado.readLine());
            
                System.out.print("Ingrese el año de ingreso: ");
                p_year = Integer.parseInt(teclado.readLine());
        
                System.out.print("Ingrese el mes de ingreso: ");
                p_month = Integer.parseInt(teclado.readLine());
        
                System.out.print("Ingrese el dia de ingreso: ");
                p_day = Integer.parseInt(teclado.readLine());
            
                Calendar p_fechaIngreso = new GregorianCalendar(p_year,p_month-1,p_day);
        
                Empleado empleado1;
        
                empleado1 = new Empleado(p_cuil,p_apellido,p_nombre,p_importe,p_fechaIngreso);
                
                //mostar el objeto instanciado
                empleado1.mostrar();
                
                //grabacion del archivo
                archiDOS.writeLong(empleado1.getCuil());
                archiDOS.writeUTF(empleado1.getApellido());
                archiDOS.writeUTF(empleado1.getNombre());
                archiDOS.writeDouble(empleado1.getSueldoBasico());
                archiDOS.writeDouble(empleado1.sueldoNeto());
                archiDOS.writeInt(empleado1.getFechaIngreso().get(Calendar.DATE));
                archiDOS.writeInt(empleado1.getFechaIngreso().get(Calendar.MONTH));
                archiDOS.writeInt(empleado1.getFechaIngreso().get(Calendar.YEAR));
                
                //control de creacion de objeto nuevo
                System.out.print("Quiere grabar otro objeto en el archivo? (1 - si) (2 - no): ");
                controlObjNuevo = Integer.parseInt(teclado.readLine());
            }
            archiDOS.close();
        }//ciera el try
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Archivo no encontrado!");
        }
        catch(IOException ioe)
        {
            System.out.println("Error al leer");
        }
    }
}
