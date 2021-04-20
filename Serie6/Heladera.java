/**
 * Permite crear y manipular un objeto Heladera que hereda de ArtefactoHogar.
 * @author Matias Grondona
 * @version 22/10/18
 */
public class Heladera extends ArtefactoHogar {
    private int pies;
    private int puertas;
    private boolean compresor;
    
    /**
     * Constructor for objects of class Heladera.
     * @param  String p_marca
     * @param  float p_precio
     * @param  int p_stock
     * @param int p_pies
     * @param int p_puertas
     * @param boolean p_compresor
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor){
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
        
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    
    private void setCompresor(boolean p_compresor){
        this.compresor = p_compresor;
    }
    
    public int getPies(){
        return this.pies;
    }
    
    public int getPuertas(){
        return this.puertas;
    }
    
    public boolean getCompresor(){
        return this.compresor;
    }
    //metodo abstracto
    /**
     * redefinicion del metodo creditoConAdicional, retorna el costo total del Artefacto con el interes, teniendo en cuenta, ademas, 
     * si posee un compresor o no.
     * return @float retorna el costo total del Artefacto con el interes
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        float total = 0;
        if(this.getCompresor() == true){
            total = (this.cuotaCredito(p_cuotas, p_interes)+50)*p_cuotas;
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
        System.out.println("Pies: "+this.getPies());
        System.out.println("Puertas: "+this.getPuertas());
        System.out.println("Compresor: "+this.getCompresor());
    }
}

