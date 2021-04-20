
/**
 * Permite probar la clase Facultad
 * 
 * @author Grondona Matias 
 * @version 05/11/2018
 */

import java.util.*;
public class AplicacionFacultad
{
    public static void main(String [] args) {
        Calendar fecha1=new GregorianCalendar();
        fecha1.set(1999,4,25);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se crea un objeto Calendar y se le asigna una Fecha especifica");
        System.out.println("----------------------------------------------------------------------------");
        Cargo cargo1=new Cargo("JTP-POO",800.0,2008,10);
        Cargo cargo2=new SemiExclusivo("Adjunto-Sistemas Operativos",1800.0,2008,10,10);
        Cargo cargo3=new Exclusivo("Titular-Paradigma y Lenguajes",900.0,2008,10,10,10);
        Cargo cargo4=new Cargo("Titular-POO",2000.00,2005,10);
        Cargo cargo5= new SemiExclusivo("Adjunto-Paradigma y Lenguajes",800.00,2009,10,10);
        Cargo cargo6= new Exclusivo("JTP-Algoritmo y Estructura de Datos 1",1000.00,2010,10,10,5);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se Crean Seis Cargos para asignarle luego a los Profesores");
        System.out.println("----------------------------------------------------------------------------");
        Profesor profesor1= new Profesor("Juan","Perez",28596132,fecha1,"Lic. Sistemas de Información",cargo1);
        Profesor profesor2= new Profesor("Mariana", "Gonzales", 29874213,fecha1,"Lic. Sistemas de Información",cargo4);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("se Crean dos Profesores con un cargo cada uno");
        System.out.println("----------------------------------------------------------------------------");
        profesor1.agregarCargo(cargo2);
        profesor1.agregarCargo(cargo3);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se agregan dos cargos mas a uno de los profesores y se intenta agregar un cuarto");
        System.out.println("----------------------------------------------------------------------------");
        
        profesor1.agregarCargo(cargo3);//intengo agregar un cuarto cargo
        
        profesor2.agregarCargo(cargo5);
        profesor2.agregarCargo(cargo6);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se agregan dos cargos al otro profesor");
        System.out.println("----------------------------------------------------------------------------");
        
        Facultad facena= new Facultad("Facultad de Ciencas Exactas, Naturales y Agrimensura",profesor1);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se crea la facultad con un solo profesor y se le,agrega otro despues");
        System.out.println("----------------------------------------------------------------------------");
        facena.agregarProfesor(profesor2);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("se lista los profesores con cargos");
        System.out.println("----------------------------------------------------------------------------");
        facena.listarProfesorCargos();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se lista los profesores de la facultad");
        System.out.println("----------------------------------------------------------------------------");
        facena.nominaProfesores();
        System.out.println("\n\nRemuevo sucesivamente los cargos de la profesora");
        
        profesor2.removerCargo(cargo4);
        profesor2.removerCargo(cargo5);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Se intenta remover hasta que se quede sin cargos");
        System.out.println("----------------------------------------------------------------------------");
        profesor2.removerCargo(cargo6);
        System.out.println("Vuelvo a listar a los profesores");
        facena.listarProfesorCargos();
        facena.nominaProfesores();
        
        System.out.println("----------------------------------------------------------------------------");
    }
}
