
/**
 * Permite ejecutar la clase Laboratorio y Producto.
 * 
 * @author Matias Grondona
 * @version 22/09/18
 */
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.*;
import java.io.*;
public class EjecutableLaboratorio
{
    public static void main(String [] args)
    {
        int codigoLab = 0;
        String p_nombre;
        String p_domicilio;
        String p_telefono;
        int p_compraMin;
        int p_diaEntrega;
        int controlObjNuevo = 0;
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            //creando un objeto de tipo archivo directo
            RandomAccessFile archi = new RandomAccessFile("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\Laboratorio.dat","w");
            
            System.out.print("Quiere grabar un objeto en el archivo? (1 - si) (2 - no): ");
            controlObjNuevo = Integer.parseInt(teclado.readLine());
        
            while(controlObjNuevo == 1)
            {
                codigoLab = codigoLab+1;
        
                System.out.print("Ingrese nombre del Laboratorio: ");
                p_nombre = teclado.readLine();
                if(p_nombre.length() < 30){
                    for(int i = p_nombre.length(); i < 25; i++){
                        p_nombre=p_nombre+" ";
                    }
                }else{
                    p_nombre=p_nombre.substring(0,30);
                }
        
                System.out.print("Ingrese el domicilio: ");
                p_domicilio = teclado.readLine();
                if(p_domicilio.length() < 30){
                    for(int i = p_domicilio.length(); i < 25; i++){
                        p_domicilio=p_domicilio+" ";
                    }
                }else{
                    p_domicilio=p_domicilio.substring(0,30);
                }
        
                System.out.print("Ingrese telefono: ");
                p_telefono = teclado.readLine();
                if(p_telefono.length() < 30){
                    for(int i = p_telefono.length(); i < 25; i++){
                        p_telefono=p_telefono+" ";
                    }
                }else{
                    p_telefono=p_telefono.substring(0,30);
                }
            
                System.out.print("Ingrese la compra minima: ");
                p_compraMin = Integer.parseInt(teclado.readLine());
        
                System.out.print("Ingrese el dia de entrega: ");
                p_diaEntrega = Integer.parseInt(teclado.readLine());
        
                
                Laboratorio laboratorio1;
        
                laboratorio1 = new Laboratorio(p_nombre, p_domicilio, p_telefono, p_compraMin, p_diaEntrega);
                

                //grabacion del archivo
                if(archi.length() != 0)
                {
                    archi.seek(archi.length());
                }
                archi.writeInt(codigoLab);
                archi.writeChars(laboratorio1.getNombre());
                archi.writeChars(laboratorio1.getDomicilio());
                archi.writeChars(laboratorio1.getTelefono());
                archi.writeInt(laboratorio1.getCompraMin());
                archi.writeInt(laboratorio1.getDiaEntrega());
                
                //control de creacion de objeto nuevo
                System.out.print("Quiere grabar otro objeto en el archivo? (1 - si) (2 - no): ");
                controlObjNuevo = Integer.parseInt(teclado.readLine());
            }
            archi.close();
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

/*
 * if(p_.length() < 30){
    for(int i = p_.length(); i < 25; i++){
        p_=p_+" ";
    }
}else{
    p_=p_.substring(0,30);
}
*/
