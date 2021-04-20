
/**
 * Permite crear y manipular un objeto Zoologico.
 * 
 * @author Matias Grondona
 * @version 27/10/18
 */
import java.util.*;
public class Zoologico
{
    // instance variables
    private String nombre;
    private ArrayList<Visitante> visitantes;

    /**
     * Constructor for objects of class Zoologico
     * @param String p_nombre
     */
    public Zoologico(String p_nombre)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
    }
    
    /**
     * Constructor for objects of class Zoologico
     * @param String p_nombre
     * @param Visitante p_visitante
     */
    public Zoologico(String p_nombre, Visitante p_visitante)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
        this.nuevoVisitante(p_visitante);
    }
    
    /**
     * Constructor for objects of class Zoologico
     * @param String p_nombre
     * @param ArrayList<Visitante> p_visitantes
     */
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }
    //agregar y quitar visitantes
    /**
     * Agrega un elemento al final de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean nuevoVisitante(Visitante p_visitante){
        return this.getVisitantes().add(p_visitante);
    }
    
    /**
     * Elimina un elemento de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }
    //metodos especificos
    /**
     * Imprime en pantalla los visitantes de una fecha y tipo determinado.
     * @param Calendar p_fecha
     * @param String p_tipoVisitante
     */
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        System.out.println("Listado de visitantes del dia: "+ p_fecha.get(Calendar.DATE) + "/"
                                                            + (p_fecha.get(Calendar.MONTH)+1) + "/"
                                                            + p_fecha.get(Calendar.YEAR)+" del tipo: "+p_tipoVisitante);
        
        for(int i = 0; i < this.getVisitantes().size(); i++){
            this.getVisitantes().get(i).listarPorFecha(p_fecha, p_tipoVisitante);
        }
    }
    
    /**
     * Imprime en pantalla los visitantes de una fecha determinada.
     * @param Calendar p_fecha
     */
    public void listarVisitante(Calendar p_fecha){
        int p_dia = p_fecha.get(Calendar.DATE);
        int p_mes = p_fecha.get(Calendar.MONTH);
        int p_año = p_fecha.get(Calendar.YEAR);
        
        int v_dia;
        int v_mes;
        int v_año;
        System.out.println("Listado de visitantes del dia: "+ p_fecha.get(Calendar.DATE) + "/"
                                                            + (p_fecha.get(Calendar.MONTH)+1) + "/"
                                                            + p_fecha.get(Calendar.YEAR));
        for(int i = 0; i < this.getVisitantes().size(); i++){
            v_dia = this.getVisitantes().get(i).getFechaVisita().get(Calendar.DATE);
            v_mes = this.getVisitantes().get(i).getFechaVisita().get(Calendar.MONTH);
            v_año = this.getVisitantes().get(i).getFechaVisita().get(Calendar.YEAR);
            if(p_dia == v_dia && p_mes == v_mes && p_año == v_año){
                this.getVisitantes().get(i).mostrar();
            }
        }
    }
    
    /**
     * Suma el costo de las entradas de los visitantes entre dos fechas.
     * @param Calendar p_fechaDesde
     * @param Calendar p_fechaHasta
     * @return double retorna el total de la recaudacion entre dos fechas.
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
        double totalRecaudacion = 0;
        for(int i = 0; i < this.getVisitantes().size(); i++){
            if(p_fechaHasta.after(this.getVisitantes().get(i).getFechaVisita()) && 
                p_fechaDesde.before(this.getVisitantes().get(i).getFechaVisita())){
                totalRecaudacion = totalRecaudacion + this.getVisitantes().get(i).entrada();
            }
        }
        return totalRecaudacion;
    }
}
