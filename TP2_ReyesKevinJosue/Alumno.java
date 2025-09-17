
/**
 * La clase Alumno representa a un estudiante con un número de 
 * libreta universitaria (LU), nombre, apellido y dos notas.
 * 
 * Permite calcular el promedio de las notas, determinar si aprueba,
 * obtener la leyenda de aprobación y mostrar toda la información.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Alumno {
    //Atributos
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    /**
     * Constructor que inicializa LU, nombre y apellido.
     * Las notas se inicializan en cero.
     * 
     * @param p_lu numero de libreta universitaria
     * @param p_nombre nombre del alumno
     * @param p_apellido apellido del alumno
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido) {
        setLu(p_lu);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setNota1(0);
        setNota2(0);
    }
    
    //Setters
    public void setLu(int p_lu) {
        lu = p_lu;
    }
    public void setNombre(String p_nombre) {
        nombre = p_nombre;
    }
    public void setApellido(String p_apellido) {
        apellido = p_apellido; 
    }
    public void setNota1(double p_nota1) {
        nota1 = p_nota1;
    }
    public void setNota2(double p_nota2) {
        nota2 = p_nota2;
    }
    
    //Getters
    public int getLu() {
        return lu;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido; 
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    
    //Metodos
    
    /**
     * Calcula si el alumno aprueba.
     * Condicion: promedio > 7 y ambas notas ≥ 6.
     * 
     * @return true si aprueba, false si no
     */
    private boolean aprueba() {
        if(promedio() > 7.0 && (getNota1() >= 6 && getNota2() >= 6)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Retorna la leyenda de aprobacion segun aprueba().
     * @return "APROBADO" o "DESAPROBADO"
     */
    private String leyendaAprueba() {
        if(aprueba()) {
            return "APROBADO";
        }
        else {
            return "DESAPROBADO";
        }
    }
    
    /**
     * Calcula el promedio de las dos notas.
     * @return promedio de notas
     */
    public double promedio() {
        return (getNota1() + getNota2()) / 2;
    }
    
    /**
     * Retorna el nombre y apellido concatenados.
     * @return "Nombre Apellido"
     */
    public String nomYApe() {
        return getNombre() + " " + getApellido();
    }
    
    /**
     * Retorna el apellido y nombre concatenados.
     * @return "Apellido Nombre"
     */
    public String apeYNom() {
        return getApellido() + " " + getNombre();
    }
    
    /**
     * Muestra por consola la información completa del alumno:
     * nombre y apellido, LU, notas, promedio y estado de aprobacion.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("LU: " + getLu() + " \t" + "Notas: " + getNota1()
                           + " - " + getNota2());
        System.out.printf("Promedio: " + promedio() + " - ");
        System.out.println(leyendaAprueba());
    }
}