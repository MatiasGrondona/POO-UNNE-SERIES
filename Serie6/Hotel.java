import java.util.ArrayList;

/**
 * Permite crear y manipular un objeto Hotel que hereda de Alojamiento.
 * @author Grondona Matias
 * @version 01/11/18
 */
public class Hotel extends Alojamiento{
    private String tipoHabitacion;
    
    /**
     * Constructor for objects of class Hotel.
     * @param  String p_nombre
     * @param  double p_precio
     * @param  int p_dias
     * @param  ArrayList<Servicio> p_servicios
     * @param  int p_tipoHabitacion
     */
    public Hotel(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios, String p_tipoHabitacion){
        super(p_nombre, p_precio, p_dias, p_servicios);
        this.setTipoHabitacion(p_tipoHabitacion);
    }
    
    /**
     * Constructor for objects of class Hotel.
     * @param  String p_nombre
     * @param  double p_precio
     * @param  int p_dias
     * @param  Servicio p_servicio
     * @param  int p_tipoHabitacion
     */
    public Hotel(String p_nombre, double p_precio, int p_dias,Servicio p_servicio, String p_tipoHabitacion){
        super(p_nombre, p_precio, p_dias, p_servicio);
        this.setTipoHabitacion(p_tipoHabitacion);
    }
    
    /**
     * Constructor for objects of class Hotel.
     * @param  String p_nombre
     * @param  double p_precio
     * @param  int p_dias
     * @param  int p_tipoHabitacion
     */
    public Hotel(String p_nombre, double p_precio, int p_dias, String p_tipoHabitacion){
        super(p_nombre, p_precio, p_dias);
        this.setTipoHabitacion(p_tipoHabitacion);
    }
    
    /**
     * Accessors de la clase.
     */
    private void setTipoHabitacion(String p_tipo){
        this.tipoHabitacion = p_tipo;
    }
    
    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }
    //metodos especificos
    /**
     * Re escribe el metodo costo de la super clase y añade el extra por el tipo de Habitacion.
     * @Override
     * @return double retorna el costo total de alojamiento.
     */
    public double costo(){
        double total;
        if(this.getTipoHabitacion().equals("Single") || this.getTipoHabitacion().equals("single")){
            total = super.costo() + (20*this.getDiasAlquiler());
        }else{
            total = super.costo() + (35*this.getDiasAlquiler());
        }
        return total;
    }
    
    /**
     * evalua si el alojamineto es de tipo Hotel y restorna 1 de ser asi.
     * @Override
     * @return retorna 1 si el alojamiento es de tipo Hotel.
     */
    public int contar(String p_alojamiento){
        int retorno = 0;
        if(p_alojamiento.equals("Hotel") || p_alojamiento.equals("hotel")){
            retorno = 1;
        }
        return retorno;
    }
    
    /**
     * Imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     * @Override
     */
    public void liquidar(){
        super.liquidar();
        System.out.println("Habitacion "+this.getTipoHabitacion());
        System.out.println("Total: ------> $"+this.costo());
    }
}
