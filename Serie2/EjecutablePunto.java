/**
 * Permite enviar mensajes a la clase Punto con los parametros ingresados por la clase Scanner.
 * 
 * @author Matias Grondona
 * @version 26/08/18
 */

import java.util.Scanner;
public class EjecutablePunto
{
    public static void main(String [] args)
    {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        double p_x;
        double p_y;
        //El punto 1 se inicializa en (0,0)
        Punto punto1;
        punto1 = new Punto();
        
        System.out.println("El punto uno se inicializo al punto al origen.");
        //El punto 2 se inicializa con los valores ingresados por teclado
        System.out.println("Ingrese las cordenadas del punto 2.");
        
        System.out.print("Ingrese la abscisa (X): ");
        p_x = teclado.nextDouble();
        System.out.print("Ingrese la ordenada (Y): ");
        p_y = teclado.nextDouble();
        
        Punto punto2 = new Punto(p_x,p_y);
        
        punto2.mostrar();
        
        System.out.println("las cordenadas del punto 1 son: "+punto1.coordenadas());
        System.out.print("Ingrese el desplazamiento de la abscisa (X): ");
        p_x = teclado.nextDouble();
        
        System.out.print("Ingrese el desplazamiento de la ordenada (Y): ");
        p_y = teclado.nextDouble();
        
        punto1.desplazar(p_x,p_y);
        
        System.out.println("las nuevas cordenadas del punto 1 son: "+punto1.coordenadas());
    }
}
