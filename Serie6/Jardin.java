
/**
 * Permite crear y manipular un objeto Administracion.
 * 
 * @author Matias Grondona
 * @version 18/10/18
 */
import java.util.ArrayList;
public class Jardin
{
    // instance variables - replace the example below with your own
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;

    /**
     * Constructor for objects of class Administracion
     * @String p_nombre
     */
    public Jardin(String p_nombre)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
    }
    
    /**
     * Constructor for objects of class Administracion
     * @param String p_nombre
     * @param FiguraGeometrica p_figura
     */
    public Jardin(String p_nombre, FiguraGeometrica p_figura)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
        this.getFiguras().add(p_figura);
    }
    
    /**
     * Constructor for objects of class Administracion
     * @param String p_nombre
     * @param ArrayList<FiguraGeometrica> p_figuras
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    //accessors
    /**
     * Accessors de la clase
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    //agregar y quitar figuras
    /**
     * Agrega un elemento al final de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    
    /**
     * Elimina un elemento de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean quitarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    //metodos especificios
    /**
     * Determina la cantidad de litros de pintura a comprar para cubrir la superficie deseada.
     * @return double retorna la cantidad de litros necesarios.
     */
    public double cuantosLitros(){
        double total = 0;
        total = this.cuantosMetros()/5;
        return total;
    }
    
    /**
     * Calcula la cantidad de latas a comprar para obtener los litros nesesarios.
     * @return int retorna la cantidad de latas a comprar.
     */
    public int cuantasLatas(){
        int total = 0;
        total = (int)Math.ceil(this.cuantosLitros()/4);
        return total;
    }
    
    /**
     * Determina la superficie total a cubrir.
     * @return double retorna la suma de la superficie de todas la figuras geometricas a pintar.
     */
    public double cuantosMetros(){
        double total = 0;
        for(int i = 0; i < this.getFiguras().size(); i++){
            total = total + this.getFiguras().get(i).superficie();
        }
        return total;
    }
    
    /**
     * Imprime en pantalla, con un formato detreminado, el estado de los atributos del objeto.
     */
    public void detalleFiguras(){
        System.out.println("Presupuesto: "+this.getNombre());
        for(int i = 0; i < this.getFiguras().size(); i++){
            this.getFiguras().get(i).mostrarSuperficie();
            System.out.println();
        }
        System.out.println("----------------------------------");
        System.out.println("Total a cubrir: "+this.cuantosMetros());
        System.out.println("Comprar "+this.cuantasLatas()+" latas");
    }
}
