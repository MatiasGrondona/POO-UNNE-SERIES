
/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
/**
 *
 * @author Matias Grondona
 */
public class Ventana extends JFrame {
    public JPanel panel;
    public Ventana(){
        //this.setBounds(10, 10, 1280, 720);
        this.setSize(720, 720);//establecer tamaño ventana
        //this.setLocation(10, 10);
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión Biblioteca");
        this.iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        this.colocarPaneles();
        this.colocarEtiquetas();
        this.colocarBotones();
        //panel.add(etiqueta);//añade la Etiqueta al Panel
    }
    
    private void colocarBotones(){
        JButton boton1 = new JButton("BOTON");
        boton1.setBounds(100, 100, 100, 40);
        panel.add(boton1);
        //boton1.setEnabled(false);//permite bloquear un boton
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);//elimina el Layout por defecto del Panel
        //panel.setBackground(Color.GREEN);//dar Color al Panel
        
        this.getContentPane().add(panel);//añade el Panel a la Ventana
    }
    
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel("Hola");//crea una Etiqueta
        etiqueta.setBounds(10, 10, 30, 30);
        
        ImageIcon imagen = new ImageIcon("Pelota.png");
        JLabel etiqueta2 = new JLabel(imagen);
        etiqueta2.setBounds(100,100,300,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
}