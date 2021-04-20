
/**
 * Permite probar la clase Gerenica
 * 
 * @author Grondona Matias
 * @version 04/11/2018
 */
public class AdministracionGerencia
{
    public static void main(String [] args) {
        Servicio servicio1= new Servicio("internet",5.00);
        Servicio servicio2=new Servicio("lavandería",25.00);
        Servicio servicio3=new Servicio("Alquiler de auto",200.00);
        
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se Instancian Varios Servicios,");
        System.out.println("----------------------------------------------------------------------------");
        
        Hotel hotel1= new Hotel("Guaraní",1000.00,7,"single");
        Cabaña cabaña1= new Cabaña("Lago Cristal",1500.00,5,3);
        
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se Crea un Hotel y una Cabaña");
        System.out.println("----------------------------------------------------------------------------");
        
        hotel1.agregarServicio(servicio1);
        hotel1.agregarServicio(servicio2);
        cabaña1.agregarServicio(servicio2);
        cabaña1.agregarServicio(servicio3);
        
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se agregan los Servicios a La Cabaña y Hotel");
        System.out.println("----------------------------------------------------------------------------");
        
        Gerencia gerencia1=new Gerencia("Las Alondras");
        
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se Crea una Gerencia Con el Nombre Las Alondras y se le agregan los Alojamientos");
        System.out.println("----------------------------------------------------------------------------");
        
        gerencia1.agregarAlojamiento(hotel1);
        gerencia1.agregarAlojamiento(cabaña1);
        gerencia1.mostrarLiquidacion();
        
        System.out.println("----------------------------------------------------------------------------");
    }
}
