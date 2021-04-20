
/**
 * Write a description of class Prueba here.
 * 
 * @author Matias Grondona
 * @version 09/10/18
 */
import javax.swing.*;
import java.awt.event.*;
public class Ventana extends JFrame
{
    public Ventana(){
        this.setTitle("Ventana de Prueba"); // Método heredado de JFrame. Coloca título a la ventana
        this.setSize(300,200); // Asigna un tamaño a la ventana
        this.addWindowListener(new ManejadorConInterfaz());
    }
}
