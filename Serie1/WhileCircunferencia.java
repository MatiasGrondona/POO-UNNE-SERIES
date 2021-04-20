
/**
 * Write a description of class WhileCircunferencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class WhileCircunferencia{
    public static void main(String [] args){
      Scanner teclado = new Scanner(System.in);
      System.out.println("perimetro de una circunferencia? '1'(si) '2'(no)");
 
      int respuesta = teclado.nextInt();
   
      while(respuesta == 1){
      
      System.out.println("ingrese el radio de la circunferencia:");
      float radio = teclado.nextFloat();
      double circunferencia = 2 * 3.14 * radio;
      System.out.println("Circunferencia:" + circunferencia);
      
      System.out.println("perimetro de otra circunferencia? '1'(si) '2'(no)");
      respuesta = teclado.nextInt();
    }
    }
}
