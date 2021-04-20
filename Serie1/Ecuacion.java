
/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ecuacion
{
    public static void main(String [] args){
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double c = Double.valueOf(args[2]);
        double x1 = 0;
        double x2 = 0;
        double discriminante = Math.sqrt(Math.pow(b,2)-4*a*c);
        if(discriminante > 0){
            x1 = (-b + discriminante)/2*a;
            x2 = (-b - discriminante)/2*a;
            System.out.println("X1: "+x1);
            System.out.println("X2: "+x2);
        }else if(discriminante == 0){
            x1 = (-b + discriminante)/2*a;
            System.out.println("X1 = X2: "+x1);
        }else{
            System.out.println("el resultado es un numero complejo");
        }
    }
}
