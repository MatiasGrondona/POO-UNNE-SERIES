
/**
 * La clase EjecutablePunto crea y modifica objetos de tipo Punto Circulo y Rectangulo.
 * 
 * @author Matias Grondona
 * @version 08/10/18
 */

import java.util.Random;
public class CrearFigura
{
    public static void main(String [] args)
    {
        //Circulos
        Random unNumero;
        
        //rectangulos
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se crea un objeto Rectangulo de lados Aleatorios.");
        System.out.println("----------------------------------------------------------------------------");
        Punto punto1;
        punto1 = new Punto();
        
        unNumero = new Random();
        double lado = unNumero.nextDouble()*100.0;
        
        Cuadrado cuadrado1 = new Cuadrado(punto1, lado);
        
        cuadrado1.desplazar(40,-20);
        
        cuadrado1.caracteristicas();
        
        //Circulo
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se crea un Objeto Circulo de radio Aleatorio.");
        System.out.println("----------------------------------------------------------------------------");
        Punto punto2;
        punto2 = new Punto();
        
        unNumero = new Random();
        double radio = unNumero.nextDouble()*100.0;
        
        Circulo circulo1 = new Circulo(radio, punto2);
        
        circulo1.desplazar(40,-20);
        
        circulo1.caracteristicas();
        System.out.println("----------------------------------------------------------------------------");
    }
}
