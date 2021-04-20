
/**
 * Permite crear y manipular un objeto de tipo Rectangulo.
 * 
 * @author Matias Grondona 
 * @version 27/08/18
 */
public class Rectangulo extends FiguraGeometrica
{
    // instance variables
    private double ancho;
    private double alto;
    
    /**
     * Constructor for objects of class Rectangulo.
     * 
     * @param  double p_ancho
     * @param  double p_alto
     * @param  Punto p_origen
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto)
    {
        // initialise instance variables
        super(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    /**
     * Constructor for objects of class Rectangulo.
     * 
     * @param  double p_ancho
     * @param  double p_alto
     */
    public Rectangulo(double p_ancho, double p_alto)
    {
        // initialise instance variables
        super();
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    //Setters
    /**
     * Accessors de la Clase.
     */
    private void setAncho(double p_ancho)
    {
        this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto)
    {
        this.alto = p_alto;
    }
    //Getters    
    public double getAncho()
    {
        return this.ancho;
    }
    
    public double getAlto()
    {
        return this.alto;
    }
    
    /**
     * Suma los parametros p_dx y p_dy al estado de los atributos 'x' e 'y' del objeto origen de tipo Punto.
     * 
     * @param     p_dx
     * @param     p_dy
     */
    public void desplazar(double p_dx, double p_dy)
    {
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    
    /**
    * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
    */
    public void caracteristicas()
    {
        System.out.println("****** Rectangulo ******");
        System.out.println("Origen: "+ this.getOrigen().coordenadas()+"  -Alto: "+this.getAlto()+" -Ancho: "+this.getAncho());
        System.out.println("Superficie: "+this.superficie()+" -Perimetro:"+this.perimetro());
    }
    
    /**
     * Mediante una formula matematica retorna el perimetro del objeto.
     * 
     * @return el perimetro del objeto de tipo Rectangulo.
     */
    public double perimetro()
    {
        return 2*this.getAncho()+2*this.getAlto();
    }
    
    /**
     * Mediante una formula matematica retorna la superficie del objeto.
     * 
     * @return la superficie del objeto de tipo Rectangulo.
     */
    public double superficie()
    { 
        return this.getAncho()*this.getAlto();
    }
    
    /**
     * Recibe por parametro un objeto de tipo Rectangulo y retorna la 
     * distancia entre este objeto y el recibido como parametro.
     * 
     * @param Rectangulo otroRectangulo
     * 
     * @return la distancia entre este objeto y el que recibe por parametro
     */
    public double distanciaA(Rectangulo otroRectangulo)
    {
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    
    /**
     * Mediante una comparacion de la superficie de dos objetos de tipo Rectangulo, devuelve el mayor de estos.
     * 
     * @param Rectangulo otroRectangulo
     * 
     * @return retorna el mayor de dos objetos de tipo Rectangulo
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo)
    {
        if(this.superficie() > otroRectangulo.superficie())
        {
            return this;
        }
        else
        {
            return otroRectangulo;
        }
    }
    /**
     * Retorna un String con el contenido "****** Rectangulo ******".
     * 
     * @return retorna un String con el contenido "****** Rectangulo ******".
     */
    public String nombreFigura(){
        return "****** Rectangulo ******";
    }
}
