/**
 * Permite crear y manipular un objeto alumno.
 * 
 * @author Matias Grondona
 * @version 08/10/18
 */
import java.util.*;
public class Alumno extends Persona
{
    // instance variables
    private int lu;
    private double nota1;
    private double nota2;

    /**
     * Constructor for objects of class Alumno
     * 
     * @param     p_lu
     * @param     p_nombre
     * @param     p_apellido     
     * @param     p_dni
     * @param     p_fecha
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido, int p_dni, Calendar p_fecha)
    {
        // initialise instance variables
        super (p_dni, p_nombre, p_apellido, p_fecha);
        this.setLu(p_lu);
        this.setNota1(0);
        this.setNota2(0);
    }
    
    /**
     * Constructor for objects of class Alumno
     * 
     * @param     p_lu
     * @param     p_nombre
     * @param     p_apellido  
     * @param     p_dni
     * @param     p_anio
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido, int p_dni, int p_anio)
    {
        // initialise instance variables
        super (p_dni, p_nombre, p_apellido, p_anio);
        this.setLu(p_lu);
        this.setNota1(0);
        this.setNota2(0);
    }
    //setters
    /**
     * Conjunto de setters de la clase, cambian el estado de los atributos del objeto.
     */
    private void setLu(int p_lu)
    {
        this.lu = p_lu;
    }
    
    public void setNota1(double p_nota)
    {
        this.nota1 = p_nota;
    }
    
    public void setNota2(double p_nota)
    {
        this.nota2 = p_nota;
    }
    //getters
    /**
     * Conjunto de getters de la clase, retornan el estado de los atributos del objeto.
     */
    public int getLu()
    {
        return this.lu;
    }

    public double getNota1()
    {
        return this.nota1;
    }
    
    public double getNota2()
    {
        return this.nota2;
    }
    //metodos extra
    /**
     * Evalua si las notas son iguales o superiores a 7.0.
     * 
     * @return     retorna true o false dependiendo del resultado de la evaluacion
     */
    private boolean aprueba()
    {
        if((this.getNota1() >= 7.0)&&(this.getNota2() >= 7.0))
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    /**
     * Evalua el retorno del metodo aprueba().
     * @return retorna la leyenda "APROBADO" o "DESAPROBADO"
     */
    private String leyendaAprueba()
    {
        if(this.aprueba() == true)
        {
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }
    }
    
    /**
     * Suma los atributos nota1 y nota2 y luego los divide para poder obtener el promedio.
     * @return un double con el promedio de las notas 1 y 2.
     */
    public double promedio()
    {
        return (this.getNota1() + this.getNota2())/2;
    }
    
    /**
     * imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
     */
    public void mostrar()
    {
        super.mostrar();
        System.out.println("LU: "+this.getLu()+"  "+"Notas: "+this.getNota1()+" - "+this.getNota2());
        System.out.println("Promedio: "+this.promedio()+" - "+this.leyendaAprueba());
    }
}
