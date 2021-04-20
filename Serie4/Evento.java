
/**
 * Permite crear y manipular un objeto evento.
 * 
 * @author Matias Grondona 
 * @version 20/09/18
 */
import java.util.*;
import java.util.GregorianCalendar;
public class Evento
{
    // instance variables
    private String nombre;
    private String lugar;
    private Calendar fecha;
    private int diasInscripcion;
    private double costo;

    /**
     * Constructor for objects of class Evento
     * @param  String p_nombre
     * @param  String p_lugar
     * @param  Calendar p_fecha
     * @param  int p_diasInscripcion
     * @param  double p_costo
     */
    public Evento(String p_nombre, String p_lugar, Calendar p_fecha, int p_dias, double p_costo)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setLugar(p_lugar);
        this.setFecha(p_fecha);
        this.setDiasInscripcion(p_dias);
        this.setCosto(p_costo);
    }
    //Setters
    /**
     * Setters y Getters de la clase.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setLugar(String p_lugar){
        this.lugar = p_lugar;
    }
    
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    private void setDiasInscripcion(int p_dias){
        this.diasInscripcion = p_dias;
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo;
    } 
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getLugar(){
        return this.lugar;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public int getDiasInscripcion(){
        return this.diasInscripcion;
    }
    
    public double getCosto(){
        return this.costo;
    }
    //metodos especificos
    /**
     * si el invitado supera una edad determinada, entonces, se le aplica un descuento.
     * @param  int p_edadInvitado
     * @return String retorna una leyenda informando si se aplica o no un descuento.
     */
    public String costoFinal(int p_edadInvitado)
    {
        double costoConDesc = this.getCosto();
        if(p_edadInvitado >= 60){
            costoConDesc = costoConDesc - 10*this.getCosto()/100;
            return costoConDesc+" -Incluye Descuento-";
        }
        return costoConDesc+" ";
    }
    
    /**
     * Restando los dias previos de incripcion a la fecha del evento, retorna cuando inicia la inscripcion al evento.
     * @return Calendar Retorna la fecha cuando inicia la inscripcion al evento.
     */
    public Calendar fechaInscripcion()
    {
        Calendar f_calendar = this.getFecha();
        f_calendar.add(Calendar.DATE, -this.getDiasInscripcion());
        return f_calendar;
    }
}
