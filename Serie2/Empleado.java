/**
 * Permite crear y manipular un objeto empleado.
 * 
 * @author Matias Grondona 
 * @version 23/08/18
 */
import java.util.*;
public class Empleado
{
    // instance variables
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    /**
     * Constructor for objects of class Empleado.
     * @param     p_cuil
     * @param     p_apellido
     * @param     p_nombre
     * @param     p_importe
     * @param     p_anio
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        // initialise instance variables
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        
    }
    //setters
    /**
     * Setters de la clase que cambian el estado de los atributos del objeto.
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
    
    private void setAnioIngreso(int p_anio)
    {
        this.anioIngreso = p_anio;
    }
    //getters
    /**
     * Getters de la clase retorna el estado de los atributos del objeto.
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
    
    public int getAnioIngreso()
    {
        return this.anioIngreso;
    }
    //metodos extra
    /**
     * Realiza una resta del año actual y de ingreso, para obtener la antiguedad del empleado.
     * @return retorna la antiguedad del objeto empleado
     */
    public int antiguedad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        int antiguedad = anioHoy - this.getAnioIngreso();
        
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
    }
    
    /**
     * Retorna un String con un formato determinado.
     * @return retorna un String con un formato determinado
     */
    public String mostrarLinea()
    {
        return this.getCuil()+"  "+this.nomYApe()+".........."+this.sueldoNeto();
    }
    }

