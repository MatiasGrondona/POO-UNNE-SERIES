
/**
 * Permite crear y manipular un objeto CajaDeAhorro.
 * 
 * @author Matias Grondona
 * @version 08/09/18
 */
public class CajaDeAhorro
{
    // instance variables
    private int nroCuenta;                            
    private double saldo;                            
    private int extraccionesPosibles;                            
    private Persona titular;

    /**
     * Constructor for objects of class CajaDeAhorro
     * 
     * @param int p_nroCuenta
     * @param Persona p_titular
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular)
    {
        // initialise instance variables
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
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
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
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
    private void setExtraccionesPosibles (int p_extracciones) 
    {
        this.extraccionesPosibles = p_extracciones;
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
    public int getExtraccionesPosibles () 
    {
        return this.extraccionesPosibles;
    }      
    public Persona getTitular () 
    {
        return this.titular;
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
     * Resta el parametro recibito al atributo saldo y descuenta una unidad a extraccionesPosibles.
     * 
     * @param double p_importe
     */
    private void extraccion(double p_importe)
    {
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
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
            if(this.getSaldo() < p_importe){
                System.out.println("NO PUEDE EXTRAER MAS QUE EL SALDO");
            }
            
            if(this.getExtraccionesPosibles() <= 0)
            {
                System.out.println("NO TIENE HABILITADAS MAS EXTRACCIONES");
            }
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
        System.out.println("- Caja de Ahorro -");
        System.out.println("Nro. Cuenta: "+this.getNroCuenta()+"  -  Saldo: "+this.getSaldo());
        System.out.println("Titular: "+this.getTitular().nomYApe());
        System.out.println("Extracciones Posibles: "+this.getExtraccionesPosibles());
    }
}
