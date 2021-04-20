import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

/** Clase abstracta que modela un Socio.
* @author Figueroa Facundo
* @version 7/11/2018
*/
public abstract class Socio {
    
    private int dniSocio;
    private String nombre;
    private int diasPrestamo;
    private ArrayList<Prestamo> prestamos;
    
    
    /** Constructor sin Prestamos.
    * @param int p_dniSocio.
    * @param String p_nombre.
    * @param int p_diasPrestamo.
    */
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo) {
        
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(new ArrayList<Prestamo> ());
    }
    
    
    /** Constructor con un solo Prestamo.
     * @param int p_dniSocio.
     * @param String p_nombre.
     * @param int p_diasPrestamo.
     * @param Prestamo p_prestamo.
     */
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo, Prestamo p_prestamo) {
        
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(new ArrayList<Prestamo> ());
        this.addPrestamo(p_prestamo);
    }
    
    
    /** Constructor para muchos Prestamos.
     * @param int p_dniSocio.
     * @param String p_nombre.
     * @param int p_diasPrestamo.
     * @param ArrayList<Prestamo> p_prestamos.
     */
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo, ArrayList<Prestamo> p_prestamos) {
        
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(p_prestamos);
    }
    
    
    /** Setter que asigna p_dniSocio al dni del Socio.
    * @param int p_dniSocio.
    * @return No devuelve ningun valor.
    */
    private void setDniSocio(int p_dniSocio) {
        
        this.dniSocio = p_dniSocio;
    }
    
    
    
    /** Setter que asigna p_nombre al nombre del Socio.
    * @param String p_nombre.
    * @return No devuelve ningun valor.
    */
    private void setNombre(String p_nombre) {
        
        this.nombre = p_nombre;
    }
    
    
    /** Setter que asigna p_diasPrestamo a los dias del prestamo del Socio.
    * @param int p_diasPrestamo.
    * @return No devuelve ningun valor.
    */
    public void setDiasPrestamo(int p_diasPrestamo) {
        
        this.diasPrestamo = p_diasPrestamo;
    }
    
    
    /** Setter que asigna p_prestamos al prestamo del Socio
    * @param ArrayList<Prestamo> p_prestamo.
    * @return No devuelve ningun valor.
    */
    private void setPrestamos(ArrayList<Prestamo> p_prestamos) {
        
        this.prestamos = p_prestamos;
    }
    
    
    /** Getter que retorna el dni del Socio.
    * @return Un valor de tipo int.
    */
    public int getDniSocio() {
        
        return this.dniSocio;
    }
    
    
    /** Getter que retorna el nombre del Socio.
    * @return Un valor de tipo String.
    */
    public String getNombre() {
        
        return this.nombre;
    }
    
    
    /** Getter que retorna los dias de prestamo del Socio.
    * @return Un valor de tipo int.
    */
    public int getDiasPrestamo() {
        
        return this.diasPrestamo;
    }
    
    
    /** Getter que retorna los prestamos del Socio.
    * @return Un objeto ArrayList<Prestamo> que contiene el conjunto de prestamos del Socio.
    */
    public ArrayList<Prestamo> getPrestamos() {
        
        return this.prestamos;
    }
    
    
    /** Agrega un prestamo a la coleccion de Prestamos.
    * @param Prestamo p_prestamo.
    * @return Devuelve un valor de tipo boolean.
    */
    public boolean addPrestamo(Prestamo p_prestamo) {
        
        return this.getPrestamos().add(p_prestamo);
    }
    
    
    /** Quita un prestamo de la coleccion de Prestamos.
    * @param Prestamo p_prestamo.
    * @return Devuelve un valor de tipo boolean.
    */
    public boolean removePrestamo(Prestamo p_prestamo) {
        
        return this.getPrestamos().remove(p_prestamo);
    }
    
    
    /** Cuenta la cantidad de libros prestados y devuelve el total.
    * @param No recibe ningun parametro.
    * @return Devuelve un valor de tipo int.
    */
    public int cantLibrosPrestados() {
        
        int cant = 0;
        for (Prestamo pres : this.getPrestamos()) {
            
            if (pres.getFechaDevolucion() == null) {
                
               cant = cant + 1;
            }
        }
        
        return cant;
    }
    
    
    /** Devuelve un string con el DNI, nombre, clase y la cantidad de libros prestados.
    * @param No recibe ningun parametro.
    * @return Devuelve un valor de tipo String.
    */
    public String toString() {
        
        return "D.N.I: "+ this.getDniSocio()+ " || "+ this.getNombre()+ " ("+ this.soyDeLaClase()+ ") "+" || "+"Libros Prestados: "+this.cantLibrosPrestados();
    }
    
    
    /** Devuelve true o false segun si puede pedir un prestamo o no.
    * @param No recibe ningun parametro.
    * @return Devuelve un valor de tipo boolean.
    */
    public boolean puedePedir() {
       
        
        Calendar fechaHoy= new GregorianCalendar();
        int venc= 0;
        
        for (Prestamo elem : this.getPrestamos()) {
            
            if (elem.vencido(fechaHoy) == true) {
                venc = venc + 1;
            }
            
        }
        
        if (venc == 0) {
            
            return true;
        } 
        else {
            
            return false;
        }
        
    }
    
    
    /** Metodo abstracto. Devuelve un String con el nombre de la clase de socio.
    * @return Devuelve un valor de tipo String.
    */
    public abstract String soyDeLaClase ();
    
}
    
        