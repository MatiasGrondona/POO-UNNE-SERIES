
/**
 * Una Clase abstracta que permite aglomerar el comportamiento comun de varias clases FiguraGeometrica.
 * 
 * @author Matias Grondona 
 * @version 18/10/18
 */
public abstract class FiguraGeometrica 
{
    private Punto origen;
    
    /**
     * Constructor for objects of class FiguraGeometrica 
     */
    public FiguraGeometrica(Punto p_origen){
        this.setOrigen(p_origen);
    }
    
    /**
     * Constructor for objects of class FiguraGeometrica 
     */
    public FiguraGeometrica(){
        this.setOrigen(new Punto());
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    public Punto getOrigen(){
        return this.origen;
    }
    //metodos especificos
    /**
     * Metodo abstracto que debe ser redefinido en las clases hijas.
     */
    public abstract String nombreFigura();
    
    /**
     * Metodo abstracto que debe ser redefinido en las clases hijas.
     */
    public abstract double superficie();
    
    /**
     * Imprime en pantalla con un formato determinado.
     */
    public void mostrarSuperficie(){
        System.out.print(this.nombreFigura());
        System.out.print("Superficie: "+this.superficie());
    }
}
