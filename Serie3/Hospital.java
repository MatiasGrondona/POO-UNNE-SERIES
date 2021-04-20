
/**
 * Permite crear y manipular un objeto de tipo Hospital.
 * 
 * @author Matias Grondona
 * @version 02/09/18
 */
public class Hospital
{
    // instance variables
    private String nombreHospital;
    private String nombreDirector;

    /**
     * Constructor for objects of class Hospital
     * 
     * @param String p_hospital
     * @param String p_director
     */
    public Hospital(String p_hospital, String p_director)
    {
        // initialise instance variables
        this.setNombreHospital(p_hospital);
        this.setNombreDirector(p_director);
    }
    //setters
    /**
     * Setters de la clase Hospital, cambian es estado de los atributos del objeto instanciado.
     */
    private void setNombreHospital(String p_hospital)
    {
        this.nombreHospital = p_hospital;
    }
    
    private void setNombreDirector(String p_director)
    {
        this.nombreDirector = p_director;
    }
    //getters
    /**
     * Getters de la clase Hospital, retornan el estado de los atributos del objeto instanciado.
     */
    public String getNombreHospital()
    {
        return this.nombreHospital;
    }
    
    public String getNombreDirector()
    {
        return this.nombreDirector;
    }
    //metodos especificos
    /**
    * Imprime en pantalla, con un formato determinado, el estado de los atributos del objeto.
    * 
    * @param Paciente p_paciente
    */
    public void consultaDatosFiliatorios(Paciente p_paciente)
    {
        System.out.println("Hospital: "+this.getNombreHospital()+"\t Director: "+this.getNombreDirector());
        System.out.println("----------------------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
}
