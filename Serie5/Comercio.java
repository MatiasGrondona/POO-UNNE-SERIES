
/**
 * permite crear y manipular un objeto de tipo comercio el cual tiene una coleccion de tipo HashMap
 * 
 * @author Matias Grondona
 * @version 05/10/18
 */
import java.util.*;
public class Comercio
{
    // instance variables
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    /**
     * Constructor for objects of class Comercio
     * @param  String p_nombre
     */
    public Comercio(String p_nombre)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    
    /**
     * Constructor for objects of class Comercio
     * @param  String p_nombre
     * @param  HashMap<Long, Empleado> p_empleados
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    //agregar y quitar
    /**
     * Permite agregar un objeto a la coleccion.
     * @param Empleado p_empleado
     */
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(new Long(p_empleado.getCuil()), p_empleado);
    }
    
    /**
     * Permite quitar un objeto de la coleccion.
     * @param  long p_cuil
     * @return  retorna el objeto eliminado
     */
    public Empleado bajaEmpleado(long p_cuil){
        return this.getEmpleados().remove(new Long(p_cuil));
    }
    //metodos especificos
    /**
     * Retorna la cantidad de objetos en la coleccion empleados.
     * @return retorna la cantidad de objetos en la coleccion
     */
    public int cantidadEmpleados(){
        return this.getEmpleados().size();
    }
    
    /**
     * Busca en la coleccion usando unicamente la clave.
     * @param  long p_cuil
     * @return  retona un boolean con el resultado de la operacion.
     */
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(new Long(p_cuil));
    }
    
    /**
     * Busca en la coleccion un elemento determinado usando la LU como clave.
     * @param long p_cuil
     * @return retorna el obteto si es que lo encuentra.
     */
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(new Long(p_cuil));
    }
    
    /**
     * Imprime en pantalla el promedio de un alumno determinado, identificandolo con su LU.
     * @param long p_cuil
     */
    public void sueldoNeto(long p_cuil){
        System.out.println("****-- Sueldo Neto del empleado "+p_cuil+" --****");
        System.out.println("Sueldo Neto: "+this.getEmpleados().get(new Long(p_cuil)).sueldoNeto());
    }
    
    /**
     * Imprime en pantalla un listado de todos los objetos de la coleccion alumnos.
     */
    public void nomina(){
        System.out.println("**** Nomina de empleados de IMPULSO ****");
        for(Map.Entry <Long, Empleado> p : empleados.entrySet()){
            System.out.println(p.getKey() + ""+p.getValue().nomYApe()+"------------- $"+p.getValue().sueldoNeto());
        }
    }
}
