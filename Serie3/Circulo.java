
/**
 * Permite crear y manipular un objeto de tipo Circulo.
 * 
 * @author Matias Grondona
 * @version 27/08/18
 */
public class Circulo
{
    // instance variables
    private double radio;
    private Punto centro;

    /**
     * Constructor for objects of class Circulo.
     * 
     * @param  double p_radio
     * @param  Punto p_centro
     */
    public Circulo(double p_radio, Punto p_centro)
    {
        // initialise instance variables
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    /**
     * Constructor for objects of class Circulo
     */
    public Circulo()
    {
        // initialise instance variables
        this.setRadio(0);
        this.setCentro(new Punto());
    }
    //Setters
    /**
     * Setters de la clase Circulo, cambian es estado de los atributos del objeto instanciado.
     */
    private void setRadio(double p_radio)
    {
        this.radio = p_radio;
    }
    
    private void setCentro(Punto p_centro)
    {
        this.centro = p_centro;
    }
    //Getters
    /**
     * Getters de la clase Circulo, retornan el estado de los atributos del objeto instanciado.
     */
    public Punto getCentro()
    {
        return this.centro;
    }
    
    public double getRadio()
    {
        return this.radio;
    }
    //Metodos especificos
    /**
     * Suma los parametros p_dx y p_dy al estado de los atributos 'x' e 'y' del objeto centro de tipo Punto.
     * 
     * @param     p_dx
     * @param     p_dy
     */
    public void desplazar(double p_dx, double p_dy)
    {
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
    * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
    */
    public void caracteristicas()
    {
        System.out.println("****** Circulo ******");
        System.out.println("Centro: "+ this.getCentro().coordenadas()+"  -Radio: "+this.getRadio());
        System.out.println("Superficie: "+this.superficie()+" -Perimetro:"+this.perimetro());
    }
    
    /**
     * Mediante una formula matematica retorna el perimetro del objeto.
     * 
     * @return el perimetro del objeto de tipo Circulo.
     */
    public double perimetro()
    {
        return 2*Math.PI*this.getRadio();
    }
    
    /**
     * Mediante una formula matematica retorna la superficie del objeto.
     * 
     * @return la superficie del objeto de tipo Circulo.
     */
    public double superficie()
    {
        return Math.PI*Math.pow(this.getRadio(),2);
    }
    
    /**
     * Recibe por parametro un objeto de tipo Circulo y retorna la 
     * distancia entre este objeto y el recibido como parametro.
     * 
     * @param Circulo otroCirculo
     * 
     * @return la distancia entre este objeto y el que recibe por parametro
     */
    public double distanciaA(Circulo otroCirculo)
    {
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    /**
     * Mediante una comparacion de la superficie de dos objetos de tipo Circulo, devuelve el mayor de estos.
     * 
     * @param Circulo otroCirculo
     * 
     * @return retorna el mayor de dos objetos de tipo Circulo
     */
    public Circulo elMayor(Circulo otroCirculo)
    {
        if(this.superficie() > otroCirculo.superficie())
        {
            return this;
        }
        else
        {
            return otroCirculo;
        }
    }
    
}
