
/**
 * Permite crear y manipular un objeto de tipo Circulo.
 * 
 * @author Matias Grondona
 * @version 08/10/18
 */
public class Circulo extends Elipse
{

    /**
     * Constructor for objects of class Circulo.
     * @param  Punto p_centro
     * @param  double p_radio
     */
    public Circulo(double p_radio, Punto p_centro)
    {
        // initialise instance variables
        super(p_radio, p_radio, p_centro);
    }
    
    /**
     * Constructor for objects of class Circulo
     */
    public Circulo()
    {
        // initialise instance variables
        super(0,0,new Punto());
    }
    
    /**
     * Compara el semi eje menor y el semi eje mayor para saber si es un Circulo o una Elipse.
     * @return retorna el tipo de figura dependiendo de si su semi eje menor y semi eje mayor son iguales
     */
    public String nombreFigura(){
        if(this.getSEjeMenor() == this.getSEjeMayor()){
            return "****** Circulo ******";
        }else{
            return super.nombreFigura();
        }
    }
}
