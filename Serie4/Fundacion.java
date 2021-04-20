
/**
 * Permite crear y manipular un objeto de tipo Fundacion.
 * 
 * @author Matias Grondona
 * @version 20/09/18
 */
import java.io.*;
import java.io.OutputStream;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.util.*;
public class Fundacion
{
    // instance variables
    private String nombre;
    
    /**
     * Constructor for objects of class Fundacion.
     * @param  String p_nombre
     */
    public Fundacion(String p_nombre)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
    }
    /**
     * Setters y Getters de la clase.
     */
    //setters
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    //getters
    public String getNombre()
    {
        return this.nombre;
    }
    //metodos especificos
    /**
     * Imprime con un formato determiado los atributos de los objetos recibidos por parametro.
     * @param  Evento p_evento
     * @param  Persona p_persona
     */
    public void imprimirInvitacion(Evento p_evento, Persona p_persona)
    {
        System.out.println("*---------------------------------------------------------------------------*");
        System.out.println("Estimado/a: "+p_persona.nomYApe());
        System.out.println();
        System.out.println("La Fundación "+this.getNombre());
        System.out.println("Invita a Ud. al próximo evento: "+p_evento.getNombre());
        System.out.println("Las inscripciones se realizan con "+p_evento.getDiasInscripcion()+" días de anticipación.");
        System.out.print("Las mismas se llevarán a cabo el día: ");
        System.out.println( p_evento.fechaInscripcion().get(Calendar.DATE) + "/"
                          + (p_evento.fechaInscripcion().get(Calendar.MONTH)+1) + "/"
                          + p_evento.fechaInscripcion().get(Calendar.YEAR));
        System.out.println("El evento tendrá lugar en:"+p_evento.getLugar()+",");
        
        Date f_date = p_evento.getFecha().getTime();
        DateFormat formato1 = DateFormat.getDateInstance(DateFormat.FULL);
        
        System.out.println(formato1.format(f_date));
        System.out.println("Costo: "+p_evento.costoFinal(p_persona.edad())+"Lo esperamos.");
        System.out.println("*---------------------------------------------------------------------------*");
    }
    
    /**
     * Graba en un archivo secuencial.
     * @param  Evento p_evento
     * @param  Persona p_persona
     * @param  DataOutputStream unArchivo
     */
    public void grabarInvitacion(Evento p_evento, Persona p_persona, DataOutputStream unArchivo)
    {
        try{
        
            unArchivo.writeInt(p_persona.getDNI());
            unArchivo.writeUTF(p_persona.apeYNom());
            unArchivo.writeUTF(p_evento.getNombre());
            unArchivo.writeUTF(p_evento.getLugar());
            unArchivo.writeDouble(p_evento.getCosto());
            unArchivo.writeInt(p_evento.getFecha().get(Calendar.DATE));
            unArchivo.writeInt(p_evento.getFecha().get(Calendar.MONTH));
            
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
        }
        catch(IOException ioe){
            System.out.println("Error al grabar");
        }
    }
        
}
