
/**
 * Write a description of class TrianguloRectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrianguloRectangulo
{
   public static void main(String [] args){
       double hipo = Double.valueOf(args[0]);
       double cateto1 = Double.valueOf(args[1]);
       double cateto2 = Double.valueOf(args[2]);
       if(Math.pow(hipo,2) == (Math.pow(cateto1,2)+Math.pow(cateto2,2))){
           System.out.println("El triangulo es rectangulo!!!");
        }
       
    }
}
