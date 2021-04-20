import java.util.ArrayList;

/**
 * Una Clase abstracta que permite aglomerar el comportamiento comun de varias clases.
 * 
 * @author Matias Grondona 
 * @version 18/10/18
 */
public abstract class Alojamiento {
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;
    
    /**
     * Constructor for objects of class Alojamiento.
     * @param  String p_nombre
     * @param  double p_precio
     * @param  int p_dias
     */
    public Alojamiento(String p_nombre, double p_precio, int p_dias){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiasAlquiler(p_dias);
        this.setServicios(new ArrayList<Servicio>());
    }
    
    /**
     * Constructor for objects of class Alojamiento.
     * @param  String p_nombre
     * @param  double p_precio
     * @param  int p_dias
     * @param  Servicio p_servicio
     */
    public Alojamiento(String p_nombre, double p_precio, int p_dias, Servicio p_servicio){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiasAlquiler(p_dias);
        this.setServicios(new ArrayList<Servicio>());
        this.agregarServicio(p_servicio);
    }
    
    /**
     * Constructor for objects of class Alojamiento.
     * @param  String p_nombre
     * @param  double p_precio
     * @param  int p_dias
     * @param  ArrayList<Servicio> p_servicios
     */
    public Alojamiento(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiasAlquiler(p_dias);
        this.setServicios(p_servicios);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setPrecioBase(double p_precio){
        this.precioBase = p_precio;
    }
    
    private void setDiasAlquiler(int p_dias){
        this.diasAlquiler = p_dias;
    }
    
    private void setServicios(ArrayList<Servicio> p_servicios){
        this.servicios = p_servicios;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecioBase(){
        return this.precioBase;
    }
    
    public int getDiasAlquiler(){
        return this.diasAlquiler;
    }
    
    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }
    //agregar y quitar
    /**
     * Agrega un elemento al final de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }
    
    /**
     * Elimina un elemento de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }
    //metodos especificos
    /**
     * Metodo abstracto que tiene que ser redefinido en las clases hija.
     */
    public abstract int contar(String p_alojamiento);
    
    /**
     * Re escribe el metodo costo de la super clase y añade el extra por el tipo de Habitacion.
     * @Override
     * @return double retorna el costo total de alojamiento.
     */
    public double costo(){
        return this.getPrecioBase()*this.getDiasAlquiler();
    }
    
    /**
     * Imprime en pantalla todos los servicios usados en el alojamiento.
     */
    public void listarServicios(){
        for(int i = 0; i > this.getServicios().size(); i++){
            System.out.println(this.getServicios().get(i).getDescripcion()+": "+this.getServicios().get(i).getPrecio());
        }
    }
    
    /**
     * Suma el costo de todos los servicios usados en el alojamiento.
     * @return double retorna la suma del costo de los servicios usados
     */
    public double costoServicios(){
        double total = 0;
        for(int i = 0; i > this.getServicios().size(); i++){
            total = total + this.getServicios().get(i).getPrecio();
        }
        return total;
    }
    
    /**
     * Imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void liquidar(){
        System.out.println("Alojamiento: "+this.getNombre());
        System.out.println("Costo por "+this.getDiasAlquiler()+"dias: "+this.costo());
        this.listarServicios();
    }
}


