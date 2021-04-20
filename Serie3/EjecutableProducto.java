
/**
 * Write a description of class EjecutableLaboratorio here.
 * 
 * @author (Matias Grondona) 
 * @version (16/08/18)
 */
public class EjecutableProducto
{
    public static void main (String [] args)
    {
        String p_nombre = args[0];
        String p_direccion = args[1];
        String p_telefono = args[2];
        int p_codigo = Integer.valueOf(args[3]);
        String p_rubro = args[4];
        String p_descripcion = args[5];
        double p_costo = Double.valueOf(args[6]);
        int p_ajuste = Integer.valueOf(args[7]);
        double p_ptoRepo = Double.valueOf(args[8]);
        int p_existencia = Integer.valueOf(args[9]);
        
        Laboratorio lab1;
        lab1 = new Laboratorio(p_nombre,p_direccion,p_telefono);
        
        Producto producto1;
        producto1 = new Producto(p_codigo, p_rubro, p_descripcion,p_costo,lab1);
        
        producto1.mostrar();
        
        producto1.ajuste(p_ajuste);
        System.out.println("Stock Valorizado: "+producto1.stockValorizado());
        System.out.println("Precio lista: "+producto1.precioLista());
        System.out.println("Precio Contado: "+producto1.precioContado());
        producto1.ajustarPtoRepo(p_ptoRepo);
        producto1.ajustarExistMinima(p_existencia);
        producto1.mostrar();
        
        System.out.println("Producto: "+producto1.mostrarLinea());
        
        
        
    }
}
