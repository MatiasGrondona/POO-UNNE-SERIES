
/**
 Esta clase  contiene informacion de un determinado estudiante
   @author Martinez juan 
   @ version 11/11/2018
 */
public class Estudiante extends Socio
{
    private String carrera;
    
   /**
     * Constructor de la clase.
     * @param p_dniSocio: DNI del Estudiante.
     * @param p_nombre:   Nombre del Estudiante.
     * @param p_carrera:  Carrera del Estudiante.
     */
    public Estudiante(int p_dniSocio,String p_nombre,String p_carrera){
        super(p_dniSocio,p_nombre, 0);
        this.setCarrera(p_carrera);
   }
   /**
     * añade la carrera del estudiante
     * @param String p_carrera 
   */
   public void setCarrera(String p_carrera){
            this.carrera= p_carrera;
   }
    /**
     * devuelve la carrera del estudiante
     * @return String.
    */    
   public String getCarrera(){
           return this.carrera;
   }
   /**
     * verifica si el estudiante no tiene prestamo vencido y si la cantidad de libros prestados es menor a 3.
     * @return boolean
   */
   public boolean puedePedir(){
          if(super.puedePedir()==true && this.cantLibrosPrestados()<3){
              return true;
          }else{
              return false;
       }
    }
   /**
     * devuelve "Estudiante".
     * @return String.
     */
    public String soyDeLaClase(){
        return ("Estudiante");
    }
}
    
    

