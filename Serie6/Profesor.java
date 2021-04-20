
/**
 * Permite modelar un objeto de tipo Profesor que hereda de Persona.
 * 
 * @author Matias Grondona 
 * @version 09/10/18
 */
import java.util.*;
public class Profesor extends Persona
{
    // instance variables
    private String titulo;
    private ArrayList<Cargo> cargos;

    /**
     * Constructor for objects of class Profesor
     * @param   String  p_nombre
     * @param   String  p_apellido  
     * @param   int  p_dni
     * @param   Calendar p_fecha
     * @param   String p_titulo
     * @param   Cargo p_cargo
     */
    public Profesor(String p_nombre, String p_apellido, int p_dni, Calendar p_fecha, String p_titulo, Cargo p_cargo)
    {
        // initialise instance variables
        super(p_dni, p_nombre, p_apellido, p_fecha);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<Cargo>());
        this.agregarCargo(p_cargo);
    }
    
    /**
     * Constructor for objects of class Profesor
     * @param   String  p_nombre
     * @param   String  p_apellido  
     * @param   int  p_dni
     * @param   int  p_anio
     * @param   String p_titulo
     * @param   ArrayList<Cargo> p_cargos
     */
    public Profesor(String p_nombre, String p_apellido, int p_dni, int p_anio, String p_titulo, ArrayList<Cargo> p_cargos)
    {
        // initialise instance variables
        super (p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    private void setCargos(ArrayList<Cargo> p_cargos){
        this.cargos = p_cargos;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    //agregra y quitar
    /**
     * Permite agregar un cargo al profesor. Sólo será posible si éste tiene menos de tres cargos
     * @param Cargo p_cargo
     * @return Retorna true si el cargo fue agregado satisfactoriamente. Retorna false en caso contrario
     */
    public boolean agregarCargo(Cargo p_cargo) {
        if(this.getCargos().size()<3) {
            return this.getCargos().add(p_cargo);
        }else{
            return false;
        }
    }
    
    /**
     * Permite remover un cargo al profesor. Sólo será posible si éste tiene más de un cargo
     * @param Cargo p_cargo Representa el cargo del profesor
     * @return Retorna true si el cargo fue removido satisfactoriamente. Retorna false en caso contrario
     */
    public boolean removerCargo(Cargo p_cargo) {
        if(this.getCargos().size()>1) {
            return this.getCargos().remove(p_cargo);
        }else{
            return false;
        }
    }
    //metodos especificos
    /**
     * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo: "+this.getTitulo());
        this.listarCargos();
        System.out.println("** Sueldo Total: "+this.sueldoTotal()+" **");
    }
    
     /**
     * imprime en pantalla, con un formato determinado, un listado de los Cargos del objeto.
     */
    public void listarCargos(){
        System.out.println("-***** Cargos Asignados *****-");
        System.out.println("---------------------------------------");
        for(int i = 0; i < this.getCargos().size(); i++){
            this.getCargos().get(i).mostrarCargo();
            System.out.println();
        }
    }
    
    /**
     * Suma el sueldo de cada cargo y lo retorna.
     * @return double retorna la suma de todos los sueldos de los cargos del profesor
     */
    public double sueldoTotal(){
        double totalSueldos = 0;
        for(int i = 0; i < this.getCargos().size(); i++){
            totalSueldos = totalSueldos + this.getCargos().get(i).sueldoDelCargo();
        }
        return totalSueldos;
    }
    
    /**
     * Retorna una cadena de carracteres con el estado de los atributos del objeto.
     * @return String cadena de carracteres con el estado de los atributos.
     */
    public String mostrarLinea(){
        return "DNI: "+this.getDNI()+" - Nombre: "+this.nomYApe()+" - Sueldo Total: "+this.sueldoTotal();
    }
}
