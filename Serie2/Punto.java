
/**
 * Permite crear y manipular un objeto punto.
 * 
 * @author Matias Grondona
 * @version 26/08/18
 */
public class Punto
{
    // instance variables
    private double x;
    private double y;
     
    /**
     * Constructor for objects of class Punto.    
     */
    public Punto()
    {
        // initialise instance variables
        this.setX(0);
        this.setY(0);
    }
    
    /**
     * Constructor for objects of class Punto.
     * 
     * @param     p_x
     * @param     p_y
     */
    public Punto(double p_x, double p_y)
    {
        this.setX(p_x);
        this.setY(p_y);
    }
    //setters
    /**
     * Setters de la clase Punto, cambian es estado de los atributos del objeto instanciado.
     */
    private void setX(double p_x)
    {
        this.x = p_x;
    }
    
    private void setY(double p_y)
    {
        this.y = p_y;
    }
    //getters
    /**
     * Getters de la clase Punto, retornan el estado de los atributos del objeto instanciado.
     */
    public double getX()
    {
        return this.x;
    }
    
    public double getY()
    {
        return this.y;
    }
    
    /**
     * Suma los parametros p_dx y p_dy al estado los atributos x e y del objeto.
     * 
     * @param     p_dx
     * @param     p_dy
     */
    public void desplazar(double p_dx, double p_dy)
    {
        this.setX(this.getX()+p_dx);
        this.setY(this.getY()+p_dy);
    }
    
    /**
     * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void mostrar()
    {
        System.out.println("Punto. X: "+this.getX()+" Y: "+this.getY());
    }
    
    /**
     * Retorna un String con el estado de los atributos x e y.
     * @return  retorna un String con un formato determinado
     */
    public String coordenadas()
    {
        return "("+this.getX()+", "+this.getY()+")";
    }
}
