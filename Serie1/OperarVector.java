
/**
 * Write a description of class OperarVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class OperarVector
{
    public static void main(String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        int [] notas = new int[5];
        int i;
        double promedio;
        int sumNotas = 0;
        int auxMayor=0;
        //cargar las notas a cada posision del vector
        for(i = 0; i < 5; i++){
            System.out.print("Ingrese la nota: ");
            notas[i] = teclado.nextInt();
        }
        //suma las notas
        for(i = 0; i < 5; i++){
            sumNotas = sumNotas + notas[i];
            if(auxMayor < notas[i])
            {
                auxMayor = notas[i];
            }
        }
        //calcula e imprime el promedio
        promedio = (double)sumNotas/5;
        System.out.println("El promedio es: "+ promedio);
        //mustra la mayor nota
        System.out.println("La mayor nota es: "+ auxMayor);
        //mustra las notas
        System.out.print("las notas son: ");
        for(i = 0; i < 5; i++){
            System.out.print("\t"+ notas[i]);
        }
        
    }
}
