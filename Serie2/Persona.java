/**
 * Permite crear y manipular un objeto persona.
 * 
 * @author Matias Grondona 
 * @version 21/08/18
 */
import java.util.*;
public class Persona
{
    // instance variables
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    /**
     * Constructor for objects of class Persona
     * 
     * @param p_dni
     * @pararm p_nombre
     * @param p_apellido 
     * @param p_anio
     * 
     */
    public Persona(int p_dni,String p_nombre, String p_apellido, int p_anio)
    {
        // initialise instance variables
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    //metodos setters
    /**
     * Asigna un estado al atributo nroDni del objeto
     * 
     * @param  p_dni      
     */
    private void setDNI(int p_dni)
    {
        // put your code here
        this.nroDni = p_dni;
    }
    
    /**
     * Asigna un estado al atributo nombre del objeto
     * 
     * @param  p_nombre
     */
    private void setNombre (String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna un estado al atributo apellido del objeto
     * 
     * @param  p_apellido
     */
    private void setApellido (String p_apellido)
    {
        this.apellido = p_apellido;
    }
    
    /**
     * Asigna un estado al atributo anioNacimiento del objeto
     * 
     * @param  p_anio 
     */
    private void setAnioNacimiento (int p_anio)
    {
        this.anioNacimiento = p_anio;
    }
    //Metodos getters
    /**
     * getters de la clase Persona, retornan el estado de los atributos del objeto instanciado
     */
    public int getDNI()
    {
        return this.nroDni;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public int getAnioNacimiento()
    {
        return this.anioNacimiento;
    }
    //metodos especificos
    /**
     * retorna la edad de la Persona
     * @return retorna la edad de la Persona
     */
    public int edad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy-this.getAnioNacimiento();
        
    }
    /**
     * Retorna una cadena de caracteres con los atributos nombre y apellido.
     * @return retorna una cadena de caracteres con los atributos nombre y apellido
     */
    public String nomYApe()
    {
        return this.getNombre()+" "+this.getApellido();
    }
    /**
     * Retorna una cadena de caracteres con los atributos apellido y nombre.
     * @return retorna una cadena de caracteres con los atributos apellido y nombre
     */
    public String apeYNom()
    {
        return this.getApellido()+" "+this.getNombre();
    }
    /**
     * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void mostrar()
    {
        System.out.println("Nombre y Apellido:"+this.nomYApe());
        System.out.println("DNI: "+this.getDNI()+" "+"Edad: "+this.edad()+" años");
    }
    
}
