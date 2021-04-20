/**
 * Abstract class Visitante.
 * 
 * @author: Matias Grondona
 * Date: 27/10/18
 */
import java.util.*;
public abstract class Visitante
{
    // instance variables
    private String nombre;
    private Calendar fechaVisita;
    
    /**
     * Constructor for objects of class Visitante.
     * @param String p_nombre
     * @param Calendar p_fecha
     * @param Persona p_persona
     */
    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setFechaVisita(Calendar p_fecha){
        this.fechaVisita = p_fecha;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }
    //metodos especificos
    /**
     * metodo abstracto que debe ser redefinido en las clases hijas.
     */
    public abstract void mostrar();
    
    /**
     * metodo abstracto que debe ser redefinido en las clases hijas.
     */
    public abstract double entrada();
    
    /**
     * metodo abstracto que debe ser redefinido en las clases hijas.
     */
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    
    /**
     * metodo abstracto que debe ser redefinido en las clases hijas.
     */
    public abstract String tipoVisitante();
}
