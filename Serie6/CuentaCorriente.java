
/**
 * Permite crear y manipular un objeto CuentaCorriente que hereda de CuentaBancaria.
 * 
 * @author Matias Grondona 
 * @version 08/09/18
 */
public class CuentaCorriente extends CuentaBancaria
{
    // instance variables                           
    private double limiteDescubierto;                            

    /**
     * Constructor for objects of class CuentaCorriente.
     * 
     * @param int p_nroCuenta
     * @param Persona p_titular
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
        // initialise instance variables
        super(p_nroCuenta, p_titular);
        this.setLimiteDescubierto(500.0);
    }
    
    /**
     * Constructor for objects of class CuentaCorriente.
     * 
     * @param int p_nroCuenta
     * @param Persona p_titular
     * @param double p_saldo
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        // initialise instance variables
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500.0);
    }                        
    // Setters
    /**
     * Setters de la clase que cambian el estado de los atributos del objeto
     */

    private void setLimiteDescubierto (double p_limite) 
    {
        this.limiteDescubierto = p_limite;
    }  
    // Getters
    /**
     * Getters de la clase retorna el estado de los atributos del objeto
     */
    public double getLimiteDescubierto () 
    {
        return this.limiteDescubierto;
    }      
    //metodos especificos
    
    /**
     * verifica si el valor del parametro no es mayor que el estado del atributo saldo y mayor al atributo limiteDescubierto,
     * retorna un boolean true si las condiciones se cumplen o false si no.
     * 
     * @param double p_importe
     * @return retorna un boolean con valor 'true' o 'false'
     */
    private boolean puedeExtraer(double p_importe)
    {
        if((this.getSaldo() > p_importe) && (this.getLimiteDescubierto() > p_importe)){
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
     * @return boolean retorna true o false en caso de que se realizara o no la extraccion.
     */
    public boolean extraer(double p_importe)
    {
        if(this.puedeExtraer(p_importe) == true){
            super.extraccion(p_importe);
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
        System.out.println("- Cuenta Corriente -");
        super.mostrar();
        System.out.println("Descubierto: "+this.getLimiteDescubierto());
    }
    
    /**
     * Retorna una leyenda con el motivo por el cual no se puede extraer.
     * @return String retorna una cadena de caracteres con el motivo por el cual no se pudo realizar la extraccion.
     */
    public String xQNoPuedeExtraer(double p_importe){
        return "El importe de extraccion sobrepasa el límite de descubierto!";
    }
}
