
/**
 * Write a description of class Biblioteca here.
 * FALTA TERMINAR DE DOCUMENTAR UNICAMENTE.
 * 
 * @author Matias Grondona
 * @version 10/11/18
 */
import java.util.*;
public class Biblioteca
{
    // instance variables
    private String nombre;
    private ArrayList<Socio> socios;
    private ArrayList<Libro> libros;

    /**
     * Constructor for objects of class Biblioteca
     * @param String p_nombre
     */
    public Biblioteca(String p_nombre)
    {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setLibros(new ArrayList<>());
        this.setSocios(new ArrayList<>());
    }
    //accessors
    /**
     * Accessors de la clase.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setSocios(ArrayList<Socio> p_socios){
        this.socios = p_socios;
    }
    
    public ArrayList<Socio> getSocios(){
        return this.socios;
    }
    
    private void setLibros(ArrayList<Libro> p_libros){
        this.libros = p_libros;
    }
    
    public ArrayList<Libro> getLibros(){
        return this.libros;
    }
    //agregar y quitar colecciones
    /**
     * Añade un objeto Socio a la coleccion de Socios.
     * @param Socio p_socio
     */
    public void addSocio(Socio p_socio){
        this.getSocios().add(p_socio);
    }
    
    /**
     * remueve un objeto Socio de la coleccion de Socios.
     * @param Socio p_socio
     */
    public void removeSocio(Socio p_socio){
         this.getSocios().remove(p_socio);
    }
    
    /**
     * Añade un objeto Libro a la coleccion de Libros.
     * @param Libro p_libro
     */
    private void addLibro(Libro p_libro){
        this.getLibros().add(p_libro);
    }
    
    /**
     * remueve un objeto Libro de la coleccion de Libros.
     * @param Libro p_libro
     */
    public void removeLibro(Libro p_libro){
         this.getLibros().remove(p_libro);
    }
    //metodos especificos
    /**
     * Instancia un Objeto Libro y Lo Agrega a la Coleccion de Libros.
     * @param String p_titulo
     * @param int p_edicion
     * @param String p_editorial
     * @param int p_anio
     */
    public void nuevoLibro(String p_titulo, int p_edicion, String p_editorial, int p_anio){
        Libro libro1 = new Libro(p_titulo, p_edicion, p_editorial, p_anio);
        this.addLibro(libro1);
    }
    
    /**
     * Instancia un Objeto Estudiante y lo agrega a la Coleccion de Socios.
     * @param int p_dniSocio
     * @param String p_nombre
     * @param String p_carrera
     */
    public void nuevoSocioEstudiante(int p_dniSocio, String p_nombre, String p_carrera){
        Estudiante estudiante1 = new Estudiante(p_dniSocio, p_nombre, p_carrera);
        this.addSocio(estudiante1);
    }
    
    /**
     * Instancia un Objeto Docente y lo agrega a la Coleccion de Socios.
     * @param int p_dniSocio
     * @param String p_nombre
     * @param String p_area
     */
    public void nuevoSocioDocente(int p_dniSocio, String p_nombre, String p_area){
        Docente docente1 = new Docente(p_dniSocio, p_nombre, p_area);
        this.addSocio(docente1);
    }
    
    /**
     * Recibe por parametro el tripo de Socio a Contar y recorre la Coleccion de Socios verificando cuales cumplen la condicion y contandolos.
     * @param String p_objeto
     * @return int cantidad de objetos Socio de un tipo determinado.
     */
    public int cantidadSociosPorTipo(String p_objeto){
        int cant = 0;
        for(int i = 0; i < this.getSocios().size(); i++){
            if(p_objeto.equals(this.getSocios().get(i).soyDeLaClase())){
                cant = cant + 1;
            }
        }
        
        return cant;
    }
    
    /**
     * 
     */
    public boolean prestarLibro(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro){
        boolean control = false;
        if(this.getSocios().contains(p_socio) && this.getLibros().contains(p_libro)){
            int indiceLibro = this.getLibros().indexOf(p_libro);
            int indiceSocio = this.getSocios().indexOf(p_socio);
            if(this.getSocios().get(indiceSocio).puedePedir()){
              Prestamo prestamo1 = new Prestamo(p_fechaRetiro, this.getSocios().get(indiceSocio), this.getLibros().get(indiceLibro));
              this.getSocios().get(indiceSocio).addPrestamo(prestamo1);
              this.getLibros().get(indiceLibro).addPrestamo(prestamo1);
              control = true;  
            }
        
        }
        return control;
    }
    
    /**
     * 
     */
    public void devolverLibro(Libro p_libro){
        int indiceLibro = this.getLibros().indexOf(p_libro);
        if(this.getLibros().contains(p_libro) && this.getLibros().get(indiceLibro).prestado()){
            Calendar fechaHoy = new GregorianCalendar();
            this.getLibros().get(indiceLibro).getPrestamo().registrarFechaDevolucion(fechaHoy);
        }
        
    }
    
    /**
     * 
     */
    public ArrayList<Prestamo> prestamosVencidos(){
        ArrayList<Prestamo> retornoPrestamos = new ArrayList<>();
        Calendar fechaHoy = new GregorianCalendar();
        for(int i = 0; i < this.getLibros().size(); i++){
            if(this.getLibros().get(i).prestado() && this.getLibros().get(i).getPrestamo().vencido(fechaHoy)){
                retornoPrestamos.add(this.getLibros().get(i).getPrestamo());
            }
        }        
        return retornoPrestamos;
    }
    
    /**
     * 
     */
    public ArrayList<Docente> docentesResponsables(){
        ArrayList DocResponsables = new ArrayList();
        for(int i = 0; i<this.getSocios().size(); i++){
            if ((this.getSocios().get(i).soyDeLaClase().equals("Docente"))){
                Docente doc = (Docente)this.getSocios().get(i);
                if(doc.esResponsable()){
                    DocResponsables.add(doc);
                }
            }
        }
        return DocResponsables;
    }
    
    /**
     * 
     */
    public String quienTieneElLibro(Libro p_libro){
        int indiceLibro = this.getLibros().indexOf(p_libro);
        String cadena;
        if(this.getLibros().get(indiceLibro).prestado()){
            cadena = this.getLibros().get(indiceLibro).getPrestamo().getSocio().getNombre();
        }
        else {
            cadena = "El libro se encuentra en la biblioteca";
        }
        return cadena;
    }
    
    /**
     * 
     */
    public String listaDeSocios(){
        String string = "\tLista de Socios:\n\n";
        int i=1;
        for(Socio s : this.getSocios()){
            string += i +") "+ s.toString() +"\n";
            i++;
        }
        return string;
    }
    
    /**
     * 
     */
    public String listaDeLibros(){
        String string = "\tLista de Libros:\n\n";
        int i=1;
        for(Libro libro : this.getLibros()){
            string += i+") "+ libro.toString() +" || Prestado: "+((libro.prestado())? "(Si)":"(No)") +"\n";
            i++;
        }
        return string;
    }
    
    /**
     * 
     */
    public String listaDeDocentesResponsables(){
        String string = "\tLista de Docentes Responsables:\n\n";
        for(Docente d : this.docentesResponsables())
            string += d.toString();
        
        return string;
    }
    
    /**
     * 
     */
    public Socio buscarSocio(int dni){
        Socio aux = null;
        for(Socio s : this.getSocios())
            if(s.getDniSocio() == dni){
                aux = s;
                break;
            } 
        
        return aux;
    }
}
