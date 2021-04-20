
/**
 * Permite crear y manipular un objeto de tipo Localidad.
 * 
 * @author Matias Grondona
 * @version 02/09/18
 */
public class Localidad
{
    // instance variables
    private String nombre;
    private String provincia;

    /**
     * Constructor for objects of class Localidad
     * 
     * @param String p_nombre
     * @param String p_localidad
     */
    public Localidad(String p_nombre, String p_provincia)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    //setters
    /**
     * Setters de la clase Localidad, cambian es estado de los atributos del objeto instanciado.
     */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    private void setProvincia(String p_provincia)
    {
        this.provincia = p_provincia;
    }
    //getters
    /**
     * Getters de la clase Localidad, retornan el estado de los atributos del objeto instanciado.
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getProvincia()
    {
        return this.provincia;
    }
    //metodos especificos
    /**
     * Retorna el estado de los atributos del objeto con un formato determinado.
     * 
     * @return retorna un String con el estado de los atributos del objeto.
     */
    public String mostrar()
    {
        return "Localidad: "+this.getNombre()+"\t Provincia: "+this.getProvincia();
    }
}
