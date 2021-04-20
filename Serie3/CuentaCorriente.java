
/**
 * Permite crear y manipular un objeto CuentaCorriente.
 * 
 * @author Matias Grondona 
 * @version 08/09/18
 */
public class CuentaCorriente
{
    // instance variables
    private int nroCuenta;                            
    private double saldo;                            
    private double limiteDescubierto;                            
    private Persona titular;

    /**
     * Constructor for objects of class CuentaCorriente.
     * 
     * @param int p_nroCuenta
     * @param Persona p_titular
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
        this.setLimiteDescubierto(500.0);
        this.setTitular(p_titular);
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
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500.0);
        this.setTitular(p_titular);
    }                        
    // Setters
    /**
     * Setters de la clase que cambian el estado de los atributos del objeto
     */
    private void setNroCuenta (int p_nroCuenta) 
    {
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo (double p_saldo) 
    {
        this.saldo = p_saldo;
    }
    private void setLimiteDescubierto (double p_limite) 
    {
        this.limiteDescubierto = p_limite;
    }
    private void setTitular (Persona p_titular) 
    {
        this.titular = p_titular;
    }    
    // Getters
    /**
     * Getters de la clase retorna el estado de los atributos del objeto
     */
    public int getNroCuenta ()
    {
        return this.nroCuenta;
    }
    public double getSaldo () 
    {
        return this.saldo;
    }
    public double getLimiteDescubierto () 
    {
        return this.limiteDescubierto;
    }      
    public Persona getTitular () 
    {
        return this.titular;
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
     * Resta el parametro recibito al atributo saldo.
     * 
     * @param double p_importe
     */
    private void extraccion(double p_importe)
    {
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    /**
     * Verifica si el retorno de puedeExtraer() es 'true', en ese caso manda un mensaje a extraccion() con el parametro recibido,
     * caso contario, imprime en pantalla el motivo por el cual no se puede extraer.
     * 
     * @param double p_importe
     */
    public void extraer(double p_importe)
    {
        if(this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        }else{
            System.out.println("EL IMPORTE DE EXTRACCION SOBREPASA EL LIMITE DESCUBIERTO");
        }
    }
    
    /**
     * Suma el parametro recibito al atributo saldo.
     * 
     * @param double p_importe
     */
    public void depositar(double p_importe)
    {
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Imprime en pantalla el estado de los atributos del objeto siguiendo un formato determinado.
     */
    public void mostrar()
    {
        System.out.println("- Cuenta Corriente -");
        System.out.println("Nro. Cuenta: "+this.getNroCuenta()+"  -  Saldo: "+this.getSaldo());
        System.out.println("Titular: "+this.getTitular().nomYApe());
        System.out.println("Descubierto: "+this.getLimiteDescubierto());
    }
}
