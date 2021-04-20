
/**
 * Permite crear y manipular un objeto de tipo Paciente.
 * 
 * @author Matias Grondona 
 * @version 02/09/18
 */
public class Paciente
{
    // instance variables
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * Constructor for objects of class Paciente
     * 
     * @param int p_historia
     * @param String p_nombre
     * @param String p_domicilio
     * @param Localidad p_nacido
     * @param Localidad p_vive
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_nacido, Localidad p_vive)
    {
        // initialise instance variables
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_nacido);
        this.setLocalidadVive(p_vive);
    }
    //setters
    /**
     * Setters de la clase Paciente, cambian es estado de los atributos del objeto instanciado.
     */
    private void setHistoriaClinica(int p_historia)
    {
        this.historiaClinica = p_historia;
    }
    
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio)
    {
        this.domicilio = p_domicilio;
    }
    
    private void setLocalidadNacido(Localidad p_nacido)
    {
        this.localidadNacido = p_nacido;
    }
    
    private void setLocalidadVive(Localidad p_vive)
    {
        this.localidadVive = p_vive;
    }
    //getters
    /**
     * Getters de la clase Paciente, retornan el estado de los atributos del objeto instanciado.
     */
    public int getHistoriaClinica()
    {
        return this.historiaClinica;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getDomicilio()
    {
        return this.domicilio;
    }
    
    public Localidad getLocalidadNacido()
    {
        return this.localidadNacido;
    }
    
    public Localidad getLocalidadVive()
    {
        return this.localidadVive;
    }
    //metodos especificos
    /**
    * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
    */
    public void mostrarDatosPantalla()
    {
        System.out.println("Paciente: "+this.getNombre()+"\t Historia Clinica: "+this.getHistoriaClinica()+
                            "\t Domicilio: "+this.getDomicilio());
        System.out.println(this.getLocalidadVive().mostrar());
    }
    
    /**
     * Retorna el estado de los atributos del objeto con un formato determinado.
     * 
     * @return retorna un String con el estado de los atributos del objeto.
     */
    public String cadenaDeDatos()
    {
        return this.getNombre()+"....."+this.getHistoriaClinica()+"....."+this.getDomicilio()+"....."+"-"+
               this.getLocalidadVive().getNombre()+" - "+this.getLocalidadVive().getProvincia();
    }
}
