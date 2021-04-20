
/**
 * Write a description of class TomaPedido here.
 * 
 * @author Matias Grondona 
 * @version 14/10/18
 */
import java.util.ArrayList;
import java.util.*;
public class TomaPedido
{
    public static void main(String [] args){
        //variables para laboratorio
        String p_nombre = "LAB Bayer";
        String p_domi = "SiempreViva 123";
        String p_tel = "12345678";
        int p_compraMin = 30;
        int p_diaEntrega = 28;
        
        Laboratorio lab1 = new Laboratorio(p_nombre, p_domi, p_tel, p_compraMin, p_diaEntrega);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Se creo un objeto Laboratorio");
        System.out.println("-------------------------------------------------------------------------");
        //variables producto
        int p_cod = 0012;
        String p_rubro = "Perfumeria";
        String p_descripcion = "Colonia Hombres";
        double p_costo = 350.0;
        int p_stock = 6;
        double p_porcRepo = 12.4;
        int p_existencia = 8;
        
        Producto prod1 = new Producto(p_cod, p_rubro, p_descripcion, p_costo, p_porcRepo, p_existencia, lab1);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se creo un objeto Producto");
        System.out.println("-------------------------------------------------------------------------");
        p_cod = 0017;
        p_rubro = "Perfumeria";
        p_descripcion = "Colonia Mujer";
        p_costo = 550.0;
        p_stock = 4;
        p_porcRepo = 15.6;
        p_existencia = 9;
        
        Producto prod2 = new Producto(p_cod, p_rubro, p_descripcion, p_costo, p_porcRepo, p_existencia, lab1);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Se creo otro objeto Producto");
        System.out.println("-------------------------------------------------------------------------");
        //Arraylist
        
        ArrayList<Producto> p_productos = new ArrayList<Producto>();
        p_productos.add(prod1);
        p_productos.add(prod2);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se creo un ArrayList con los dos productos anteriores");
        System.out.println("-------------------------------------------------------------------------");
        //variables cliente
        int p_nroDni = 12345678;
        String p_apellido = "Perez";
        String p_nombreCliente = "Juan";
        double p_saldo = 60000.50;
        
        Cliente cliente1 = new Cliente (p_nroDni, p_apellido, p_nombreCliente, p_saldo);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se creo un objeto Cliente");
        System.out.println("-------------------------------------------------------------------------");
        //variables pedido
        
        Calendar p_fecha = new GregorianCalendar();
        
        Pedido pedido1 = new Pedido (p_fecha,cliente1, p_productos);
        Pedido pedido2 = new Pedido (p_fecha, cliente1, prod1);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se creo un Pedido con un ArrayList");
        System.out.println("se creo un Pedido con un Producto");
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Total al contado del Pedido 2: $"+pedido2.totalAlContado());
        System.out.println("Total Financiado del Pedido 2: $"+pedido2.totalFinanciado());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se agrega un producto mas al pedido 2.");
        System.out.println("-------------------------------------------------------------------------");
        pedido2.agregarProducto(prod2);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Total al contado del Pedido 2: $"+pedido2.totalAlContado());
        System.out.println("Total Financiado del Pedido 2: $"+pedido2.totalFinanciado());
        
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("datos del pedidio 1 que fue creado con un array list");
        pedido1.mostrarPedido();
        pedido1.quitarProducto(prod1);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("se elimino un elemento del pedido, se muestran los datos actualizados");
        System.out.println("-------------------------------------------------------------------------");
        pedido1.mostrarPedido();
        System.out.println("-------------------------------------------------------------------------");
    }
}
/*
 * crear
 * 1 laboratorio *
 * 2 productos * 
 * 1 coleccion de productos *
 * 2 pedidos
 * 1 cliente *
 */