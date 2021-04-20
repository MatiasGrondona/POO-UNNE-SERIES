
/**
 * permite crear y manipular un objeto de tipo Curso el cual tiene una coleccion de tipo HashMap.
 * 
 * @author Matias Grondona
 * @version 04/10/18
 */
import java.util.HashMap;
import java.util.*;
public class Curso
{
    // instance variables
    private String nombre;
    private HashMap <Integer, Alumno> alumnos;
    /**
     * Constructor for objects of class Curso
     * @param String p_nombre
     * @param HashMap<Integer, Alumno> p_alumnos
     */
    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    /**
     * Constructor for objects of class Curso
     * @param String p_nombre
     */
    public Curso(String p_nombre)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<Integer, Alumno>());
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlumnos(HashMap<Integer, Alumno> p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap<Integer, Alumno> getAlumnos(){
        return this.alumnos;
    }
    //agregar y quitar
    /**
     * Permite agregar un objeto a la coleccion.
     * @param Alumno p_alumno
     */
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(new Integer(p_alumno.getLu()), p_alumno);
    }
    
    /**
     * Permite quitar un objeto de la coleccion.
     * @param  int p_lu
     * @return  retorna el objeto eliminado
     */
    public Alumno quitarAlumno(int p_lu){
        return this.getAlumnos().remove(new Integer(p_lu));
    }
    //metodos especificos
    /**
     * Retorna la cantidad de objetos en la coleccion.
     * @return Cuantos objetos hay en la coleccion.
     */
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    
    /**
     * Busca en la coleccion usando un objeto.
     * @param  Alumno p_alumno
     * @return  retona un boolean con el resultado de la operacion.
     */
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }
    
    /**
     * Busca en la coleccion usando unicamente la clave.
     * @param  int p_lu
     * @return  retona un boolean con el resultado de la operacion.
     */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(new Integer(p_lu));
    }
    
    /**
     * Busca en la coleccion un elemento determinado usando la LU como clave.
     * @param int p_lu
     * @return retorna el obteto si es que lo encuentra.
     */
    public Alumno buscarAlumno(int p_lu){
        return this.getAlumnos().get(new Integer(p_lu));
    }
    
    /**
     * Imprime en pantalla el promedio de un alumno determinado, identificandolo con su LU.
     * @param int p_lu
     */
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("****-- Mostrar promedio del alumno "+p_lu+" --****");
        System.out.println("Promedio: "+this.getAlumnos().get(new Integer(p_lu)).promedio());
    }
    
    /**
     * Imprime en pantalla un listado de todos los objetos de la coleccion alumnos.
     */
    public void mostrarInscriptos(){
        System.out.println("****-- Cantidad de inscriptos: "+this.getAlumnos().size());
        for(Map.Entry <Integer, Alumno> p : alumnos.entrySet()){
            System.out.println(p.getKey() + " "+p.getValue().nomYApe());
        }
    }
}
