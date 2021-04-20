
/**
 * Permite crear y manipular un objeto Individuo que hereda de visitante.
 * 
 * @author Matias Grondona
 * @version 01/11/18
 */
import java.util.*;
public class Individuo extends Visitante
{
    // instance variables
    private Persona persona;

    /**
     * Constructor for objects of class Individuo.
     * @param String p_nombre
     * @param Calendar p_fecha
     * @param Persona p_persona
     */
    public Individuo(String p_nombre, Calendar p_fecha, Persona p_persona)
    {
        // initialise instance variables
        super(p_nombre, p_fecha);
        this.setPersona(p_persona);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    
    public Persona getPersona(){
        return this.persona;
    }
    //metodos especificos
    /**
     * Imprime en pantalla los datos del Individuo.
     */
    public void mostrar(){
        this.getPersona().mostrar();
    }
    
    /**
     * Retorna el costo de la entrada para el individuo.
     * @return double retorna el costo de la entrada.
     */
    public double entrada(){
        return 10.0;
    }
    
    /**
     * Imprime en pantalla los datos de los integrantes de un tipo y fecha determinado.
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        int p_dia = p_fecha.get(Calendar.DATE);
        int p_mes = p_fecha.get(Calendar.MONTH);
        int p_año = p_fecha.get(Calendar.YEAR);
        
        int v_dia = this.getFechaVisita().get(Calendar.DATE);
        int v_mes = this.getFechaVisita().get(Calendar.MONTH);
        int v_año = this.getFechaVisita().get(Calendar.YEAR);
        if( (p_dia == v_dia && p_mes == v_mes && p_año == v_año) && p_visitante.equals(this.tipoVisitante())){
            this.mostrar();
        }
    }
    
    /**
     * Retorna una cadena de carracteres con el tipo del objeto.
     * @return String retorna una cadena de caracteres con el siguiente contenido "Individuo".
     */
    public String tipoVisitante(){
        return "Individuo";
    }
    
}
