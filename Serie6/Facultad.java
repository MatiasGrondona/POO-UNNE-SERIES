
/**
 * Permite modelar un objeto de tipo Facultad.
 * 
 * @author Matias Grondona 
 * @version 09/10/18
 */
import java.util.*;
public class Facultad
{
    // instance variables
    private String nombre;
    private ArrayList<Profesor> profesores;
    
    /**
     * Constructor for objects of class Facultad
     * 
     * @param  String p_nombre
     * @param ArrayList<Profesor> p_profesores
     */
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
    
    /**
     * Constructor for objects of class Facultad
     * 
     * @param  String p_nombre
     * @param  Profesor p_profesor
     */
    public Facultad(String p_nombre, Profesor p_profesor)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<Profesor>());
        this.agregarProfesor(p_profesor);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    //agregar y quitar
    /**
     * Agrega un elemento al final de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    
    /**
     * Elimina un elemento de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean quitarProfesor(Profesor p_profesor){
        return this.getProfesores().remove(p_profesor);
    }
    //metodos especificios
    /**
     * imprime en pantalla, con un formato determinado, una nomina con los objetos en el ArrayList de Profesores.
     */
    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: ");
        System.out.println("***************------------------------------------------------------------------");
        for(int i = 0; i < this.getProfesores().size(); i++){
            System.out.println("***************"+this.getProfesores().get(i).mostrarLinea());
        }
        System.out.println("***************------------------------------------------------------------------");
        System.out.println("***************Total a pagar: ");
    }
    
    /**
     * Suma el sueldo total de todos los profesores de la facultad y lo retorna.
     * @return double la sumade los sueldo de todos los profesores.
     */
    public double totalAPagar(){
        double total = 0;
        for(int i = 0; i < this.getProfesores().size(); i++){
            total = total + this.getProfesores().get(i).sueldoTotal();
        }
        return total;
    }
    
    /**
     * imprime en pantalla, con un formato determinado, una lista con los objetos en el ArrayList de Profesores.
     */
    public void listarProfesorCargos(){
        int contProfe = 0;
        System.out.println("***** Detalle de Profesores y cargos de Facultad: "+this.getNombre()+" *****");
        System.out.println("--------------------------------------------------------------------------------");
        for(int i = 0; i < this.getProfesores().size(); i++){
            this.getProfesores().get(i).listarCargos();
            System.out.println("------------------ **** -------------------");
            contProfe = contProfe + 1;
        }
        
        System.out.println("Hay "+contProfe+" profesores");
    }
    
}
