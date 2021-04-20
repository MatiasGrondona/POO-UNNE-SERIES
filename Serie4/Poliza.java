
/**
 * Write a description of class Poliza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
public class Poliza
{
    // instance variables
    private String cobertura;
    private Calendar fechaContrato;
    private double valorPoliza;
    private double valorAsegurado;
    private String momentoCancelacion;
    private UnidadDeRiesgo unidad;
    private Siniestro siniestro;

    /**
     * Constructor for objects of class Poliza
     * @param  String p_cobertura
     * @param  Calendar p_fecha
     * @param  double p_valorPoliza
     * @param  double p_valorAsegurado
     * @param  String p_momento
     * @param  UnidadDeRiesgo p_unidad
     * @param  Siniestro p_siniestro
     */
    public Poliza(String p_cobertura, Calendar p_fecha, double p_valorPoliza, 
                  double p_valorAsegurado, String p_momento, UnidadDeRiesgo p_unidad, Siniestro p_siniestro)
    {
        // initialise instance variables
        this.setCobertura(p_cobertura);
        this.setFechaContrato(p_fecha);
        this.setValorPoliza(p_valorPoliza);
        this.setValorAsegurado(p_valorAsegurado);
        this.setValorAsegurado(p_valorAsegurado);
        this.setUnidad(p_unidad);
        this.setSiniestro(p_siniestro);
    }
    //setters
    private void setCobertura(String p_cobertura)
    {
        this.cobertura = p_cobertura;
    }
    
    private void setFechaContrato(Calendar p_fecha)
    {
        this.fechaContrato = p_fecha;
    }
    
    private void setValorPoliza(double p_valorPoliza)
    {
        this.valorPoliza = p_valorPoliza;
    }
    
    private void setValorAsegurado(double p_valorAsegurado)
    {
        this.valorAsegurado = p_valorAsegurado;
    }
    
    private void setMomentoCancelacion(String p_momento)
    {
        this.momentoCancelacion = p_momento;
    }
    
    private void setUnidad(UnidadDeRiesgo p_unidad)
    {
        this.unidad = p_unidad;
    }
    
    private void setSiniestro(Siniestro p_siniestro)
    {
        this.siniestro = p_siniestro;
    }
    //getters
    public String getCobertura()
    {
        return this.cobertura;
    }
    
    public Calendar getFechaContrato()
    {
        return this.fechaContrato;
    }
    
    public double getValorPoliza()
    {
        return this.valorPoliza;
    }
    
    public double getValorAsegurado()
    {
        return this.valorAsegurado;
    }
    
    public String getMomentoCancelacion()
    {
        return this.momentoCancelacion;
    }
    
    public UnidadDeRiesgo getUnidad()
    {
        return this.unidad;
    }
    
    public Siniestro getSiniestro()
    {
        return this.siniestro;
    }
    //metodos especificos
    /**
     * Evalua la cobertura contratada y en base a esta retorna el valor total de la indemnizacion.
     * @return double valor total de la indemnizacion
     */
    public double indemnizacion()
    {
        double totalIndemnizacion = 0;
        if(this.getCobertura().equals("granizo") || this.getCobertura().equals("Granizo") ){
            totalIndemnizacion = this.getSiniestro().totalDaño(this.getValorAsegurado());
        }else if(this.getCobertura().equals("incendio") || this.getCobertura().equals("Incendio") ){
            totalIndemnizacion = 75*this.getSiniestro().totalDaño(this.getValorAsegurado())/100;
        }else{
            totalIndemnizacion = 30*this.getSiniestro().totalDaño(this.getValorAsegurado())/100;
        }
        return totalIndemnizacion;
    }
    
    /**
     * Evalua la cobertura contratada y en base a esta retorna la fecha en la cual se podra acceder a la indemnizacion.
     * @return Calendar la fecha en la cual se podra acceder a la indemnizacion.
     */
    public Calendar fechaIndemnizacion()
    {
        Calendar fechaCobro;
        if(this.getCobertura().equals("granizo") || this.getCobertura().equals("Granizo") ){
            fechaCobro = this.getUnidad().getFechaCosecha();
        }else if(this.getCobertura().equals("incendio") || this.getCobertura().equals("Incendio") ){
            fechaCobro = this.getSiniestro().getFecha();
            fechaCobro.add(Calendar.DATE,20);
        }else{
            fechaCobro = this.getUnidad().getFechaCosecha();
        }
        return fechaCobro;
    }
    
    /**
     * Imprime con un formato una leyenda que detalla el precio a pagar de la poliza.
     */
    public void detallePrecioPoliza()
    {
        String fechaCadena = this.getFechaContrato().get(Calendar.YEAR)+"/"
                            +(this.getFechaContrato().get(Calendar.MONTH)+1)+"/"
                            +this.getFechaContrato().get(Calendar.DATE);
        System.out.println("**** RESUMEN DEL SEGURO CONTRATADO EL DIA "+fechaCadena+"****");
        System.out.println("--------------Detalle de forma de pago de la poliza--------------");
        System.out.println("Precio a pagar: "+this.getValorPoliza());
        if(this.getMomentoCancelacion().equals("inicial") || this.getMomentoCancelacion().equals("Inicial"))
        {
            System.out.println("EL abono se realizara al comienzo de la siembra. tiene un descuento del 25%. Precio Real Abonado: 412.5");
        }else{
            System.out.println("EL abono se realizara al finalizar la siembra. Se abona el 100% de la poliza");
        }
        System.out.println("Valor del cultivo asegurado: "+this.getValorAsegurado());
        System.out.println("-----------------Detalle de la unidad de riesgo-----------------");
        this.getUnidad().mostrarDetalle();
        System.out.println("****************************************************************");
    }
    
    /**
     * Imprime en pantalla la informacion referente al Siniestro.
     */
    public void resumenIndemnizaciones()
    {
        String fechaCadena = this.getSiniestro().getFecha().get(Calendar.YEAR)+"/"
                            +(this.getSiniestro().getFecha().get(Calendar.MONTH)+1)+"/"
                            +this.getSiniestro().getFecha().get(Calendar.DATE);
        System.out.println("**** RESUMEN DEL SINIESTRO OCURRIDO EL DIA "+fechaCadena+"****");
        System.out.println("Porcentaje estimado de daño: %"+this.getSiniestro().getPorcentajeDaño());
        System.out.println("Total de daño producido por el siniestro: $"+this.getSiniestro().totalDaño(this.getValorAsegurado())); 
        System.out.println("***************************************************************");
    }
}
