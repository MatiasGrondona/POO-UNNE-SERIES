
/**
 * Write a description of class Secretaria here.
 * 
 * @author Matias Grondona
 * @version 28/08/18
 */
public class Secretaria
{
    public static void main(String [] args)
    {
        String nombreEscuela = args[0];
        String domicilio = args[1];
        String director = args[2];
        
        String nombreDocente = args[3];
        String grado = args[4];
        double sueldoBasico = Double.valueOf(args[5]);
        double asignacion = Double.valueOf(args[6]);
        
        Escuela escuela1;
        escuela1 = new Escuela(nombreEscuela, domicilio, director);
        
        Docente docente1;
        docente1 = new Docente(nombreDocente, grado, sueldoBasico, asignacion);
        
        escuela1.imprimir(docente1);
    }
}
