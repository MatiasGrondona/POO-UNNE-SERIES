
/**
 * Permite crear y manipular un objeto CuentaBancaria.
 * 
 * @author Matias Grondona 
 * @version 28/08/18
 */
public class CuentaBancaria
{
    // instance variables
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Constructor for objects of class CuentaBancaria
     * 
     * @param int p_nroCuentaBancaria
     * @param Persona p_titular
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular)
    {
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
    }
    
    /**
     * Constructor for objects of class CuentaBancaria
     * 
     * @param int p_nroCuentaBancaria
     * @param Persona p_titular
     * @param double p_saldo
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    //setters
    /**
     * Setters de la clase que cambian el estado de los atributos del objeto
     */
    private void setNroCuenta(int p_nroCuenta)
    {
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setTitular(Persona p_titular)
    {
        this.titular = p_titular;
    }
    
    private void setSaldo(double p_saldo)
    {
        this.saldo = p_saldo;
    }
    //getters
    /**
     * Getters de la clase retorna el estado de los atributos del objeto
     */
    public int getNroCuenta()
    {
        return this.nroCuenta;
    }
    
    public Persona getTitular()
    {
        return this.titular;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    //metodos especificos
    /**
     * Suma el parametro recibito al atributo saldo.
     * 
     * @param double p_importe
     * @return retorna el nuevo saldo
     */
    public double depositar(double p_importe)
    {
        this.setSaldo(this.getSaldo()+p_importe);
        return this.getSaldo();
    }
    
    /**
     * Resta el parametro recibito al atributo saldo.
     * 
     * @param double p_importe
     */
    protected double extraccion(double p_importe)
    {
        return this.getSaldo() - p_importe;
    }
    
    /**
     * Imprime en pantalla el estado de los atributos del objeto siguiendo un formato determinado.
     */
    public void mostrar()
    {
        System.out.println("Titular: "+this.getTitular().nomYApe()+"    ("+this.getTitular().edad()+" años)" );
        System.out.println("Saldo: "+this.getSaldo());
    }
    
    /**
     * Retorna un String con el estado de los atributos del objeto instanciado.
     * 
     * @return     retorna un String con el estado de los atributos del objeto instanciado
     */
    public String toString()
    {
        return this.getNroCuenta()+"\t"+this.getTitular().nomYApe()+"\t"+this.getSaldo();
    }
}
