/**
 * Permite probar las clases Individuo, Delegacion, Visitante, Zoologico.
 * 
 * @author Grondona Matias
 * @version 31/10/2018
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
public class VentaDeEntradas
{
    public static void main(String [] args) {
        Calendar fechaNacimiento=new GregorianCalendar();
        Calendar fechaVisita=new GregorianCalendar();
        Calendar fechaDesde=new GregorianCalendar();
        Calendar fechaHasta=new GregorianCalendar();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se crean cuatro objetos de tipo Calendar");
        System.out.println("----------------------------------------------------------------------------");
        fechaDesde.set(2016,8,1);
        fechaHasta.set(2016,8,30);
        fechaNacimiento.set(1998,3,12);
        fechaVisita.set(2016,8,22);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("se le asignan fechas especificas a los Calendar");
        System.out.println("----------------------------------------------------------------------------");
        Persona persona1= new Persona(38928321,"Mariana","Gonzales",fechaNacimiento);
        Persona persona2= new Persona(38998321,"Pedro","Rodrigues",fechaNacimiento);
        Persona persona3= new Persona(38927312,"Analia","Pereira",fechaNacimiento);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("se Instancian tres objetos Persona para ser usados en Individuo");
        System.out.println("----------------------------------------------------------------------------");
        Individuo individuo1=new Individuo(persona1.getNombre(), fechaVisita, persona1);
        Individuo individuo2=new Individuo(persona2.getNombre(), fechaVisita, persona2);
        Individuo individuo3=new Individuo(persona3.getNombre(), fechaVisita, persona3);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se crean tres objetos Individuo, con el uso de Los Objetos Persona");
        System.out.println("----------------------------------------------------------------------------");
        Delegacion delegacionPami= new Delegacion("Pami",fechaVisita,individuo2);
        delegacionPami.agregarIntegrante(individuo3);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se Crea una delegacion llamada pami, con un individuo y luego se le agrega otro");
        System.out.println("----------------------------------------------------------------------------");
        Zoologico zoo1= new Zoologico("El Caribu");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("se crea el Zoologico, con el nombre de Calibu");
        System.out.println("----------------------------------------------------------------------------");
        zoo1.nuevoVisitante(individuo1);
        zoo1.nuevoVisitante(delegacionPami);
        zoo1.listarVisitante(fechaVisita);
        zoo1.listarTipoVisitantePorFecha(fechaVisita, "delegacion");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se agregan un visitante y una delegancion al Zoologico y se listan los visitantes");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Recaudación del mes de septiembre " + zoo1.recaudacion(fechaDesde, fechaHasta));
        
        System.out.println("----------------------------------------------------------------------------");
    }
}
