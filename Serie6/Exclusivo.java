
/**
 * Permite modelar un objeto de tipo Exclusivo que Hereda de Cargo.
 * 
 * @author Matias Grondona
 * @version 09/10/18
 */
public class Exclusivo extends Cargo
{
    // instance variables
    private int horasDeInvestigacion;
    private int horasDeExtension;

    /**
     * Constructor for objects of class Exclusivo
     * @param  String p_nombreCargo
     * @param  double p_sueldoBasico
     * @param  int p_anio
     * @param  int p_horas
     */
    public Exclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anio, int p_horas, int p_investigacion, int p_extension)
    {
        // initialise instance variables
        super(p_nombreCargo, p_sueldoBasico, p_anio, p_horas);
        this.setHorasDeInvestigacion(p_investigacion);
        this.setHorasDeExtension(p_extension);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setHorasDeInvestigacion(int p_horas){
        this.horasDeInvestigacion = p_horas;
    }
    
    private void setHorasDeExtension(int p_horas){
        this.horasDeExtension = p_horas;
    }
    
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public int getHorasDeExtension(){
        return this.horasDeExtension;
    }
    //metodos especificios
    /**
     * Imprime en pantalla con un formato determinado, sobre escribiendo al metodo de la super clase.
     */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----");
        System.out.println("Horas investigación: "+this.getHorasDeInvestigacion());
        System.out.println("Horas extension: "+this.getHorasDeExtension());
    }
}
