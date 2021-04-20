
/**
 * Write a description of class OrdenVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class OrdenVector
{
    public static void main(String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        int i,j;
        double aux;
        double [] vector = new double[4];
        double minElem = 9999999;
        
        
        //ingresar elementos en el vector
        for(i = 0; i < 4; i++){
            System.out.print("Ingrese el numero: ");
            vector[i] = teclado.nextDouble();
        }
        //menor elemento y mostarlo
        for(i = 0; i < 4; i++){
            if(minElem > vector[i])
            {
                minElem = vector[i];
            }
        }
        System.out.println("el menor de los elementos es: "+minElem);
        //ordenar menor a mayor y mostar con tabulacion
        for (i = 0; i < 4 - 1; i++) {
            for (j = 0; j < 4 - i - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j+1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        System.out.print("elementos del vector:");
        for(i = 0; i < 4; i++){
            System.out.print("\t"+vector[i]);
        }
    }
}
