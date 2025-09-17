
/**
 * Write a description of class Escuela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escuela
{
    //variables de instancia
    private String nombre;
    private String domicilio;
    private String director;
    //constructor de la clase
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setDirector(String p_director){
        this.director = p_director;
    }
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public String getDirector(){
        return this.director;
    }
    // metodos
    
    /**
     * recibe como parametro un objeto de la clase Docente
     * muestra por pantalla los datos del recibo
     * @param Docente:p_docente
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: "+this.getNombre()+"\t Domicilio: "+this.getDomicilio()+
                            "\t Director: "+this.getDirector());
        System.out.println("Docente: "+p_docente.getNombre());
        System.out.println("Sueldo: …………………………….\t $"+p_docente.calcularSueldo());
        System.out.println("Sueldo Basico: …………………………….\t $"+p_docente.getSueldoBasico());
        System.out.println("Asignacion Familiar: …………………………….\t $"+p_docente.getAsignacionFamiliar());
    }
}