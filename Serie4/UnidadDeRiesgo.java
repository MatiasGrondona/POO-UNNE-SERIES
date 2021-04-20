
/**
 * Permite crear y manipular un objeto UnidadDeRiesgo.
 * 
 * @author Matias Grondona 
 * @version 22/09/18
 */
import java.util.GregorianCalendar;
import java.util.*;
public class UnidadDeRiesgo
{
    // instance variables
    private String agricultor;
    private String cultivo;
    private Calendar fechaCosecha;

    /**
     * Constructor for objects of class UnidadDeRiesgo
     * @param String p_agricultor
     * @param String p_cultivo
     * @param Calendar p_fecha
     */
    public UnidadDeRiesgo(String p_agricultor, String p_cultivo, Calendar p_fecha)
    {
        // initialise instance variables
        this.setAgricultor(p_agricultor);
        this.setCultivo(p_cultivo);
        this.setFechaCosecha(p_fecha);
    }
    //setter
    /**
     * Accesor de la clase.
     */
    private void setAgricultor(String p_agricultor)
    {
        this.agricultor = p_agricultor;
    }
    
    private void setCultivo(String p_cultivo)
    {
        this.cultivo = p_cultivo;
    }
    
    private void setFechaCosecha(Calendar p_fecha)
    {
        this.fechaCosecha = p_fecha;
    }
    //getters
    public String getAgricultor()
    {
        return this.agricultor;
    }
    
    public String getCultivo()
    {
        return this.cultivo;
    }
    
    public Calendar getFechaCosecha()
    {
        return this.fechaCosecha;
    }
    //metodos especificos
    /**
     * Imprime en pantalla, con un formato detrminado, el estado de los atributos.
     */
    public void mostrarDetalle()
    {
        System.out.println("-Agricultor: "+this.getAgricultor());
        System.out.println("-Cultivo: "+this.getCultivo());
    }
}
