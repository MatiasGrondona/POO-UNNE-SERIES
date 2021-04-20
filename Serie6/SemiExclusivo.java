
/**
 *  Permite modelar un objeto de tipo SemiExclusivo que Hereda de Cargo.
 * 
 * @author Matias Grondona
 * @version 09/10/18
 */
public class SemiExclusivo extends Cargo
{
    // instance variables
    private int horasDeInvestigacion;

    /**
     * Constructor for objects of class SemiExclusivo
     * @param  String p_nombreCargo
     * @param  double p_sueldoBasico
     * @param  int p_anio
     * @param  int p_horas
     */
    public SemiExclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anio, int p_horas, int p_investigacion)
    {
        // initialise instance variables
        super(p_nombreCargo, p_sueldoBasico, p_anio, p_horas);
        this.setHorasDeInvestigacion(p_investigacion);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setHorasDeInvestigacion(int p_horas){
        this.horasDeInvestigacion = p_horas;
    }
    
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    //metodos especificios
    /**
     * Imprime en pantalla con un formato determinado, sobre escribiendo al metodo de la super clase.
     */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----"); 
        System.out.println("Horas investigación: "+this.getHorasDeInvestigacion());
    }
}
