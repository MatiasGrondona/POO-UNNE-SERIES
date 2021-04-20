
/**
 * Write a description of class EjecutablePoliza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.GregorianCalendar;
import java.util.*;
import java.util.Scanner;
public class EjecutablePoliza
{
    public static void main(String [] args){
        int controlObjNuevo = 0;
        int p_dia;
        int p_mes;
        int p_año;
        
        String p_agricultor;
        String p_cultivo;
        Calendar p_fechaCosecha;
        
        Calendar p_fechaSiniestro;
        double p_porcentajeDaño;
        
        String p_cobertura;
        Calendar p_fechaContrato;
        double p_valorPoliza;
        double p_valorAsegurado;
        String p_momentoCancelacion;
        
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\poliza.dat", true);
            DataOutputStream archiDOS = new DataOutputStream(archiFOS);
            
            
            //instanciar los objetos unidad de riesgo, siniestro, poliza;
            
            
            System.out.print("Quiere grabar un objeto en el archivo? (1 - si) (2 - no): ");
            controlObjNuevo = Integer.parseInt(teclado.readLine());
            while(controlObjNuevo == 1)
            {
                //unidad de riesgo
                System.out.print("Ingrese el nombre del agricultor: ");
                p_agricultor = teclado.readLine();
        
                System.out.print("Ingrese el cultivo a esegurar: ");
                p_cultivo = teclado.readLine();
                
                System.out.print("Ingrese el año de cosecha: ");
                p_año = Integer.parseInt(teclado.readLine()); 
                System.out.print("Ingrese el mes de cosecha: ");
                p_mes = Integer.parseInt(teclado.readLine());
                System.out.print("Ingrese el dia de cosecha: ");
                p_dia = Integer.parseInt(teclado.readLine());
                p_fechaCosecha = new GregorianCalendar(p_año, p_mes, p_dia);
                
                UnidadDeRiesgo unidad1;
                unidad1 = new UnidadDeRiesgo(p_agricultor, p_cultivo, p_fechaCosecha);
                
                //siniestro
                System.out.print("Ingrese el año del Siniestro: ");
                p_año = Integer.parseInt(teclado.readLine()); 
                System.out.print("Ingrese el mes del Siniestro: ");
                p_mes = Integer.parseInt(teclado.readLine());
                System.out.print("Ingrese el dia del Siniestro: ");
                p_dia = Integer.parseInt(teclado.readLine());
                p_fechaSiniestro = new GregorianCalendar(p_año, p_mes, p_dia);
        
                System.out.print("Ingrese el porcentaje de daño sobre la unidad de riesgo: ");
                p_porcentajeDaño = Double.parseDouble(teclado.readLine());
                
                Siniestro siniestro1;
                siniestro1 = new Siniestro(p_fechaSiniestro, p_porcentajeDaño);
                
                //poliza
                System.out.print("Ingrese el tipo de cobertura: ");
                p_cobertura = teclado.readLine();
                
                System.out.print("Ingrese el año del Contarto de la poliza: ");
                p_año = Integer.parseInt(teclado.readLine()); 
                System.out.print("Ingrese el mes del Contarto de la poliza: ");
                p_mes = Integer.parseInt(teclado.readLine());
                System.out.print("Ingrese el dia del Contarto de la poliza: ");
                p_dia = Integer.parseInt(teclado.readLine());
                p_fechaContrato = new GregorianCalendar(p_año, p_mes, p_dia);
                
                System.out.print("Ingrese el valor de la Poliza: ");
                p_valorPoliza = Double.parseDouble(teclado.readLine());
                
                System.out.print("Ingrese el valor asegurado por la unidad deriesgo: ");
                p_valorAsegurado = Double.parseDouble(teclado.readLine());
                
                System.out.print("Ingrese el momento en el cual finaliza la cobertura (Inicial) o (Final): ");
                p_momentoCancelacion = teclado.readLine();
                
                Poliza poliza1;
                poliza1 = new Poliza(p_cobertura, p_fechaContrato, p_valorPoliza, p_valorAsegurado, p_momentoCancelacion, unidad1, siniestro1);
                
                //mostar el objeto instanciado
                
                poliza1.detallePrecioPoliza();
                
                poliza1.resumenIndemnizaciones();
                
                //grabacion del archivo
                
                archiDOS.writeUTF(poliza1.getCobertura());
                archiDOS.writeUTF(poliza1.getUnidad().getCultivo());
                archiDOS.writeDouble(poliza1.getSiniestro().getPorcentajeDaño());
                archiDOS.writeDouble(poliza1.indemnizacion());
                
                //control de creacion de objeto nuevo
                System.out.print("Quiere grabar otro objeto en el archivo? (1 - si) (2 - no): ");
                controlObjNuevo = Integer.parseInt(teclado.readLine());
            }
            archiDOS.close();
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
