import java.util.ArrayList;

/**
 * Permite modelar un objeto de tipo Gerencia.
 * @author Matias Grondona
 * @version 23/10/18
 */
public class Gerencia {
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;
    
    
    /**
     * Constructor for objects of class Gerencia.
     * @param  String p_nombre
     */
    public Gerencia(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<>());
    }
    
    /**
     * Constructor for objects of class Gerencia.
     * @param  String p_nombre
     * @param  Alojamiento p_alojamiento
     */
    public Gerencia(String p_nombre, Alojamiento p_alojamiento){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<>());
        this.agregarAlojamiento(p_alojamiento);
    }
    
    /**
     * Constructor for objects of class Gerencia.
     * @param  String p_nombre
     * @param  ArrayList<Alojamiento> p_alojamientos
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientos){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alojamientos);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientos){
        this.alojamientosAlquilados = p_alojamientos;
    }
    
    private String getNombre(){
        return this.nombre;
    }
    
    private ArrayList<Alojamiento> getAlojamientosAlquilados(){
        return this.alojamientosAlquilados;
    }
    //agregar y quitar
    /**
     * Agrega un elemento al final de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    
    /**
     * Elimina un elemento de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }
    
    /**
     * Cuenta la cantidad de alojamientos dependiendo del tipo.
     * @param  String p_tipoAlojamiento
     * @return int retorna la cantidad de alojamientos de un tipo determinado.
     */
    public int contarAlojamiento(String p_tipoAlojamiento){
        int total = 0;
        for(int i = 0; i < this.getAlojamientosAlquilados().size(); i++){
            total = total + this.getAlojamientosAlquilados().get(i).contar(p_tipoAlojamiento);
        }
        return total;
    }
    
    /**
     * Imprime en pantalla la liquidación para todos los alojamientos.
     */
    public void liquidar() {
        int totalAlojamientos=this.getAlojamientosAlquilados().size();
        for(int i=0;i<totalAlojamientos;i++) {
            this.getAlojamientosAlquilados().get(i).liquidar();
        }
    }
    
    /**
     * Imprime en pantalla, con un formato determinado, un listado con todos los alojamientos y el total a liquidar.
     */
    public void mostrarLiquidacion() {
        this.liquidar();
        System.out.println("Alojamiento Tipo Cabaña--->" + this.contarAlojamiento("cabaña"));
        System.out.println("Alojamiento Tipo Hotel--->" + this.contarAlojamiento("hotel"));
    }
}

