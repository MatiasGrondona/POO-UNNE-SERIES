
/**
 * Write a description of class ArrayDePuntos here.
 * 
 * @author Matias Grondona
 * @version 27/09/18
 */
import java.util.Scanner;
public class ArrayDePuntos
{
    public static void main(String [] args){
        double p_x = 0;
        double p_y = 0;
        String comprobacion = "n";
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        Punto [] puntos = new Punto [6];
        
        System.out.println("SE INSTANCIAN 6 OBJETOS DE TIPO Punto.");
        
        for(int i = 0; i < puntos.length; i++){
            System.out.println("ingrese los valores del Punto "+(i+1));
            
            System.out.print("ingrese el valor de X: ");
            p_x = teclado.nextDouble();
            System.out.print("ingrese el valor de Y: ");
            p_y = teclado.nextDouble();
             
            Punto punto1 = new Punto(p_x, p_y);
            puntos [i] = punto1;
            
            
        }
        System.out.println("-----Coordenadas de todos los elementos-----");
        for(int i = 0; i < puntos.length; i++){
            System.out.println("Coordenadas elemento "+(i+1)+" : "+puntos [i].coordenadas());
        }
        System.out.println("-----Distancia cada dos elementos consecutivos-----");
        for(int i = 0; i < puntos.length; i++){
            if(i < (puntos.length - 1)){
                System.out.println("distancia entre el punto "+(i+1)+" y "+(i+2)+" : "+puntos[i].distanciaA(puntos[i+1]));
            }
        }
    }
}
