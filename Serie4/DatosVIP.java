

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
public class DatosVIP
{
    public static void main(String [] args)
    {
        long p_cuil = 0;
        String p_apellido = "";
        String p_nombre = "";
        double p_importe = 0;
        double p_importeNeto = 0;
        int p_anio = 0;
        int controlObjNuevo = 0;
        
        int p_year = 0;
        int p_month = 0;
        int p_day = 0;
        
        //creando un objeto teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            //creando un objeto de tipo archivo secuencial lectura
            FileInputStream archiFIS = new FileInputStream("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\Empleado.dat");
            
            DataInputStream archiDIS = new DataInputStream(archiFIS);
            
            //creando un objeto de tipo archivo secuencial grabacion
            FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\EmpleadoVIP.dat",true);
            
            DataOutputStream archiDOS = new DataOutputStream(archiFOS);
            
            while(archiDIS.available() > 0)
            {
                
                p_cuil = archiDIS.readLong();
                p_apellido = archiDIS.readUTF();
                p_nombre = archiDIS.readUTF();                        
                p_importe = archiDIS.readDouble();
                p_importeNeto = archiDIS.readDouble();
                p_year = archiDIS.readInt();                        
                p_month = archiDIS.readInt();
                p_day = archiDIS.readInt();
            
                Calendar p_fechaIngreso = new GregorianCalendar(p_year,p_month-1,p_day);
                
        
                Empleado empleado1;
        
                empleado1 = new Empleado(p_cuil,p_apellido,p_nombre,p_importe,p_fechaIngreso);
                
                //mostar el objeto instanciado
                empleado1.mostrar();
                
                //grabacion del archivo
                if(empleado1.antiguedad() >= 10)
                {
                    archiDOS.writeLong(empleado1.getCuil());
                    archiDOS.writeUTF(empleado1.getApellido());
                    archiDOS.writeUTF(empleado1.getNombre());
                    archiDOS.writeDouble(empleado1.getSueldoBasico());
                    archiDOS.writeDouble(empleado1.sueldoNeto());
                    archiDOS.writeInt(empleado1.getFechaIngreso().get(Calendar.DATE));
                    archiDOS.writeInt(empleado1.getFechaIngreso().get(Calendar.MONTH));
                    archiDOS.writeInt(empleado1.getFechaIngreso().get(Calendar.YEAR));
                }
                
            }
            archiDOS.close();
            archiDIS.close();
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

