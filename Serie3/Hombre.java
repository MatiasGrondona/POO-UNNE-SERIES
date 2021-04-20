
/**
 * Permite crear y manipular un objeto de tipo Hombre.
 * 
 * @author Matias Grondona 
 * @version 03/09/18
 */
public class Hombre
{
    // instance variables
    private String nombre;                            
    private String apellido;                            
    private int edad;                            
    private String estadoCivil;                                                       
    private Mujer esposa;

    /**
     * Constructor for objects of class Hombre
     * 
     * @param String p_nombre
     * @param String p_apellido
     * @param int p_edad
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }
    
    /**
     * Constructor for objects of class Hombre
     * 
     * @param String p_nombre
     * @param String p_apellido
     * @param int p_edad
     * @param Hombre p_esposa
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casado");
        this.setEsposa(p_esposa);
    }
    // Setters
    /**
     * Setters de la clase Mujer, cambian es estado de los atributos del objeto instanciado.
     */
    private void setNombre (String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    private void setApellido (String p_apellido) 
    {
        this.apellido = p_apellido;
    }
    
    private void setEdad (int p_edad) 
    {
        this.edad = p_edad;
    }
    
    private void setEstadoCivil (String p_estadoCivil) 
    {
        this.estadoCivil = p_estadoCivil;
    }
    
    private void setEsposa (Mujer p_esposa) 
    {
        this.esposa = p_esposa;
    }  
    // Getters
    /**
     * Getters de la clase Mujer, retornan el estado de los atributos del objeto instanciado.
     */
    public String getNombre () 
    {
        return this.nombre;
    }
    
    public String getApellido () 
    {
        return this.apellido;
    }
    
    public int getEdad () 
    {
        return this.edad;
    }
    
    public String getEstadoCivil () 
    {
        return this.estadoCivil;
    }
    
    public Mujer getEsposa () 
    {
        return this.esposa;
    }
    //metodos especificos
    /**
     * Cambia el estado de los atributos estadoCivil y esposo.
     * 
     * @param  Hombre p_esposo
     */
    public void casarce(Mujer p_esposa)
    {
        this.setEstadoCivil("Casado");
        this.setEsposa(p_esposa);
    }
    
    /**
     * Cambia el estado de los atributos estadoCivil y esposa.
     */
    public void divorcio()
    {
        this.setEstadoCivil("Divorciado");
        this.setEsposa(null);
    }
    
    /**
     * Retorna el estado de los atributos del objeto con un formato determinado.
     * 
     * @return retorna un String con el estado de los atributos del objeto.
     */
    public String datos()
    {
        return this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años";
    }
    
    /**
     * Imprime en pantalla el estado del atributo estadoCivil con un formato determinado.
     */
    public void mostrarEstadoCivil()
    {
        System.out.println(this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años - "+this.getEstadoCivil());
    }
    
    /**
     * Imprime en pantalla con un formato determinado, el estado del atributo esposa.
     */
    public void casadoCon()
    {
        System.out.println(this.datos()+" esta casado con "+this.getEsposa().datos());
    }
    
}
