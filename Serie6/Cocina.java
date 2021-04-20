/**
 * Permite crear y manipular un objeto Cocina que hereda de ArtefactoHogar.
 * @author Matias Grondona
 * @version 22/10/18
 */
public class Cocina extends ArtefactoHogar{
    private int hornallas;
    private int calorias;
    private String dimensiones;
    
    /**
     * Constructor for objects of class Cocina.
     * @param  String p_marca
     * @param  float p_precio
     * @param  int p_stock
     * @param int p_hornallas
     * @param int p_calorias
     * @param String p_dimensiones
     */
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones){
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
        
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setHornallas(int p_hornallas){
        this.hornallas = p_hornallas;
    }
    
    private void setCalorias(int p_calorias){
        this.calorias = p_calorias;
    }
    
    private void setDimensiones(String p_dimensiones){
        this.dimensiones = p_dimensiones;
    }
    
    public int getHornallas(){
        return this.hornallas;
    }
    
    public int getCalorias(){
        return this.calorias;
    }
    
    public String getDimensiones(){
        return this.dimensiones;    
    }
    //metodo abstracto
    /**
     * redefinicion del metodo creditoConAdicional, retorna el costo total del Artefacto con el interes.
     * return @float retorna el costo total del Artefacto con el interes
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        return this.cuotaCredito(p_cuotas, p_interes)*p_cuotas;
    }
    
    /**
     * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void imprimir(){
        super.imprimir();
        System.out.println("Hornallas: "+this.getHornallas());
        System.out.println("Calorias: "+this.getCalorias());
        System.out.println("Dimensiones: "+this.getDimensiones());
    }
}
