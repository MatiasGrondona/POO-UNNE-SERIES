
/**
 * Permite enviar mensajes a la clase Cliente con los parametros ingresados como parametros del main.
 * 
 * @author Matias Grondona 
 * @version 16/08/18
 */
public class EjecutableCliente
{
    public static void main(String [] args){
        int p_dni = Integer.valueOf(args[0]);
        String p_apellido=args[1];
        String p_nombre=args[2];
        double p_importe=Double.valueOf(args[3]);
        
        Cliente clienteSanJuan;
        clienteSanJuan = new Cliente(p_dni,p_apellido,p_nombre,p_importe);
        
        clienteSanJuan.mostrar();
        System.out.println();
        
        p_importe=Double.valueOf(args[4]);
        System.out.println("Nuevo Saldo: "+clienteSanJuan.nuevoSaldo(p_importe));
        System.out.println();
        
        p_importe=Double.valueOf(args[5]);
        System.out.println("Agregar Saldo: "+p_importe+" Saldo Actualizado: "+clienteSanJuan.agregarSaldo(p_importe));
        System.out.println();
        System.out.println("Apellido y Nombre: "+clienteSanJuan.apeYNom());
        System.out.println();
        clienteSanJuan.mostrar();
        
    }
}
