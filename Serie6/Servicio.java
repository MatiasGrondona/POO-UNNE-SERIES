/**
 * Permite crear y manipular un objeto Servicio.
 * @author Grondona Matias
 * @version 01/11/18
 */
public class Servicio {
    private String descripcion;
    private double precio;
    
    /**
     * Constructor for objects of class Servicio.
     * @param  String p_descripcion
     * @param  double p_precio
     */
    Servicio(String p_descripcion, double p_precio){
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
    
    public String getDescripcion (){
        return this.descripcion;
    }
    
    public double getPrecio(){
        return this.precio;
    }
}
