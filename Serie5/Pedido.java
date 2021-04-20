
/**
 * Write a description of class Pedido here.
 * 
 * @author Matias Grondona 
 * @version 27/09/18
 */
import java.util.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.ArrayList;
public class Pedido
{
    // instance variables
    private Calendar fecha;
    private ArrayList<Producto> productos;
    private Cliente cliente;

    /**
     * Constructor for objects of class Pedido
     * @param  Calendar p_fecha
     * @param  Cliente p_cliente
     * @param  ArrayList<Producto> p_productos
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos)
    {
        // initialise instance variables
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }

    /**
     * Constructor for objects of class Pedido
     * @param  Calendar p_fecha
     * @param  Cliente p_cliente
     * @param  Producto p_producto
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto)
    {
        // initialise instance variables
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<Producto>());
        this.agregarProducto(p_producto);
    }
    //accesors
    /**
     * Accessors de la clase
     */
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    
    private void setProductos(ArrayList<Producto> p_productos){
        this.productos = p_productos;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    //agregar y quitar elementos a la coleccion
    /**
     * Agrega un elemento al final de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    /**
     * Elimina un elemento de la coleccion.
     * @return boolean retorna resultado de la operacion
     */
    public boolean quitarProducto(Producto p_producto){
        return this.getProductos().remove(p_producto);
    }
    //metodos especificos
    /**
     * Recorre la coleccion productos y suma el precio al contado para retornarlo.
     * @return double retorna la suma del precio al contado de todos los objetos en la coleccion.
     */
    public double totalAlContado(){
        double totalContado = 0;
        for(int i = 0; i < this.getProductos().size(); i++){
            totalContado = totalContado + this.getProductos().get(i).precioContado();
        }
        return totalContado;
    }
    
    /**
     * Recorre la coleccion productos y suma el precio de lista para retornarlo.
     * @return double retorna la suma del precio de lista de todos los objetos en la coleccion.
     */
    public double totalFinanciado(){
        double totalLista = 0;
        for(int i = 0; i < this.getProductos().size(); i++){
            totalLista = totalLista + this.getProductos().get(i).precioContado();
        }
        return totalLista;
    }
    
    /**
     * Imprime en pantalla con un formato determinado el estado de los atributos del objeto.
     */
    public void mostrarPedido(){
        Date f_date = this.getFecha().getTime();
        DateFormat formato1 = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("****** Detalle del Pedido ****** Fecha: "+formato1.format(f_date));
        System.out.println("Producto\t\t\tPrecio Lista\t\t\tPrecio Contado");
        System.out.println("-----------------------------------------------------------------");
        for(int i = 0; i < this.getProductos().size(); i++){
            System.out.println(this.getProductos().get(i).mostrarLinea());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("**** Total ---------"+this.totalFinanciado()+"\t"+this.totalAlContado());
    }
}
