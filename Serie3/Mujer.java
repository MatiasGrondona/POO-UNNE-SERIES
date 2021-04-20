
/**
 * Permite crear y manipular un objeto de tipo Mujer.
 * 
 * @author Matias Grondona
 * @version 03/09/18
 */
public class Mujer
{
    // instance variables
    private String nombre;                            
    private String apellido;                            
    private int edad;                            
    private String estadoCivil;                            
    private Hombre esposo;                             

    /**
     * Constructor for objects of class Mujer
     * 
     * @param String p_nombre
     * @param String p_apellido
     * @param int p_edad
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }
    
    /**
     * Constructor for objects of class Mujer
     * 
     * @param String p_nombre
     * @param String p_apellido
     * @param int p_edad
     * @param Hombre p_esposo
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casada");
        this.setEsposo(p_esposo);
    }  
    // Setters
    /**
     * Setters de la clase Mujer, cambian es estado de los atributos del objeto instanciado.
     */
    private void setNombre (String nombre) {
        this.nombre = nombre;
    }
    private void setApellido (String apellido) {
        this.apellido = apellido;
    }
    private void setEdad (int edad) {
        this.edad = edad;
    }
    private void setEstadoCivil (String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    private void setEsposo (Hombre esposo) {
        this.esposo = esposo;
    }   
    // Getters
    /**
     * Getters de la clase Mujer, retornan el estado de los atributos del objeto instanciado.
     */
    public String getNombre () {
        return this.nombre;
    }
    public String getApellido () {
        return this.apellido;
    }
    public int getEdad () {
        return this.edad;
    }
    public String getEstadoCivil () {
        return this.estadoCivil;
    }
    public Hombre getEsposo () {
        return this.esposo;
    }
    //metodos especificos
    /**
     * Cambia el estado de los atributos estadoCivil y esposo.
     * 
     * @param  Hombre p_esposo
     */
    public void casarce(Hombre p_esposo)
    {
        this.setEstadoCivil("Casada");
        this.setEsposo(p_esposo);
    }
    
    /**
     * Cambia el estado de los atributos estadoCivil y esposo.
     */
    public void divorcio()
    {
        this.setEstadoCivil("Divorciada");
        this.setEsposo(null);
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
     * Imprime en pantalla con un formato determinado, el estado del atributo esposo.
     */
    public void casadaCon()
    {
        System.out.println(this.datos()+" esta casada con "+this.getEsposo().datos());
    } 
}
