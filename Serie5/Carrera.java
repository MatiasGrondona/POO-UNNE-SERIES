
/**
 * permite ejecutar las clases Alumno y Curso.
 * 
 * @author Matias Grondona 
 * @version 14/10/18
 */
import java.util.HashMap;
import java.util.*;
public class Carrera
{
    public static void main (String [] args){
        int p_lu = 12345;
        String p_nombre = "Juan";
        String p_apellido = "Perez";
        double p_nota1 = 9.0;
        double p_nota2 = 8.0;
        
        System.out.println("-------------------------------------------------------------------------");
        Alumno alumno1 = new Alumno(p_lu, p_nombre, p_apellido);
        alumno1.setNota1(p_nota1);
        alumno1.setNota2(p_nota2);
        System.out.println("Se creo un objeto Alumno1");
        
        p_lu = 23456;
        p_nombre = "Juana";
        p_apellido = "Pereza";
        p_nota1 = 7.0;
        p_nota2 = 8.0;
        Alumno alumno2 = new Alumno(p_lu, p_nombre, p_apellido);
        alumno2.setNota1(p_nota1);
        alumno2.setNota2(p_nota2);
        
        System.out.println("Se creo otro objeto Alumno2");
        
        p_lu = 34567;
        p_nombre = "Juancha";
        p_apellido = "Peresoza";
        p_nota1 = 10.0;
        p_nota2 = 7.0;
        Alumno alumno3 = new Alumno(p_lu, p_nombre, p_apellido);
        alumno3.setNota1(p_nota1);
        alumno3.setNota2(p_nota2);
        
        System.out.println("Se creo otro objeto Alumno3");
        System.out.println("-------------------------------------------------------------------------");
        HashMap<Integer, Alumno> p_alumnos = new HashMap<Integer, Alumno>();
        p_alumnos.put(new Integer(alumno1.getLu()),alumno1);
        p_alumnos.put(new Integer(alumno2.getLu()),alumno2);
        p_alumnos.put(new Integer(alumno3.getLu()),alumno3);
        
        System.out.println("se crea un HashMap con los tres alumnos");
        System.out.println("-------------------------------------------------------------------------");
        String p_nombreCurso = "5B";
        Curso curso1 = new Curso(p_nombreCurso,p_alumnos);
        p_nombreCurso = "3A";
        Curso curso2 = new Curso(p_nombreCurso);
        System.out.println("Se crean dos cursos uno con un HashMap y otro Vacio");
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Se Muestran los datos del primer Curso: ");
        System.out.println("");
        curso1.mostrarInscriptos();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("promedio de un alumno del curso 1");
        System.out.println("");
        curso1.imprimirPromedioDelAlumno(alumno2.getLu());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("buscar un alumno del curso 1");
        System.out.println("");
        curso1.buscarAlumno(alumno3.getLu()).mostrar();
        System.out.println("-------------------------------------------------------------------------");
        curso2.inscribirAlumno(alumno2);
        curso2.inscribirAlumno(alumno3);
        System.out.println("se agregan dos alumnos al curso 2 que estaba vacio y se muestra el listado");
        System.out.println("");
        curso2.mostrarInscriptos();
        System.out.println("-------------------------------------------------------------------------");
        curso2.quitarAlumno(alumno2.getLu());
        System.out.println("se elimina un alumno al curso 2 y se muestra el listado");
        System.out.println("");
        curso2.mostrarInscriptos();
        System.out.println("-------------------------------------------------------------------------");
        
        
    }
}
/*
 * instaciar
 * 3 alumno
 * 2 curso
 * crear un curso sin alumnos y otro con la coleccion
 * agregar un alumno al segundo
 * eliminar uno al primero mostrar datos
 */