
/**
 * Esta clase contiene informacion de un  determinado Docente
 * 
 * @author Martinez juan
 * @version 11/11/2018
 */
import java.util.*;
public class Docente extends Socio
{
    private String area;
     
    
    /**
     * Constructor de la clase.
     * @param p_dniSocio: DNI del Docente.
     * @param p_nombre:   Nombre del Docente.
     * @param p_area:     Area del Docente.
     */
   public Docente(int p_dniSocio,String p_nombre,String p_area){
       super(p_dniSocio,p_nombre, 0);
       this.setArea(p_area);
   }
   /**
     * añade el area del docente
     * @param String p_area 
   */
   private void setArea(String p_area){
        this.area=p_area;
   }
   /**
     * devuelve el area del docente
     * @return String.
    */   
   public String getArea(){
        return this.area;
   }
   /**
     * verifica si el Docente nunca tuvo ni tiene un préstamo vencido.
     *  @return boolean
     */
   public boolean esResponsable(){
        Calendar fecha = new GregorianCalendar();
        for(Prestamo prestamo: this.getPrestamos()){
            if(prestamo.getFechaDevolucion() != null){
                fecha = prestamo.getFechaDevolucion();
            }
            if(prestamo.vencido(fecha)==true){
                return false;
            }
        }
        return true;
   }
   /**
     * verifica si el docente es responsable,si es asi, adiciona dias de prestamo al docente
     * @param int p_dias
     */
   public void agregarDiasDePrestamo(int p_dias){
          if(this.esResponsable()==true){
              this.setDiasPrestamo(this.getDiasPrestamo() + p_dias);      
          }else{
              System.out.println("Docente Inresponsable");
          }
   }
   /**
     * devuelve "Docente".
     * @return String.
     */
   public String soyDeLaClase(){
        return ("Docente");
   }
}
