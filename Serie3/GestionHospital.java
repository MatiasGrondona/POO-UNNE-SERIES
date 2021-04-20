
/**
 * permite ejecutar objtos de tipo Paciente, Hospital, Localidad.
 * 
 * @author Matias Grondona
 * @version 05/09/18
 */
import java.util.Scanner;
public class GestionHospital
{
    public static void main(String [] args)
    {
        int p_historia;
        String p_nombrePaciente;
        String p_domicilio;
        String p_nombreLocalidad;
        String p_provincia;
        String p_nombreHospital;
        String p_nombreDirector;
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        //creacion de los objetos paciente, hospital, localidad.
        System.out.println("Ingrese los datos del paciente.");
        
        System.out.print("Ingrese el N° Historia Clinica: ");
        p_historia = teclado.nextInt();
        
        System.out.print("Ingrese el nombre: ");
        p_nombrePaciente = teclado.next();
        
        System.out.print("Ingrese el domicilio: ");
        p_domicilio = teclado.next();
        //localidad de nacimiento
        System.out.print("Ingrese el nombre de la localidad de nacimiento: ");
        p_nombreLocalidad = teclado.next();
        
        System.out.print("Ingrese la provincia de nacimiento: ");
        p_provincia = teclado.next();
        
        Localidad localidad1;
        localidad1 = new Localidad(p_nombreLocalidad, p_provincia);
        
        //localidad actual de recidencia
        System.out.print("Ingrese el nombre de la localidad actual de recidencia: ");
        p_nombreLocalidad = teclado.next();
        
        System.out.print("Ingrese la provincia actual de recidencia: ");
        p_provincia = teclado.next();
        
        Localidad localidad2;
        localidad2 = new Localidad(p_nombreLocalidad, p_provincia);
        
        //creaccion del objeto paciente
        
        Paciente paciente1;
        paciente1 = new Paciente(p_historia, p_nombrePaciente, p_domicilio, localidad1, localidad2);
        
        System.out.print("Ingrese los datos del hospital. ");
        
        System.out.print("Ingrese el nombre del Hospital: ");
        p_nombreHospital = teclado.next();
        
        System.out.print("Ingrese el nombre del director del hospital: ");
        p_nombreDirector = teclado.next();
        
        Hospital hospital1;
        hospital1 = new Hospital(p_nombreHospital, p_nombreDirector);
        
        
        //prueba de los metodos
        
        System.out.println("datos del paciente: "+paciente1.cadenaDeDatos());
        
        hospital1.consultaDatosFiliatorios(paciente1);
    }
}
