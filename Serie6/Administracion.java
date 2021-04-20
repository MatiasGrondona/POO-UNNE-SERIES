

/**
 * Modela la administración de un jardin para saber el presupuesto a pagar por pintar figuras en el piso
 * 
 * @author Grondona Matias 
 * @version 05/11/18
 */
public class Administracion
{
    public static void main(String [] args) {
        Punto punto1= new Punto();
        Punto punto2=new Punto(7.5,6.5);
        Punto punto3=new Punto(9,22.5);
        Punto punto4= new Punto(17,15);
        Punto punto5=new Punto(27,2);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se crean cinco Objetos Punto con posiciones especifias");
        System.out.println("----------------------------------------------------------------------------");
        Cuadrado cuadrado1= new Cuadrado(punto1,5);
        Rectangulo rectangulo1=new Rectangulo(punto2,6,4);
        Elipse elipse1=new Elipse(6.9,10.9,punto3);
        Circulo circulo1=new Circulo(8,punto4);
        Triangulo triangulo1=new Triangulo(punto5,4,5);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se Instancian Diferentes Figuras Geometricas con los Puntos Anteriores");
        System.out.println("----------------------------------------------------------------------------");
        Jardin jardin1=new Jardin("La tortuga Carola",cuadrado1);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se crea el Objeto Jardin y  se agregan las Figuras anteriores");
        System.out.println("----------------------------------------------------------------------------");
        jardin1.agregarFigura(elipse1);
        jardin1.agregarFigura(rectangulo1);
        jardin1.agregarFigura(circulo1);
        jardin1.agregarFigura(triangulo1);
        jardin1.detalleFiguras();
        
        System.out.println("----------------------------------------------------------------------------");
    }
}
