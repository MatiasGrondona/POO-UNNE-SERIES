
/**
 * Permite modelar un objeto de tipo Cuadrado que Hereda de Rectangulo.
 * 
 * @author Matias Grondona
 * @version 08/10/18
 */
public class Cuadrado extends Rectangulo
{
    /**
     * Constructor for objects of class Cuadrado
     * @param     Punto p_punto
     * @param     double p_lado
     */
    public Cuadrado(Punto p_punto, double p_lado)
    {
        // initialise instance variables
        super(p_punto, p_lado, p_lado);
    }
    //metodos especificos
    /**
     * Compara la altura y ancho para saber si es un Cuadrado o un rectangulo.
     * @return retorna el tipo de figura dependiendo de si su ancho y alto son iguales
     */
    public String nombreFigura(){
        if(this.getAlto() == this.getAncho()){
            return "****** Cuadrado ******";
        }else{
            return super.nombreFigura();
        }
    }
    
    /**
     * Compara la altura y ancho para saber si es un Cuadrado o un rectangulo, en base a ello imprime en pantalla en un formato especifico.
     */
    public void caracteristicas(){
        if(this.getAlto() == this.getAncho()){
            System.out.println(this.nombreFigura());
            System.out.println("Origen: "+ this.getOrigen().coordenadas()+"  -Lado: "+this.getAlto());
            System.out.println("Superficie: "+this.superficie()+" -Perimetro:"+this.perimetro());
        }else{
            super.caracteristicas();
        }
    }
}
