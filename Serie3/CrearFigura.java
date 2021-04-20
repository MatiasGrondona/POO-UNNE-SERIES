
/**
 * La clase EjecutablePunto crea y modifica objetos de tipo Punto Circulo y Rectangulo.
 * 
 * @author Matias Grondona
 * @version 05/09/18
 */

import java.util.Random;
public class CrearFigura
{
    public static void main(String [] args)
    {
        //Circulos
        Random unNumero = new Random();
        double radio = unNumero.nextDouble()*100.0;
        
        double p_x;
        double p_y;
        //El punto 1 se inicializa en (0,0)
        Punto punto1;
        punto1 = new Punto();
        
        Circulo circulo1;
        circulo1 = new Circulo(radio, punto1);
        
        circulo1.desplazar(-240, -230);
        
        circulo1.caracteristicas();
        
        unNumero = new Random();
        radio = unNumero.nextDouble()*100.0;
        
        Punto punto2;
        punto2 = new Punto(5.2,0.5);
        
        Circulo circulo2;
        circulo2 = new Circulo(radio, punto2);
        
        circulo1.elMayor(circulo2).caracteristicas();
        
        System.out.println("La distancia entre los dos circulos es de: "+circulo1.distanciaA(circulo2));
        
        //rectangulos
        Punto punto3;
        punto3 = new Punto();
        
        unNumero = new Random();
        double alto = unNumero.nextDouble()*100.0;
        
        unNumero = new Random();
        double ancho = unNumero.nextDouble()*100.0;
        
        Rectangulo rectangulo1;
        rectangulo1 = new Rectangulo(punto3, ancho, alto);
        
        rectangulo1.desplazar(40,-20);
        
        rectangulo1.caracteristicas();
        
        
        Punto punto4;
        punto4 = new Punto(7.4,4.5);
        
        unNumero = new Random();
        alto = unNumero.nextDouble()*100.0;
        
        unNumero = new Random();
        ancho = unNumero.nextDouble()*100.0;
        
        Rectangulo rectangulo2;
        rectangulo2 = new Rectangulo(punto4, ancho, alto);
        
        rectangulo1.elMayor(rectangulo2).caracteristicas();
        
        System.out.println("La distancia entre los dos rectangulos es de: "+rectangulo1.distanciaA(rectangulo2));
    }
}
