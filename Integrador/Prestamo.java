import java.util.Calendar;
import java.util.GregorianCalendar;

/** Permite crear y manipular un objeto Prestamo.
* @author Figueroa Facundo
* @version 7/11/2018
*/
public class Prestamo {
    
    private Calendar fechaRetiro;
    private Calendar fechaDevolucion;
    private Socio socio;
    private Libro libro;
    
    
    /** Constructor para objeto de tipo Prestamo.
    * @param Calendar p_fechaRetiro
    * @param Socio p_socio
    * @param Libro p_libro.
    */
    public Prestamo (Calendar p_fechaRetiro, Socio p_socio, Libro p_libro) {
        
        this.setFechaRetiro(p_fechaRetiro);
        this.setSocio(p_socio);
        this.setLibro(p_libro);
        this.setFechaDevolucion(null);
    }
    
    
    /** Setter que asigna p_fechaRetiro a la fecha de retiro del Prestamo.
    * @param Calendar p_fechaRetiro.
    * @return No devuelve ningun valor.
    */
    private void setFechaRetiro (Calendar p_fechaRetiro) {
        
        this.fechaRetiro = p_fechaRetiro;
    }
    
    
    /** Setter que asigna p_fechaDevolucion a la fecha de devolucion del Prestamo.
    * @param Calendar p_fechaDevolucion.
    * @return No devuelve ningun valor.
    */
    private void setFechaDevolucion (Calendar p_fechaDevolucion) {
        
        this.fechaDevolucion = p_fechaDevolucion;
    }
    
    
    /** Setter que asigna p_socio al socio del Prestamo.
    * @param Socio p_socio.
    * @return No devuelve ningun valor.
    */
    private void setSocio (Socio p_socio) {
        
        this.socio = p_socio;
    }
    
    
    /** Setter que asigna p_libro al libro del Prestamo.
    * @param Libro p_libro.
    * @return No devuelve ningun valor.
    */
    private void setLibro (Libro p_libro) {
        
        this.libro = p_libro;
    }
    
    
    /** Getter que retorna la fecha de retiro del Prestamo.
    * @return Un valor de tipo Calendar.
    */
    public Calendar getFechaRetiro () {
        
        return this.fechaRetiro;
    }
    
    
    /** Getter que retorna la fecha de devolucion del Prestamo.
    * @return Un valor de tipo Calendar.
    */
    public Calendar getFechaDevolucion () {
        
        return this.fechaDevolucion;
    }
    
    
    /** Getter que retorna el socio del Prestamo.
    * @return Un valor de tipo Socio.
    */
    public Socio getSocio () {
        
        return this.socio;
    }
    
    
    /** Getter que retorna el libro del Prestamo.
    * @return Un valor de tipo Libro.
    */
    public Libro getLibro () {
        
        return this.libro;
    }
    
    
    /** Permite registra una fecha de devolucion.
    * @param Calendar p_fechaDevolucion.
    * @return No retorna ningun valor.
    */
    public void registrarFechaDevolucion (Calendar p_fechaDevolucion) {
        
        this.setFechaDevolucion(p_fechaDevolucion);
    }
    
    
    
    /** Devuelve true o false segun si el prestamo esta vencido o no.
    * @param Calendar p_fecha.
    * @return Devuelve un valor de tipo boolean.
    */
    public boolean vencido (Calendar p_fecha) {
        
        
        int anio = this.getFechaRetiro().get(Calendar.YEAR);
        int mes = this.getFechaRetiro().get(Calendar.MONTH);
        int dia = this.getFechaRetiro().get(Calendar.DATE);
        Calendar fechaVencimiento = new GregorianCalendar(anio,mes,dia);
        fechaVencimiento.add(Calendar.DATE, this.getSocio().getDiasPrestamo());
        
        if(this.getFechaDevolucion() != null){
            if(this.getFechaDevolucion().after(fechaVencimiento)){
                return true;
            }
        }else if(p_fecha.after(fechaVencimiento)){
            return true;
        }
        return false;
        /*if () {
            
            return true;
        }
        else {
            
            return false;
        }
        */
    }
    
    
    
    /** Devuelve un string con informacion del prestamo. Si no se registro fecha de devolucion imprime -/-/- como fecha.
    * @return Devuelve un valor de tipo String.
    */
    public String toString () {
        
        Calendar fechaR= this.getFechaRetiro();
        Calendar fechaD= this.getFechaDevolucion();
        
        if (fechaD != null) {
            
            return "Retiro: "+ fechaR.get(Calendar.YEAR)+ "/"+ fechaR.get(Calendar.MONTH)+ "/"+ fechaR.get(Calendar.DATE)+
               " - Devolucion: "+ fechaD.get(Calendar.YEAR)+ "/"+ (fechaD.get(Calendar.MONTH)+1)+ "/"+ fechaD.get(Calendar.DATE)+ 
               "\nLibro: "+ this.getLibro().getTitulo()+ 
               "\nSocio: "+ this.getSocio().getNombre();
        } else {
            
            return "Retiro: "+ fechaR.get(Calendar.YEAR)+ "/"+ fechaR.get(Calendar.MONTH)+ "/"+ fechaR.get(Calendar.DATE)+
               " - Devolucion: -/-/-"+
               "\nLibro: "+ this.getLibro().getTitulo()+ 
               "\nSocio: "+ this.getSocio().getNombre();
        }
    }
    
}