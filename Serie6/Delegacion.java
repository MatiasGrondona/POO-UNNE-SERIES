
/**
 * Permite crear y manipular un objeto Delegacion que hereda de visitante.
 * 
 * @author Grondona Matias
 * @version 01/11/18
 */
import java.util.*;
public class Delegacion extends Visitante
{
    private ArrayList<Individuo> integrantes;
    /**
     * Constructor for objects of class Delegacion.
     * @param String p_nombre
     * @param Calendar p_fecha
     * @param ArrayList<Individuo> p_integrantes
     */
    public Delegacion(String p_nombre, Calendar p_fecha, ArrayList<Individuo> p_integrantes)
    {
        // initialise instance variables
        super(p_nombre, p_fecha);
        this.setIntegrantes(p_integrantes);
    }
    
    /**
     * Constructor for objects of class Delegacion.
     * @param String p_nombre
     * @param Calendar p_fecha
     * @param Individuo p_integrante
     */
    public Delegacion(String p_nombre, Calendar p_fecha, Individuo p_integrante)
    {
        // initialise instance variables
        super(p_nombre, p_fecha);
        this.setIntegrantes(new ArrayList<>());
        this.agregarIntegrante(p_integrante);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setIntegrantes(ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    public ArrayList<Individuo> getIntegrantes(){
        return this.integrantes;
    }
    //agregar y quitar integrantes
    /**
     * Agrega un elemento al final de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean agregarIntegrante(Individuo p_integrante){
        return this.getIntegrantes().add(p_integrante);
    }
    
    /**
     * Elimina un elemento de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean quitarIntegrante(Individuo p_integrante){
        return this.getIntegrantes().remove(p_integrante);
    }
    //metodos especificos
    /**
     * Imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void mostrar(){
        System.out.println("-------------------------------------------------------------");
         System.out.println("Delegación: "+this.getNombre()+"\n");
         System.out.println("Integrantes");
        for(int i = 0; i < this.getIntegrantes().size(); i++){
            this.getIntegrantes().get(i).mostrar();
        }
         System.out.println("Cantidad de Integrantes: "+this.getIntegrantes().size());
         System.out.println("-------------------------------------------------------------");
    }
    
    /**
     * suma el total de las entradas de todos los integrantes de la delegacion.
     * @return double retorna el total de las entradas.
     */
    public double entrada(){
        double total = 0;
        for(int i = 0; i < this.getIntegrantes().size(); i++){
            total = total + this.getIntegrantes().get(i).entrada();
        } 
        total = total - (10*total/100);
        return total;
    }
    
    /**
     * Imprime en pantalla los datos de los integrantes de un tipo y fecha determinado.
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        int p_dia = p_fecha.get(Calendar.DATE);
        int p_mes = p_fecha.get(Calendar.MONTH);
        int p_año = p_fecha.get(Calendar.YEAR);
        
        int v_dia;
        int v_mes;
        int v_año;
        if(p_visitante.equals(this.tipoVisitante())){
            for(int i = 0; i < this.getIntegrantes().size(); i++){
                v_dia = this.getIntegrantes().get(i).getFechaVisita().get(Calendar.DATE);
                v_mes = this.getIntegrantes().get(i).getFechaVisita().get(Calendar.MONTH);
                v_año = this.getIntegrantes().get(i).getFechaVisita().get(Calendar.YEAR);
                if(p_dia == v_dia && p_mes == v_mes && p_año == v_año){
                    this.getIntegrantes().get(i).mostrar();
                }
            }
        }
    }
    
    /**
     * Retorna una cadena de carracteres con el tipo del objeto.
     * @return String retorna una cadena de caracteres con el siguiente contenido "Delegacion".
     */
    public String tipoVisitante(){
        return "Delegacion";
    }
    
}
