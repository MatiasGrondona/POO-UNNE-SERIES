
/**
 * permite enviar mensajes a la clase Laboratorio con los parametros ingresados como constantes.
 * 
 * @author Matias Grondona
 * @version 16/08/18
 */
public class EjecutableLaboratorio
{
    public static void main (String [] args)
    {
        Laboratorio lab1;
        lab1 = new Laboratorio("Bayer","SiempreViva145","3777414141",20,3);
        System.out.println(lab1.mostrar());
        System.out.println("Compra Minima: "+lab1.getCompraMin());
        System.out.println("Dia de entrega: "+lab1.getDiaEntrega());
        
        lab1.ajusteCompraMinima(5);
        lab1.ajusteDiaEntrega(5);
        System.out.println(lab1.mostrar());
        System.out.println("Compra Minima: "+lab1.getCompraMin());
        System.out.println("Dia de entrega: "+lab1.getDiaEntrega());
        
        Laboratorio lab2;
        lab2 = new Laboratorio("Aspirina","Calle Walabi - P. Sherman","12345678");
        System.out.println(lab2.mostrar());
        System.out.println("Compra Minima: "+lab2.getCompraMin());
        System.out.println("Dia de entrega: "+lab2.getDiaEntrega());
        
        lab2.ajusteCompraMinima(3);
        lab2.ajusteDiaEntrega(5);
        System.out.println(lab1.mostrar());
        System.out.println("Compra Minima: "+lab2.getCompraMin());
        System.out.println("Dia de entrega: "+lab2.getDiaEntrega());
        
    }
}
