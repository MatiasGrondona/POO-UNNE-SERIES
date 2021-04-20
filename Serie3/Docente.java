
/**
 * Write a description of class Escuela here.
 * 
 * @author Matias Grondona
 * @version 03/09/18
 */
public class Docente
{
    // instance variables
    private String nombre;
    private String grado;
    private Double sueldoBasico;
    private Double asignacionFamiliar;

    /**
     * Constructor for objects of class Escuela
     * @param  
     * @param  
     * @param  
     * @param  
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacion)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacion(p_asignacion);
    }
    //Setters
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    private void setGrado(String p_grado)
    {
        this.grado = p_grado;
    }
    
    private void setSueldoBasico(double p_sueldo)
    {
        this.sueldoBasico = p_sueldo;
    }
    
    private void setAsignacion(double p_asignacion)
    {
        this.asignacionFamiliar = p_asignacion;
    }
    //Getters
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getGrado()
    {
        return this.grado;
    }
    
    public double getSueldoBasico()
    {
        return this.sueldoBasico;
    }
    
    public double getAsignacion()
    {
        return this.asignacionFamiliar;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double calcularSueldo()
    {
        return this.getSueldoBasico()+this.getAsignacion();
    }
}
