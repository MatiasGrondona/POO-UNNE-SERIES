//indica cunatos dias de corrido quedan hasta la siguiente fecha de entrega
/**
 * Write a description of class ReposicionAutomatica here.
 * 
 * @author Matias Grondona
 * @version 22/09/18
 */
import java.io.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.*;
public class Reposicion2
{
    public static void main(String [] args){ 
        //variables de instancia de laboratorio
        String p_nombre = "";
        String p_domicilio = "";
        String p_telefono = "";
        int p_compraMinima;
        int p_diaEntrega;
        //variables para lectura de archivo directo
        int p_codLabDirecto = 0;
        
        long tamreg = 58;
        long canreg = 0;
        //variables de instancia de producto
        int p_codigo;
        String p_rubro;
        String p_descripcion;
        double p_costo;
        int p_stock;
        double p_porcPtoRepo;
        int p_existMinima;
        //variables para lectura de archivo secuancial
        int p_codLabSecuencial = 0;
        //variables acumuladoras
        int cantF = 0;
        int cantP = 0;
        int cantProdReponer = 0;
        double totalCompra = 0.0;
        //fecha hoy
        Date f_date = new Date();
        try{
            //lectura de archivo directo laboratorio.dat
            RandomAccessFile archi = new RandomAccessFile("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\laboratorio.dat","r");
            canreg = archi.length()/tamreg;
            
            
            //lectura de archivo secuencial producto.dat
            FileInputStream archiFIS = new FileInputStream("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\producto.dat");
            DataInputStream archiDIS = new DataInputStream(archiFIS);
            
            //creacion de un archivo secuencial de escritura txt
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
            FileOutputStream archiFOS = new FileOutputStream("C:\\Users\\matia\\Documents\\ArchivosPracticaJava\\comprar_"+
                                                                formatoFecha.format(f_date)+".txt",true);
            DataOutputStream archiDOS = new DataOutputStream(archiFOS);
            //encabezado del reporte
            System.out.println("Listado de productos a comprar al ");
            for(int r = 0; r < canreg; r++){
                p_codLabDirecto = archi.readInt();
                //lectura de Strings
                for(int i = 0; i < 30; i++){
                    p_nombre = p_nombre + archi.readChar();
                }
                
                for(int i = 0; i < 30; i++){
                    p_domicilio = p_domicilio + archi.readChar();
                }
                
                for(int i = 0; i < 30; i++){
                    p_telefono = p_telefono + archi.readChar();
                }
                
                p_compraMinima = archi.readInt();
                
                p_diaEntrega = archi.readInt();
                
                Laboratorio laboratorio1;
                laboratorio1 = new Laboratorio(p_nombre, p_domicilio, p_telefono, p_compraMinima, p_diaEntrega);
                while(archiDIS.available() > 0){
                    p_codigo = archiDIS.readInt();
                    p_rubro = archiDIS.readUTF();
                    p_descripcion = archiDIS.readUTF();
                    p_existMinima = archiDIS.readInt();
                    p_porcPtoRepo = archiDIS.readDouble();
                    p_stock = archiDIS.readInt();
                    p_costo = archiDIS.readDouble();
                    p_codLabSecuencial = archiDIS.readInt();
                    
                    if(p_codLabDirecto == p_codLabSecuencial){
                        Producto producto1;
                        producto1 = new Producto(p_codigo, p_rubro, p_descripcion, p_costo,p_porcPtoRepo, p_existMinima, laboratorio1);
                        double ptoReposicion = p_existMinima*(1+p_porcPtoRepo/100);
                        char p_solicitud = producto1.solicitar();
                        if(producto1.getStock() <= producto1.getLaboratorio().getCompraMin()){
                            //grabacion del archivo secuencial txt
                            archiDOS.writeInt(producto1.getCodigo());
                            archiDOS.writeInt(p_codLabDirecto);
                            archiDOS.writeInt(producto1.getLaboratorio().getCompraMin());
                            archiDOS.writeDouble(producto1.getCosto()*producto1.getLaboratorio().getCompraMin());
                            archiDOS.writeChar(p_solicitud);
                            //acumuladores
                            cantF = cantF + 1;
                            cantProdReponer = cantProdReponer +1;
                            totalCompra = totalCompra +producto1.getCosto()*producto1.getLaboratorio().getCompraMin();
                        }else if(producto1.getStock() <= ptoReposicion){
                            //grabacion del archivo secuencial txt
                            archiDOS.writeInt(producto1.getCodigo());
                            archiDOS.writeInt(p_codLabDirecto);
                            archiDOS.writeInt(producto1.getLaboratorio().getCompraMin());
                            archiDOS.writeDouble(producto1.getCosto()*producto1.getLaboratorio().getCompraMin());
                            archiDOS.writeChar(p_solicitud);
                            //acumuladores
                            cantP = cantP + 1;
                            cantProdReponer = cantProdReponer +1;
                            totalCompra = totalCompra +producto1.getCosto()*producto1.getLaboratorio().getCompraMin();
                        }else{
                            //grabacion del archivo secuencial txt
                            archiDOS.writeInt(producto1.getCodigo());
                            archiDOS.writeInt(p_codLabDirecto);
                            archiDOS.writeInt(producto1.getLaboratorio().getCompraMin());
                            archiDOS.writeDouble(producto1.getCosto()*producto1.getLaboratorio().getCompraMin());
                            archiDOS.writeChar(p_solicitud);
                        }
                        //reporte
                        
                        System.out.print("Producto: "+producto1.getRubro()+" - "+producto1.getDescripcion());
                        System.out.println(producto1.getLaboratorio().mostrar());
                        System.out.print("Cantidad a Comprar: "+producto1.getLaboratorio().getCompraMin()+" paquetes        ");
                        System.out.println("Dia de entrega: "+producto1.getLaboratorio().getDiaEntrega()+" del mes.");
                        Calendar diaHoy = new GregorianCalendar();
                        int diasRestantes = 0;
                        if(diaHoy.get(Calendar.DATE) > producto1.getLaboratorio().getDiaEntrega()){
                            diasRestantes = diaHoy.get(Calendar.DATE) + producto1.getLaboratorio().getDiaEntrega();
                        }else if(diaHoy.get(Calendar.DATE) < producto1.getLaboratorio().getDiaEntrega()){
                            diasRestantes = producto1.getLaboratorio().getDiaEntrega() - diaHoy.get(Calendar.DATE);
                        }else{
                            diasRestantes = 30;
                        }
                        System.out.println("Dias de entrega faltantes: "+diasRestantes+" dias corridos");
                        
                        System.out.println("----------------------------------------------------------");
                        
                        
                    }

                }
            }
            //fin del reporte
            System.out.println("Numero de productos a reponer: "+cantProdReponer);
            System.out.println("Importe totalde la compra planificada:"+totalCompra);
            System.out.println("Numero de compras por faltante de stock: "+cantF);
            System.out.println("Numero de compras por punto de reposicion: "+cantP);
            System.out.println("----------------------------------------------------------");
            System.out.println("comprar_"+formatoFecha.format(f_date)+".txt");
            System.out.println("----------------------------------------------------------");
            archi.close();
            archiDIS.close();
            archiDOS.close();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Archivo no encontrado!");
        }
        catch(IOException ioe)
        {
            System.out.println("Error al leer");
        }
        
    } 
}

