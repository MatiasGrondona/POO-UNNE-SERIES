import java.util.ArrayList;

/**
 * Permite ejecutar las clases, Cocina, Lavarropas, Heladera.
 * @author Matias Grondona
 * @version 22/10/18
 */
public class Comercio {
    public static void main(String [] args){
        //Crear los Objetos
        ArrayList<ArtefactoHogar> electrodomesticos = new ArrayList();
        Cocina cocina1 = new Cocina("Liliana", 5000, 4, 4, 300,"Alto: 100.3 - Ancho: 50 - Profundidad: 50");
        Heladera heladera1 = new Heladera("Whirlpool", 15000, 3, 7, 2, true);
        Lavarropas lavarropas1 = new Lavarropas("Koinor", 8000, 5, 12, 15, false);
        //añadir los ArtefactosHogar al ArrayList
        electrodomesticos.add(cocina1);
        electrodomesticos.add(heladera1);
        electrodomesticos.add(lavarropas1);
        //Recorrer el arrayList y enviar el mensaje Mostrar
        for(int i = 0; i < electrodomesticos.size(); i++){
            System.out.println("-------------------------------------");
            electrodomesticos.get(i).imprimir();
            System.out.println("-------------------------------------");
        }
    }
    
}
