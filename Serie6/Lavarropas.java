/**
 * Permite crear y manipular un objeto Lavarropas que hereda de ArtefactoHogar.
 * @author Matias Grondona
 * @version 22/10/18
 */
public class Lavarropas extends ArtefactoHogar{
    private int programas;
    private float kilos;
    private boolean automatico;
    
    /**
     * Constructor for objects of class Lavarropas.
     * @param  String p_marca
     * @param  float p_precio
     * @param  int p_stock
     * @param int p_programas
     * @param float p_kilos
     * @param boolean p_automatico
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico){
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
        
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setProgramas(int p_programas){
        this.programas = p_programas;
    }
    
    private void setKilos(float p_kilos){
        this.kilos = p_kilos;
    }
    
    private void setAutomatico(boolean p_automatico){
        this.automatico = p_automatico;
    }
    
    public int getProgramas(){
        return this.programas;
    }
    
    public float getKilos(){
        return this.kilos;
    }
    
    public boolean getAutomatico(){
        return this.automatico;
    }
    //metodo abstracto
    /**
     * redefinicion del metodo creditoConAdicional, retorna el costo total del Artefacto con el interes, teniendo en cuenta, si es automatico o no.
     * return @float retorna el costo total del Artefacto con el interes
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        float total = 0;
        if(this.getAutomatico() != true){
            total = (this.cuotaCredito(p_cuotas, p_interes)-(this.cuotaCredito(p_cuotas, p_interes)/100*2))*p_cuotas;
        }else{
            total = this.cuotaCredito(p_cuotas, p_interes)*p_cuotas;
        }
        
        return total;
    }
    
    /**
     * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void imprimir(){
        super.imprimir();
        System.out.println("Programas: "+this.getProgramas());
        System.out.println("Kilos: "+this.getKilos());
        System.out.println("Automatico: "+this.getAutomatico());
    }
}