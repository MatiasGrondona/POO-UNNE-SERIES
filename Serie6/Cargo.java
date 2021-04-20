
/**
 * Permite modelar un objeto de tipo Cargo.
 * 
 * @author Matias Grondona
 * @version 09/10/18
 */
import java.util.*;
public class Cargo
{
    // instance variables
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;

    /**
     * Constructor for objects of class Cargo
     * @param  String p_nombreCargo
     * @param  double p_sueldoBasico
     * @param  int p_anio
     * @param  int p_horas
     */
    public Cargo(String p_nombreCargo, double p_sueldoBasico, int p_anio, int p_horas)
    {
        // initialise instance variables
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anio);
        this.setHorasDeDocencia(p_horas);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }
    
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    private void setHorasDeDocencia(int p_horas){
        this.horasDeDocencia = p_horas;
    }
    
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int getAnioIngreso(){
       return this.anioIngreso;
    }
    
    public  int getHorasDeDocencia(){
       return this.horasDeDocencia;
    }
    //metodos especificos
    /**
     * Realiza una resta del año actual y de ingreso, para obtener la antiguedad del Cargo.
     * @return retorna la antiguedad del objeto Cargo
     */
    public int antiguedad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        int antiguedad = anioHoy - this.getAnioIngreso();
        
        return antiguedad;
    }
    
    /**
     * En base a la antiguedad del empleado establece el porcentaje corespondiente al adicional.
     * 
     * @return     retorna el valor a sumar a sueldoBasico
     */
    private double adicionalXAntiguedad()
    {
        double adicional;
        adicional = this.antiguedad()*this.getSueldoBasico()/100;
        return adicional;
    }
    
    /**
     * Suma el adicional y resta el descuento a sueldoBasico.
     * 
     * @return    retorna el resultado de aplicar el descuento y el adicional a sueldoBasico
     */
    public double sueldoDelCargo()
    {
       return this.getSueldoBasico() + this.adicionalXAntiguedad();    
    }
    
    /**
     * Imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void mostrarCargo()
    {
        System.out.print(this.getNombreCargo()+" - Sueldo Basico: "+this.getSueldoBasico());
        System.out.println(" - Sueldo Cargo: "+this.sueldoDelCargo()+" – Antiguedad: "+this.antiguedad()+" años");
        System.out.println("Horas Docencia: "+this.getHorasDeDocencia());
    }
}
