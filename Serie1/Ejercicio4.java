
/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio4
{
    public static void main(String [] args){
        double a = Double.valueOf(args [0]);
        double b = Double.valueOf(args [1]);
        double c = Double.valueOf(args [2]);
        double semiperimetro = (a+b+c)/2;
        double area = Math.sqrt(semiperimetro*(semiperimetro-a)*
                      (semiperimetro-b)*(semiperimetro-c));
        System.out.println("Semiperimetro:"+semiperimetro);
        System.out.println("Area:"+area);
        
        
    }
}
