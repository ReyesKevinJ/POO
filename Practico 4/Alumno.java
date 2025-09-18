
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    Alumno(int p_lu, String p_nombre, String p_apellido){
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }
    
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    public void setNota1(double p_nota){
        this.nota1= p_nota;
    }
    
    public void setNota2(double p_nota){
        this.nota2 = p_nota;
    }
    
    public int getLu(){
        return this.lu;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    
    public double getNota1(){
        return this.nota1;
    }
    
    public double getNota2(){
        return this.nota2;
    }
    
    public double promedio(){
        return (this.getNota1() + this.getNota2())/2;
    }
    
    private boolean aprueba(){
        double promedio = this.promedio();
        return (promedio > 7)&&(this.getNota1()>=6)&&(this.getNota2()>=6);
    }
    
    private String leyendaAprueba(){
        return this.aprueba()?"APROBADO":"DESAPROBADO";
    }
    
    public String nomYApe(){
        return this.getNombre()+" "+this.getApellido();
    }
    
    public String apeYNom(){
        return this.getApellido()+" "+this.getNombre();    
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+ this.nomYApe());
        System.out.println("LU: "+this.getLu()+"\t"+"Notas: "+this.getNota1()+"-"+this.getNota2());
        System.out.println("Promedio: "+this.promedio()+"-"+this.leyendaAprueba());
    }
}