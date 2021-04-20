
/**
 * Permite crear y manipular un objeto cliente.
 * 
 * @author Matias Grondona
 * @version 21/08/18
 */
public class Cliente
{
    // instance variables
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * Constructor for objects of class Cliente
     * 
     * @param p_nroDni
     * @param p_apellido
     * @param p_nombre
     * @param p_saldo
     */
    public Cliente(int p_nroDni, String p_apellido, String p_nombre, double p_saldo)
    {
        // initialise instance variables
        this.setNroDni(p_nroDni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_saldo);
    }
    //setters
    /**
     * Conjunto de setters de la clase, cambian el estado de los atributos del objeto
     */
    private void setNroDni(int p_nroDni)
    {
        this.nroDni = p_nroDni;
    }
    
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    private void setSaldo(double p_saldo)
    {
        this.saldo = p_saldo;
    }
    //getters
    /**
     * Conjunto de getters de la clase, retornan el estado de los atributos del objeto
     */
    public int getNroDni()
    {
        return this.nroDni;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    //metodos extra
    /**
     * Imprime en pantalla, con un formato determinado, el estado de los atributos del objeto 
     */
    public void mostrar()
    {
        System.out.println("-Cliente-");
        System.out.println("Nombre y Apellido: "+this.nomYApe());
        System.out.println("Saldo: Ars$"+this.getSaldo());
    }
    
    /**
     * Cambia el estado del atributo saldo del objeto por el nuevo, recibido como parametro.
     * @param     p_importe
     * @return    retorna el nuevo saldo del cliente
     */
    public double nuevoSaldo(double p_importe)
    {
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    
    /**
     * Suma el parametro recibido con el atributo saldo del objeto.
     * @param     p_importe
     * @return    retorna el nuevo saldo del cliente
     * */
    public double agregarSaldo(double p_importe)
    {
        double auxSaldo = p_importe + this.getSaldo();
        this.setSaldo(auxSaldo);
        return this.getSaldo();
    }
    /**
     * Retorna un String con el estado de los atributos nombre y apellido.
     * @return    retorna un String con el estado de los atributos nombre y apellido
     */
    public String nomYApe()
    {
        return this.getNombre()+" "+this.getApellido();
    }
    
    /**
     * Retorna un String con el estado de los atributos apellido y nombre
     * @return    retorna un String con el estado de los atributos apellido y nombre
     */
    public String apeYNom()
    {
        return this.getApellido()+" "+this.getNombre();
    }
}
