
/**
 * Permite crear y manipular un objeto laboratorio.
 * 
 * @author (Matias Grondona) 
 * @version (21/08/18)
 */
public class Laboratorio
{
    // instance variables
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor for objects of class Laboratorio
     * @param p_nompre
     * @param p_domicilio
     * @param p_telefono
     * @param p_compraMinima
     * @param p_diaEntrega
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    
    /**
     * Constructor for objects of class Laboratorio.
     * @param p_nompre
     * @param p_domicilio
     * @param p_telefono
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
    }
    //setters
    /**
     * setters de la clase laboratorio, asigna un estado a los atributos del objeto instanciado.
     */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio)
    {
        this.domicilio = p_domicilio;
    }
    
    private void setTelefono(String p_telefono)
    {
        this.telefono = p_telefono;
    }
    
    private void setCompraMinima(int p_compraMin)
    {
        this.compraMinima = p_compraMin;
    }
    
    private void setDiaEntrega(int p_diaEnt)
    {
        this.diaEntrega = p_diaEnt;
    }
    //getters
    /**
     * getters de la clase Laboratorio, retornan el estado de los atributos del objeto.
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getDomicilio()
    {
        return this.domicilio;
    }
    
    public String getTelefono()
    {
        return this.telefono;
    }
    
    public int getCompraMin()
    {
        return this.compraMinima;
    }
    
    public int getDiaEntrega()
    {
        return this.diaEntrega;
    }
    //metodos extra
    /**
     * cambia el estado del atributo compraMinima.
     * 
     * @param     p_compraMin     
     */
    public void ajusteCompraMinima(int p_compraMin)
    {
        // put your code here
        this.setCompraMinima(p_compraMin);
    }
    
    /**
     * cambia el estado del atributo diaEntrega. 
     * @param     p_diaEnt     
     */
    public void ajusteDiaEntrega(int p_diaEnt)
    {
        // put your code here
        this.setDiaEntrega(p_diaEnt);
    }
    
    /**
     * retorna un String con el estado de los atributos del objeto instanciado.
     * 
     * @return     retorna un String con el estado de los atributos del objeto instanciado
     */
    public String mostrar()
    {
        // put your code here
        return "Laboratorio: "+this.getNombre()+"\n"+"Domicilio: "+this.getDomicilio()+" "+"-"+" "+"Telefono: "+this.getTelefono();
    }
}
