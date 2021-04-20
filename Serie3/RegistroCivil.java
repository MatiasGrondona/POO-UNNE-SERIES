
/**
 * Permite crear y manipular objetos de tipo Hombre y Mujer.
 * 
 * @author Matias Grondona
 * @version 05/09/18
 *
 */
public class RegistroCivil
{
    public static void main(String [] args)
    {
        String m_nombre = args[0];
        String m_apellido = args[1];
        int m_edad = Integer.valueOf(args[2]);
        
        String h_nombre = args[3];
        String h_apellido = args[4];
        int h_edad = Integer.valueOf(args[5]);
        
        Mujer mujer1;
        mujer1 = new Mujer(m_nombre,m_apellido,m_edad);
        
        Hombre hombre1;
        hombre1 = new Hombre(h_nombre,h_apellido,h_edad);
        
        hombre1.mostrarEstadoCivil();
        mujer1.mostrarEstadoCivil();
        
        System.out.println("casar a Maria y Pedro.");
        if (((hombre1.getEsposa() == null) && (mujer1.getEsposo() == null)) &&
            ("Soltero".equals(hombre1.getEstadoCivil())&&("Soltera".equals(mujer1.getEstadoCivil()))))
        {
                hombre1.casarce(mujer1);
                mujer1.casarce(hombre1);
        }else{
            System.out.println("no se pueden casar porque uno de los dos ya lo esta");
        }
        
        hombre1.casadoCon();
        hombre1.mostrarEstadoCivil();
        mujer1.mostrarEstadoCivil();
        
        System.out.println("Maria y Pedro se van a divorciar.");
        if (((hombre1.getEsposa() == mujer1) && (mujer1.getEsposo() == hombre1)) &&
            ("Casado".equals(hombre1.getEstadoCivil())&&("Casada".equals(mujer1.getEstadoCivil()))))
        {
                hombre1.divorcio();
                mujer1.divorcio();
        }
        hombre1.mostrarEstadoCivil();
        mujer1.mostrarEstadoCivil();
    }
}
