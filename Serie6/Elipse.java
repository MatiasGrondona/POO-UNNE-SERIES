
/**
 * Permite crear y manipular un objeto de tipo Elipse.
 * 
 * @author Matias Grondona
 * @version 08/10/18
 */
public class Elipse extends FiguraGeometrica
{
    // instance variables
    private double sEjeMenor;
    private double sEjeMayor;
    /**
     * Constructor for objects of class Elipse
     * @param     double p_ejeMayor
     * @param     double p_ejeMenor
     * @param     Punto p_centro
     */
    public Elipse(double p_ejeMenor, double p_ejeMayor, Punto p_centro)
    {
        // initialise instance variables
        super(p_centro);
        this.setSEjeMenor(p_ejeMenor);
        this.setSEjeMayor(p_ejeMayor);
    }
    //Setters
    /**
     * Setters de la clase Elipse, cambian es estado de los atributos del objeto instanciado.
     */
    private void setSEjeMenor(double p_ejeMenor)
    {
        this.sEjeMenor = p_ejeMenor;
    }
    
    private void setSEjeMayor(double p_ejeMayor)
    {
        this.sEjeMenor = p_ejeMayor;
    }
    
    //Getters
    /**
     * Getters de la clase Elipse, retornan el estado de los atributos del objeto instanciado.
     */
    public double getSEjeMenor()
    {
        return this.sEjeMenor;
    }
    
    public double getSEjeMayor()
    {
        return this.sEjeMenor;
    }
    
    public String nombreFigura(){
        return "****** Elipse ******";
    }
    
    /**
    * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
    */
    public void caracteristicas()
    {
        System.out.println(this.nombreFigura());
        System.out.println("Centro: "+ this.getOrigen().coordenadas()+"  -Semieje Mayor: "+this.getSEjeMayor()
                            +" - Semieje Menor: "+this.getSEjeMenor());
        System.out.println("Superficie: "+this.superficie());
    }
    
    /**
     * Mediante una formula matematica retorna la superficie del objeto.
     * 
     * @return la superficie del objeto de tipo Elipse.
     */
    public double superficie()
    {
        return Math.PI*this.getSEjeMayor()*this.getSEjeMenor();
    }
    
    /**
     * Suma los parametros p_dx y p_dy al estado de los atributos 'x' e 'y' del objeto centro de tipo Punto.
     * 
     * @param     p_dx
     * @param     p_dy
     */
    public void desplazar(double p_dx, double p_dy)
    {
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    
    /**
     * Recibe por parametro un objeto de tipo Elipse y retorna la 
     * distancia entre este objeto y el recibido como parametro.
     * 
     * @param Elipse otraElipse
     * 
     * @return la distancia entre este objeto y el que recibe por parametro
     */
    public double distanciaA(Elipse otraElipse)
    {
        return this.getOrigen().distanciaA(otraElipse.getOrigen());
    }
    
    /**
     * Mediante una comparacion de la superficie de dos objetos de tipo Elipse, devuelve el mayor de estos.
     * 
     * @param Elipse otraElipse
     * 
     * @return retorna el mayor de dos objetos de tipo Elipse
     */
    public Elipse elMayor(Elipse otraElipse)
    {
        if(this.superficie() > otraElipse.superficie())
        {
            return this;
        }
        else
        {
            return otraElipse;
        }
    }
}
