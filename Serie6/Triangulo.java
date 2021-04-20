
/**
 * Permite modelar un objeto de tipo Triangulo.
 * 
 * @author Matias Grondona
 * @version 18/10/18
 */
public class Triangulo extends FiguraGeometrica
{
    // instance variables
    private double base;
    private double altura;

    /**
     * Constructor for objects of class Triangulo
     * @param Punto p_origen
     * @param double p_base
     * @param double p_altura
     */
    public Triangulo(Punto p_origen, double p_base, double p_altura)
    {
        // initialise instance variables
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    /**
     * Constructor for objects of class Triangulo
     * @param double p_base
     * @param double p_altura
     */
    public Triangulo(double p_base, double p_altura)
    {
        // initialise instance variables
        super();
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    //accessors
    /**
     * Accessors de la Clase
     */
    private void setBase(double p_base){
        this.base = p_base;
    }
    
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    //metodos Especificos
    /**
     * Retorna el tipo de la figura.
     * @return String con el contenido "****** Triangulo ******".
     */
    public String nombreFigura(){
        return "****** Triangulo ******";
    }
    
    /**
     * Mediante una formula matematica determina la superficie del objeto y la retorna.
     * @return double retorna la superficie de la figura.
     */
    public double superficie(){
       return this.getBase() * this.getAltura() / 2; 
    }
}
