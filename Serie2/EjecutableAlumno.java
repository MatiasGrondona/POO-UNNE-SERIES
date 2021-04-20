
/**
 * Permite enviar mensajes a la clase Alumno con los parametros ingresados como parametros del main.
 * 
 * @author Matias Grondona 
 * @version 16/08/18
 */
public class EjecutableAlumno
{
    public static void main(String [] args)
    {
        int p_lu = Integer.valueOf(args[0]);
        String p_nombre = args[1];
        String p_apellido = args[2];
        double p_nota1 = Double.valueOf(args[3]);
        double p_nota2 = Double.valueOf(args[4]);
        
        Alumno alumno1;
        alumno1 = new Alumno(p_lu,p_nombre,p_apellido);
        alumno1.mostrar();
        System.out.println();
        System.out.println("Apellido y Nombre: "+alumno1.apeYNom());
        alumno1.setNota1(p_nota1);
        alumno1.setNota2(p_nota2);
        System.out.println();
        alumno1.mostrar();
        
    }
}
