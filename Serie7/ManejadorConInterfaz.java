
/**
 * Write a description of class ManejadorConInterfaz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
class ManejadorConInterfaz implements WindowListener{
    // de todos los métodos que expone esta interfaz, sólo interesa escribir código en este, para cerrar la ventana
    public void windowClosing(WindowEvent e){
        System.out.println("hola kkk");
        System.exit(0); // Esta sentencia termina la máquina virtual
    }
    
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    
}
