
/**
 * Permite crear y manipular un objeto EmpleadoConJefe.
 * 
 * @author Matias Grondona 
 * @version 03/09/18
 */
import java.util.*;
import java.util.GregorianCalendar;
public class EmpleadoConJefe
{
    // instance variables
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    /**
     * Constructor for objects of class EmpleadoConJefe
     * 
     * @param     long p_cuil
     * @param     String p_apellido
     * @param     String p_nombre
     * @param     double p_importe
     * @param     Calendar p_fecha
     * @param     EmpleadoConJefe
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe)
    {
        // initialise instance variables
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }
    
    /**
     * Constructor for objects of class EmpleadoConJefe
     * 
     * @param     long p_cuil
     * @param     String p_apellido
     * @param     String p_nombre
     * @param     double p_importe
     * @param     Calendar p_fecha
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha)
    {
        // initialise instance variables
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }
    
    /**
     * Constructor for objects of class EmpleadoConJefe
     * 
     * @param     long p_cuil
     * @param     String p_apellido
     * @param     String p_nombre
     * @param     double p_importe
     * @param     int p_anio
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        // initialise instance variables
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }
    //setters
    /**
     * Setters de la clase que cambian el estado de los atributos del objeto
     */
    private void setCuil(long p_cuil)
    {
        this.cuil = p_cuil;
    }
    
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
        
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    private void setSueldoBasico(double p_sueldo)
    {
        this.sueldoBasico = p_sueldo;
    }
    
    private void setFechaIngreso(Calendar p_fecha)
    {
        this.fechaIngreso = p_fecha;
    }
    
    private void setJefe(EmpleadoConJefe p_jefe)
    {
        this.jefe = p_jefe;
    }
    
    private void setAnioIngreso(int p_anio)
    {
        this.setFechaIngreso(new GregorianCalendar(p_anio,0,1));
    }
    //getters
    /**
     * Getters de la clase retorna el estado de los atributos del objeto
     */
    public long getCuil()
    {
        return this.cuil;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
        
    public double getSueldoBasico()
    {
        return this.sueldoBasico;
    }
    
    public Calendar getFechaIngreso()
    {
        return this.fechaIngreso;
    }
    
    public EmpleadoConJefe getJefe()
    {
         return this.jefe;
    }
    
    public int getAnioIngreso()
    {
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    //metodos especificos
    /**
     * Realiza una resta del año actual y de ingreso, para obtener la antiguedad del empleado.
     * 
     * @return retorna la antiguedad del objeto empleado
     */
    public int antiguedad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        int antiguedad = anioHoy - this.getFechaIngreso().get(Calendar.YEAR);
        
        return antiguedad;
    }
    
    /**
     * obtiene el 2% del valor del atributo sueldoBasico y luego le suma $12.0.
     * 
     * @return     retorna el descuento a realizar a sueldoBasico
     */
    private double descuento()
    {
        double auxSueldo = 2*this.getSueldoBasico()/100;
        auxSueldo = auxSueldo + 12.0;
        return auxSueldo;
    }
    
    /**
     * en base a la antiguedad del empleado establece el porcentaje corespondienta al adicional.
     * 
     * @return     retorna el valor a sumar a sueldoBasico
     */
    private double adicional()
    {
        double adicional;
        
        if(this.antiguedad() < 2){
            //adicional es del 2%
            adicional = 2*this.getSueldoBasico()/100;
        }else if (this.antiguedad() >= 2 && this.antiguedad() < 10)
        {
            //adicional es del 4%
            adicional = 4*this.getSueldoBasico()/100;
        }else {
            //adicional es del 6%
            adicional = 6*this.getSueldoBasico()/100;
        }
    
        return adicional;
    }
    
    /**
     * Suma el adicional y resta el descuento a sueldoBasico.
     * 
     * @return    retorna el resultado de aplicar el descuento y el adicional a sueldoBasico
     */
    public double sueldoNeto()
    {
       return this.getSueldoBasico() + this.adicional() - this.descuento();     
    }
    
    /**
     * Retorna una cadena de caracteres con los atributos nombre y apellido.
     * @return retorna una cadena de caracteres con los atributos nombre y apellido
     */
    public String nomYApe()
    {
        return this.getNombre()+" "+this.getApellido();
    }
    
    /**
     * Retorna una cadena de caracteres con los atributos apellido y nombre.
     * @return retorna una cadena de caracteres con los atributos apellido y nombre
     */
    public String apeYNom()
    {
        return this.getApellido()+" "+this.getNombre();
    }
    
    /**
     * Imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void mostrar()
    {
        System.out.println("Nombre y Apellido: "+this.nomYApe());
        System.out.println("CUIL: "+ this.getCuil()+" "+"Antiguedad: "+this.antiguedad()+" "+"Años de sevicio");
        System.out.println("Sueldo Neto: "+this.sueldoNeto());
        if(this.getJefe() == null)
        {
            System.out.println("GERENTE GENERAL");
        }else
        {
            System.out.println("Responde a: "+this.getJefe().nomYApe());
        }
    }
    
    /**
     * Retorna un String con un formato determinado.
     * @return retorna un String con un formato determinado
     */
    public String mostrarLinea()
    {
        return this.getCuil()+"  "+this.nomYApe()+".........."+this.sueldoNeto();
    }
    
    /**
     * Si la fecha actual coincide con la fecha de ingreso del empleado, retorna 'true' en caso contrario 'false'.
     * 
     * @retun Retorna un boolean con el valor de true o false.
     */
    public boolean esAniversario()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int diaHoy = fechaHoy.get(Calendar.DATE);
        int mesHoy = fechaHoy.get(Calendar.MONTH);
        
        if((this.getFechaIngreso().get(Calendar.DATE) == diaHoy) && (this.getFechaIngreso().get(Calendar.MONTH) == mesHoy))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
