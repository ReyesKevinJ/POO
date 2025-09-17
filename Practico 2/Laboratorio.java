
/**
 * Write a description of class Laboratorio here.
 * 
 * @author (Torres Jemina Cesia) 
 * @DNI (42790791)
 */

public class Laboratorio {
    //Atributos
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    //Metodos constructores
    public Laboratorio (String p_nombre, String p_domicilio, String p_telefono, 
                        int  p_compraMin, int p_diaEnt) {
        setNombre (p_nombre);
        setDomicilio (p_domicilio);
        setTelefono (p_telefono);
        setCompraMinima (p_compraMin);
        setDiaEntrega (p_diaEnt);
    }
    public Laboratorio (String p_nombre, String p_domicilio, String p_telefono) {
        setNombre (p_nombre);
        setDomicilio (p_domicilio);
        setTelefono (p_telefono);
    }
    
    //Metodos
    public void nuevaCompraMinima (int p_compraMin) {
        setCompraMinima(p_compraMin);
    }
    public void nuevoDiaEntrega (int p_diaEnt) {
        setDiaEntrega(p_diaEnt);
    }
    public String mostrar() {
        return ("Laboratorio: " + getNombre()+ "\n"+"Domicilio: "+getDomicilio()+" - "+"Telefono: "+getTelefono());
    }
    
    //Setters
    public void setNombre (String p_nombre) {
        this.nombre = p_nombre;
    }
    public void setDomicilio (String p_domicilio) {
        this.domicilio = p_domicilio;
    }
    public void setTelefono (String p_telefono) {
        this.telefono = p_telefono;
    }
    public void setCompraMinima (int p_compraMin) {
        this.compraMinima = p_compraMin;
    }
    public void setDiaEntrega (int p_diaEnt) {
        this.diaEntrega = p_diaEnt;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getCompraMinima() {
        return compraMinima;
    }
    public int getDiaEntrega() {
        return diaEntrega;
    }
}