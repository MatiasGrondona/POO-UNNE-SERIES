
/**
 * Permite crear y manipular objetos de tipo Siniestro.
 * 
 * @author Matias Grondona
 * @version 21/09/18
 */
import java.util.GregorianCalendar;
import java.util.*;
public class Siniestro
{
    // instance variables
    private Calendar fecha;
    private double porcentajeDaño;

    /**
     * Constructor for objects of class Siniestro
     * @param Calendar p_fecha
     * @param double p_daño
     */
    public Siniestro(Calendar p_fecha, double p_daño)
    {
        // initialise instance variables
        this.setFecha(p_fecha);
        this.setPorcentajeDaño(p_daño);
    }
    //setters
    /**
     * Setters y Getters de la clase;
     */
    private void setFecha(Calendar p_fecha)
    {
        this.fecha = p_fecha;
    }
    
    private void setPorcentajeDaño(double p_daño)
    {
        this.porcentajeDaño = p_daño;
    }
    //getters
    public Calendar getFecha()
    {
        return this.fecha;
    }
    
    public double getPorcentajeDaño()
    {
        return this.porcentajeDaño;
    }
    //metodos especificos
    /**
     * Retorna el costo total de indemnizacion, realiza el calculo con el porcentaje de daño y el valor asegurado.
     * 
     * @param double p_valorAsegurado
     * @return double Retorna el costo total de indemnizacion
     */
    public double totalDaño(double p_valorAsegurado)
    {
        double totalDaño;
        totalDaño = this.getPorcentajeDaño()*p_valorAsegurado/100;
        return totalDaño;
    }
    
}
