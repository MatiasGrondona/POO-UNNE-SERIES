
/**
 * Permite crear y modificar objetos de tipo Escuela.
 * 
 * @author Matias Grondona 
 * @version 28/08/18
 */
public class Escuela
{
    // instance variables
    private String nombre;
    private String domicilio;
    private String director;

    /**
     * Constructor for objects of class Docente.
     * @param String p_nombre
     * @param String p_domicilio
     * @param String p_director
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    //setters
    /**
     * Setters de la clase Escuela, permiten cambiar el estado de los atributos del objeto.
     */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio)
    {
        this.domicilio = p_domicilio;
    }
    
    private void setDirector(String p_director)
    {
        this.director = p_director;
    }
    //Getters
    /**
     * Getters de la clase Escuela, retornan el estado de los atributos del objeto.
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getDomicilio()
    {
        return this.domicilio;
    }
    
    public String getDirector()
    {
        return this.director;
    }
    
    /**
     * Imprime en pantalla el estado de los atributos del objeto, siguiendo un formato determinado.
     * 
     * @param  Docente p_docente  recibe un objeto de tipo docente como parametro.
     */
    public void imprimir(Docente p_docente)
    {
        System.out.println("Escuela: "+this.getNombre()+"\t Domicilio: "+this.getDomicilio()+"\t Director: "+this.getDirector());
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Docente: \t"+p_docente.getNombre());
        System.out.println("Sueldo: .................."+p_docente.calcularSueldo());
        System.out.println("Sueldo Basico: ..........."+p_docente.getSueldoBasico());
        System.out.println("Asignacion Familiar:......"+p_docente.getAsignacion());
    }
}
