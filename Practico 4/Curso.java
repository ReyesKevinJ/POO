import java.util.*;
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
    private String nombre;
    private HashMap alumnos;
    // constructores 
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap());
    }
    
    public Curso(String p_nombre, HashMap p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    // setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlumnos(HashMap p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    //getters 
    
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap getAlumnos(){
        return this.alumnos;
    }
    
    // metodos para modificar hashmap
    
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(new Integer(p_alumno.getLu()),p_alumno);
    }
    
    public Alumno quitarAlumno(int p_lu){
        Alumno alumno= (Alumno)this.getAlumnos().get(new Integer(p_lu));
        this.getAlumnos().remove(new Integer(p_lu));
        return alumno;
    }
    
    //metodos propios
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    
    public boolean estaIncripto(int p_lu){
        return this.getAlumnos().containsKey(new Integer(p_lu));
    }
    
    public boolean estaIncripto(Alumno p_alumno){
        int lu = p_alumno.getLu();
        return this.getAlumnos().containsKey(new Integer(lu));
    }
    
    public Alumno buscarAlumno(int p_lu){
        return (Alumno)this.getAlumnos().get(new Integer(p_lu));
    }
    
    public void imprimirPromedioDelAlumno(int p_lu){
        Alumno alumno = (Alumno)this.getAlumnos().get(new Integer(p_lu));
         
        System.out.println("****-- Mostrar promedio del alumno "+alumno.getLu()+"--****");
        System.out.println("Promedio: "+alumno.promedio());
    }
    
    public void mostrarInscriptos(){
        System.out.println("****-- Cantidad de inscriptos: "+this.cantidadDeAlumnos());
        for(Object unAlumno: this.getAlumnos().values()){
            Alumno alumno = (Alumno)unAlumno;
            System.out.println(alumno.getLu()+" "+alumno.nomYApe());
        }
    }
}