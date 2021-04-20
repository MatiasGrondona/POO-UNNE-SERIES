
/**
 * Permite enviar mensajes a la clase Alumno.
 * 
 * @author Matias Grondona 
 * @version 08/10/18
 */
public class Escuela
{
    public static void main(String [] args)
    {
        int p_lu = 52888;
        String p_nombre = "Juan";
        String p_apellido = "Perez";
        double p_nota1 = 7.8;
        double p_nota2 = 7.9;
        int dni = 39000000;
        int anio = 2000;
        Alumno alumno1;
        alumno1 = new Alumno(p_lu,p_nombre,p_apellido, dni, anio);
        alumno1.mostrar();
        System.out.println("Apellido y Nombre: "+alumno1.apeYNom());
        alumno1.setNota1(p_nota1);
        alumno1.setNota2(p_nota2);
        alumno1.mostrar();
        
    }
}
