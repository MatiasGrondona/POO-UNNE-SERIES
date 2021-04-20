
/**
 * Write a description of class Banco here.
 * 
 * @author Matias Grondona
 * @version 01/10/18
 */
import java.util.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.ArrayList;
public class Banco
{
    // instance variables
    private int nroSucursal;
    private String nombre;
    private Localidad localidad;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentasBancarias;
    /**
     * Constructor for objects of class Banco.
     * @param  String  p_nombre
     * @param  int  p_sucursal
     * @param  Localidad  p_localidad
     * @param  Empleado  p_empleado
     */
    public Banco(String p_nombre, int p_sucursal, Localidad p_localidad, Empleado p_empleado)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setNroSucursal(p_sucursal);
        this.setLocalidad(p_localidad);
        this.setEmpleados(new ArrayList<Empleado>());
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>());
    }
    
    /**
     * Constructor for objects of class Banco
     * @param  String  p_nombre
     * @param  int  p_sucursal
     * @param  Localidad  p_localidad
     * @param  ArrayList<Empleado>  p_empleados
     */
    public Banco(String p_nombre, int p_sucursal, Localidad p_localidad, ArrayList<Empleado> p_empleados)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setNroSucursal(p_sucursal);
        this.setLocalidad(p_localidad);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>());
    }
    
    /**
     * Constructor for objects of class Banco
     * @param  String  p_nombre
     * @param  int  p_sucursal
     * @param  Localidad  p_localidad
     * @param  ArrayList<Empleado>  p_empleados
     * @param  ArrayList<CuentaBancaria> p_cuentas
     */
    public Banco(String p_nombre, int p_sucursal, Localidad p_localidad, ArrayList<Empleado> p_empleados, ArrayList<CuentaBancaria> p_cuentas)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setNroSucursal(p_sucursal);
        this.setLocalidad(p_localidad);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentas);
    }
    //Accessors
    //setters
    /**
     * Accessors de la clase.
     */
    private void setNroSucursal (int p_sucursal){
        this.nroSucursal = p_sucursal;
    }
    
    private void setNombre (String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setLocalidad (Localidad p_localidad){
        this.localidad = p_localidad;
    }
    
    private void setEmpleados (ArrayList<Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    private void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentas){
        this.cuentasBancarias = p_cuentas;
    }
    //getters
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Localidad getLocalidad(){
        return this.localidad;
    }
    
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    
    public ArrayList<CuentaBancaria> getCuentasBancarias(){
        return this.cuentasBancarias;
    }
    //agregar y quitar elementos de empleados
    /**
     * Permite agregar un objeto a la coleccion empleados.
     * @param Empleado p_empleado
     * @return retorna un boolean con el resultado de la operacion.
     */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * Permite quitar un objeto a la coleccion empleados.
     * @param Empleado p_empleado
     * @return retorna un boolean con el resultado de la operacion.
     */
    public boolean quitarEmpleado(Empleado p_empleado){
        int cantEmpleados = this.getEmpleados().size();
        if(cantEmpleados >= 1){
            return this.getEmpleados().remove(p_empleado);
        }else{
            return false;
        }
    }
    //agregar y quitar elementos de cuentasBancarias
    /**
     * Permite agregar un objeto a la coleccion cuentasBancarias.
     * @param CuentaBancaria p_cuenta
     * @return retorna un boolean con el resultado de la operacion.
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentasBancarias().add(p_cuenta);
    }
    
    /**
     * Permite quitar un objeto a la coleccion cuentasBancarias.
     * @param CuentaBancaria p_cuenta
     * @return retorna un boolean con el resultado de la operacion.
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){   
        return this.getCuentasBancarias().remove(p_cuenta);
    }
    //metodos especificos
    public void listarSueldos(){
        for(int i = 0; i < this.getEmpleados().size(); i++){
            System.out.println(this.getEmpleados().get(i).mostrarLinea());
        }
    }
    
    public double sueldoAPagar(){
        double totalSueldos = 0;
        for(int i = 0; i < this.getEmpleados().size(); i++){
            totalSueldos = totalSueldos + this.getEmpleados().get(i).sueldoNeto();
        }
        return totalSueldos;
    }
    
    public void mostrar(){
        System.out.println("Banco: "+this.getNombre()+"\tSucursal"+this.getNroSucursal());
        this.getLocalidad().mostrar();
        this.listarSueldos();
        System.out.println("Total a Pagar-----------------------------"+this.sueldoAPagar());
    }
    //nuevos metodos ejercicio 4
    private void mostrarSaldoCero(){
        System.out.println("Titulares con cuentas saldo cero");
        System.out.println("-----------------------------------------------------------");
        for(int i = 0; i < this.getCuentasBancarias().size(); i++){
            if(this.getCuentasBancarias().get(i).getSaldo() == 0){
                System.out.println(this.getCuentasBancarias().get(i).getTitular().getDNI()+"\t\t"+
                                  this.getCuentasBancarias().get(i).getTitular().apeYNom());
            }
        }
        System.out.println("-----------------------------------------------------------");
    }
    
    private int cuentasSaldoActivo(){
        int cantCuentas = 0;
        for(int i = 0; i < this.getCuentasBancarias().size(); i++){
            if(this.getCuentasBancarias().get(i).getSaldo() > 0){
                cantCuentas = cantCuentas + 1;
            }
        }
        return cantCuentas;
    }
    
    public void mostrarResumen(){
        int totalCuentas = this.getCuentasBancarias().size();
        int cuentasActivas = this.cuentasSaldoActivo();
        int cuentasVacias = totalCuentas - cuentasActivas;
        //impresion
        System.out.println("Banco: "+this.getNombre()+" - Sucursal"+this.getNroSucursal());
        System.out.println(this.getLocalidad().mostrar());
        System.out.println("***********************************************************");
        System.out.println("RESUMEN CUENTAS BANCARIAS");
        System.out.println("***********************************************************");
        System.out.println("Numero total Cuentas Bancarias: "+totalCuentas);
        System.out.println("Cuentas Activas: "+cuentasActivas);
        System.out.println("Cuentas Saldo Cero: "+cuentasVacias);
        System.out.println("-----------------------------------------------------------");
        this.mostrarSaldoCero();
    }
    
}
