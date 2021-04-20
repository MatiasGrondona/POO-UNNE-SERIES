
/**
 * permite manipular los objetos de tipo Persona, Evento y Fundacion.
 * 
 * @author Matias Grondona 
 * @version 22/09/18
 */
import java.io.*;
import java.util.*;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Administracion
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        //variables de instancia para el archivo
        int p_dni;
        String p_apellido;
        String p_nombre;
        int p_dia;
        int p_mes;
        int p_año;
        //variables de instancia para los objetos evento y fundacion
        String p_nombreFundacion;
        
        String p_nombreEvento;
        String p_lugar;
        Calendar p_fechaEvento;
        int p_diasIns;
        double p_costo;
        //crear el objeto evento y el objeto fundacion
        System.out.print("Ingrese el nombre de la fundacion: ");
        p_nombreFundacion = teclado.next();
        
        Fundacion fundacion1;
        fundacion1 = new Fundacion(p_nombreFundacion);  
        
        System.out.print("Ingrese el nombre del evento: ");
        p_nombreEvento = teclado.next();
        System.out.print("Ingrese el lugar del evento: ");
        p_lugar = teclado.next();
        
        System.out.print("Ingrese el dia del evento: ");
        p_dia = teclado.nextInt();
        System.out.print("Ingrese el mes del evento: ");
        p_mes = teclado.nextInt()-1;
        System.out.print("Ingrese el año del evento: ");
        p_año = teclado.nextInt();
        p_fechaEvento = new GregorianCalendar(p_dia,p_mes,p_año);
        
        System.out.print("Ingrese los dias previos para la inscripcion: ");
        p_diasIns = teclado.nextInt();
        System.out.print("Ingrese el costo del evento: ");
        p_costo = teclado.nextDouble();
        
        Evento evento1;
        evento1 = new Evento(p_nombreEvento, p_lugar, p_fechaEvento, p_diasIns, p_costo);
        try{
            //creandom un objeto detipo archivo secuencial para lectura
            FileInputStream archiFIS = new FileInputStream("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\Invitados.dat");
            DataInputStream archiDIS = new DataInputStream(archiFIS);
            
            FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\InvitadosDescuento.dat");
            DataOutputStream archiDOS = new DataOutputStream(archiFOS);
            
            while(archiDIS.available() > 0){
                //lectura del archivo
                p_dni = archiDIS.readInt();
                p_apellido = archiDIS.readUTF();
                p_nombre = archiDIS.readUTF();
                p_dia = archiDIS.readInt();                
                p_mes = archiDIS.readInt();                
                p_año = archiDIS.readInt();
                Calendar p_fechaNacimiento;
                p_fechaNacimiento = new GregorianCalendar(p_dia,p_mes,p_año);
                
                Persona persona1;
                persona1 = new Persona(p_dni,p_apellido,p_nombre,p_fechaNacimiento);
                
                fundacion1.grabarInvitacion(evento1, persona1, archiDOS);
                fundacion1.imprimirInvitacion(evento1, persona1);
                
            }
        }
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
