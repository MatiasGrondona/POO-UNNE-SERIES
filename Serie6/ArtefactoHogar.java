/**
 * Una Clase abstracta que permite aglomerar el comportamiento comun de varias clases.
 * @author Matias Grondona
 * @version 22/10/18
 */
public abstract class ArtefactoHogar {
    private String marca;
    private float precio;
    private int stock;
    
    /**
     * Constructor for objects of class ArtefactoHogar.
     * @param  String p_marca
     * @param  float p_precio
     * @param  int p_stock
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setMarca(String p_marca){
        this.marca = p_marca;
    }
    
    private void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    
    private void setStock (int p_stock){
        this.stock = p_stock;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public int getStock(){
        return this.stock;
    }
    //metodos especificos
    /**
     * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void imprimir(){
        System.out.println("Marca: "+this.getMarca()+" - Precio: "+this.getPrecio()+" - Stock: "+this.getStock());
    }
    
    /**
     * Al precio del artefacto le añade el interes y lo divide por la cantidad de cuotas.
     * @return float retorna el costo de cada cuota.
     */
    public float cuotaCredito(int p_cuotas, float p_interes){
        return (this.getPrecio()+(this.getPrecio()/100*p_interes))/p_cuotas;
    }
    
    /**
     * Metodo abstracto que debe ser redefinido en las clases hijas.
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}
