import java.util.ArrayList;

/**
 * Permite crear y manipular un objeto Cabaña que hereda de Alojamiento.
 * @author Grondona Matias
 * @version 01/11/18
 */
public class Cabaña extends Alojamiento{
    private int nroHabitaciones;
    
    /**
     * Constructor for objects of class Cabaña.
     * @param  String p_nombre
     * @param  double p_precio
     * @param  int p_dias
     * @param  ArrayList<Servicio> p_servicios
     * @param  int p_nroHabitaciones
     */
    public Cabaña(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios, int p_nroHabitaciones){
        super(p_nombre, p_precio, p_dias, p_servicios);
        this.setNroHabitaciones(p_nroHabitaciones);
    }
    
    /**
     * Constructor for objects of class Cabaña.
     * @param  String p_nombre
     * @param  double p_precio
     * @param  int p_dias
     * @param  Servicio p_servicio
     * @param  int p_nroHabitaciones
     */
    public Cabaña(String p_nombre, double p_precio, int p_dias,Servicio p_servicio, int p_nroHabitaciones){
        super(p_nombre, p_precio, p_dias, p_servicio);
        this.setNroHabitaciones(p_nroHabitaciones);
    }
    
    /**
     * Constructor for objects of class Cabaña.
     * @param  String p_nombre
     * @param  double p_precio
     * @param  int p_dias
     * @param  int p_nroHabitaciones
     */
    public Cabaña(String p_nombre, double p_precio, int p_dias, int p_nroHabitaciones){
        super(p_nombre, p_precio, p_dias);
        this.setNroHabitaciones(p_nroHabitaciones);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNroHabitaciones(int p_nro){
        this.nroHabitaciones = p_nro;
    }
    
    public int getNroHabitaciones(){
        return this.nroHabitaciones;
    }
    //metodos especificos
    /**
     * Re escribe el metodo costo de la super clase y añade el extra por los dias de alquiler.
     * @Override
     * @return double retorna el costo total de alojamiento.
     */
    public double costo(){
        double total;
            total = super.costo() + (30*this.getDiasAlquiler());
        return total;
    }
    
    /**
     * evalua si el alojamineto es de tipo Cabaña y restorna 1 de ser asi.
     * @Override
     * @return retorna 1 si el alojamiento es de tipo cabaña.
     */
    public int contar(String p_alojamiento){
        int retorno = 0;
        if(p_alojamiento.equals("Cabaña") || p_alojamiento.equals("cabaña")){
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
        System.out.println("Cabaña con "+this.getNroHabitaciones()+" Habitaciones.");
        System.out.println("Total: ------> $"+this.costo());
    }
}
