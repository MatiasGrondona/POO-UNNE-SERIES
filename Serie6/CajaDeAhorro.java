
/**
 * Permite crear y manipular un objeto CajaDeAhorro que hereda de Cuenta Bancaria.
 * 
 * @author Matias Grondona
 * @version 08/09/18
 */
public class CajaDeAhorro extends CuentaBancaria
{
    // instance variables                            
    private int extraccionesPosibles;                            

    /**
     * Constructor for objects of class CajaDeAhorro
     * 
     * @param int p_nroCuenta
     * @param Persona p_titular
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular)
    {
        // initialise instance variables
        super(p_nroCuenta, p_titular);
        this.setExtraccionesPosibles(10);
    }
    
    /**
     * Constructor for objects of class CajaDeAhorro
     * 
     * @param int p_nroCuenta
     * @param Persona p_titular
     * @param double p_saldo
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        // initialise instance variables
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);
    }                        
    // Setters
    /**
     * Setters de la clase que cambian el estado de los atributos del objeto
     */
    private void setExtraccionesPosibles (int p_extracciones) 
    {
        this.extraccionesPosibles = p_extracciones;
    }   
    // Getters
    /**
     * Getters de la clase retorna el estado de los atributos del objeto
     */
    public int getExtraccionesPosibles () 
    {
        return this.extraccionesPosibles;
    }      
    //metodos especificos
    /**
     * verifica si el valor del parametro no es mayor que el estado del atributo saldo y si extracciones posibles es mayor a '0',
     * retorna un boolean true si las condiciones se cumplen o false si no.
     * 
     * @param double p_importe
     * @return retorna un boolean con valor 'true' o 'false'
     */
    private boolean puedeExtraer(double p_importe)
    {
        if((this.getSaldo() > p_importe) && (this.getExtraccionesPosibles() > 0)){
            return true;
        }else{
            return false;
        }
    }
     
    /**
     * Verifica si el retorno de puedeExtraer() es 'true', en ese caso manda un mensaje a extraccion() con el parametro recibido,
     * caso contario, imprime en pantalla el motivo por el cual no se puede extraer.
     * 
     * @param double p_importe
     */
    public boolean extraer(double p_importe)
    {
        if(this.puedeExtraer(p_importe) == true){
            super.extraccion(p_importe);
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
            return true;
        }else{
            System.out.println(this.xQNoPuedeExtraer(p_importe));
            return false;
        }
    }
    
    /**
     * Imprime en pantalla el estado de los atributos del objeto siguiendo un formato determinado.
     */
    public void mostrar()
    {
        System.out.println("- Caja de Ahorro -");
        super.mostrar();
        System.out.println("Extracciones Posibles: "+this.getExtraccionesPosibles());
    }
    
    /**
     * Evalua si es posible realizar una extraccion y retorna una leyenda con los resultados.
     * @return String retorna una cadena de caracteres con el motivo por el cual no se pudo realizar la extraccion.
     */
    public String xQNoPuedeExtraer(double p_importe){
        String retorno = "";
        if(this.getSaldo() < p_importe){
                retorno = "NO PUEDE EXTRAER MAS QUE EL SALDO";
        }
            
        if(this.getExtraccionesPosibles() <= 0)
        {
                retorno = retorno + "\nNO TIENE HABILITADAS MAS EXTRACCIONES";
        }
        return retorno;
    }
}
