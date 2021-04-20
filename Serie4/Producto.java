
/**
 * Permite crear y manipular un objeto producto.
 * 
 * @author (Matias Grondona) 
 * @version (23/08/18)
 */
public class Producto
{
    // instance variables
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    /**
     * Constructor for objects of class Producto.
     * 
     * @param int p_codigo;
     * @param String p_rubro;
     * @param String p_desc;
     * @param double p_costo;
     * @param double p_porcPtoRepo;
     * @param int p_existMinima;
     * @param Laboratorio p_lab;
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, 
                    int p_existMinima, Laboratorio p_lab)
    {
        // initialise instance variables
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }
    
    /**
     * Constructor for objects of class Producto.
     * 
     * @param int p_codigo;
     * @param String p_rubro;
     * @param String p_desc;
     * @param double p_costo;
     * @param Laboratorio p_lab;
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab)
    {
        // initialise instance variables
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(0);
        this.setExistMinima(0);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }
    //Setters
    /**
     * setters de la clase Producto, asigna un estado a los atributos del objeto instanciado.
     */
    private void setCodigo(int p_codigo)
    {
        this.codigo = p_codigo;
    }
    
    private void setRubro(String p_rubro)
    {
        this.rubro = p_rubro;
    }
    
    private void setDescripcion(String p_desc)
    {
        this.descripcion = p_desc;
    }
    
    private void setCosto(double p_costo)
    {
        this.costo = p_costo;
    }
    
    private void setStock(int p_stock)
    {
        this.stock = p_stock;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo)
    {
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    private void setExistMinima(int p_existMinima)
    {
        this.existMinima = p_existMinima;
    }
    
    private void setLaboratorio(Laboratorio p_lab)
    {
        this.laboratorio = p_lab;
    } 
    //Getters
    /**
     * getters de la clase Producto, retornan el estado de los atributos del objeto.
     */
    public int getCodigo() 
    {
        return this.codigo;
    }
      
    public String getRubro() 
    {
        return this.rubro;
    }
    
    public String getDescripcion() 
    {
        return this.descripcion;
    }
    
    public double getCosto() 
    {
        return this.costo;
    }
      
    public int getStock() 
    {
        return this.stock;
    }
      
    public double getPorcPtoRepo() 
    {
        return this.porcPtoRepo;
    }
    
    public int getExistMinima() 
    {
        return this.existMinima;
    }
      
    public Laboratorio getLaboratorio() 
    {
        return this.laboratorio;
    }
    
    //Metodos Especificos
    /**
     * Imprime en pantalla el estado de los atributos del objeto siguiendo un formato determinado.
     */
    public void mostrar()
    {
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println("Rubro: "+this.getRubro());
        System.out.println("Descripcion: "+this.getDescripcion());
        System.out.println("Precio Costo: "+this.getCosto());
        System.out.println("Stock: "+this.getStock()+" - Stock Valorizado: "+this.stockValorizado());
    }
    
    /**
     * Cambia el estado del atributo Stock.
     * @param  int p_cantidad
     */
    public void ajuste(int p_cantidad)
    {
        //agregar o quitar a Stock
        int aux = p_cantidad;  
        /*System.out.print("Ingrese el ajuste de stock, positivos para suma -/- negativos para restar: ");*/
        this.setStock(this.getStock()+aux);
    }
    
    /**
     * Retorna el valor del stock del producto mas la suma del 12%
     * 
     * @return retorna el valor total del Stock de producto
     */
    public double stockValorizado()
    {
        //stock * (costo + 12%)(utilizando el metodo precioLista que retorna el valor del producto con el 12% ya aplicado)
        double aux = this.getStock()*this.precioLista();
        return aux;
    }
    
    /**
     * Añade un 12% de costo al precio del producto.
     * 
     * @return retorna el valor del producto mas un 12%
     */
    public double precioLista()
    {
        //retorna el valor del producto mas 12%
        double aux = 12*this.getCosto()/100;
        return this.getCosto()+aux;
    }
    
    /**
     * Resta un 5% al precio de lista del producto.
     * 
     * @return retorna el precio contado del producto
     */
    public double precioContado()
    {
        //retorna la resta del 5% del precio lista
        double aux = 5*this.precioLista()/100;
        return this.precioLista()-aux;
    }
    
    /**
     * Retorna un String con el estado de los atributos del objeto instanciado.
     * 
     * @return     retorna un String con el estado de los atributos del objeto instanciado
     */
    public String mostrarLinea()
    {
        return this.getDescripcion()+"\t"+this.precioLista()+" "+this.precioContado();
    }
    
    /**
     * Permite cambiar el estado del atributo porcePtoRepo.
     * 
     * @param double p_porc
     */
    public void ajustarPtoRepo(double p_porc)
    {
        this.setPorcPtoRepo(p_porc);
    }
    
    /**
     * Permite cambiar el estado del atributo existMinima.
     * 
     * @param int p_cantidad
     */
    public void ajustarExistMinima(int p_cantidad)
    {
        this.setExistMinima(p_cantidad);
    }
    
    /**
     * Retorna la razon de la compra, sugun la politica de reposicion correspondiente.
     * @return char retorna la razon de la compra.
     */
    public char solicitar()
    {
        double ptoReposicion = this.getExistMinima() * (1 + this.getPorcPtoRepo() / 100);
        
        if(this.getStock() <= this.getLaboratorio().getCompraMin()){
            return 'F';
        }else if(this.getStock() <= ptoReposicion){
            return 'P';
        }else{
            return 'N';
        }
    }
}
