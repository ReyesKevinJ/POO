
/**
 * La clase Laboratorio representa una entidad de tipo laboratorio
 * que maneja datos basicos como nombre, domicilio, telefono, 
 * compra minima y dia de entrega.
 * 
 * Permite crear laboratorios y actualizar informacion relevante 
 * como la compra minima y el día de entrega.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class Laboratorio {
    //Atributos
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Constructor completo.
     * Crea un laboratorio inicializando todos sus atributos.
     * 
     * @param p_nombre nombre del laboratorio
     * @param p_domicilio domicilio del laboratorio
     * @param p_telefono telefono de contacto
     * @param p_compraMin monto de compra minima
     * @param p_diaEnt dia de entrega
     */
    public Laboratorio (String p_nombre, String p_domicilio, String p_telefono, int  p_compraMin, int p_diaEnt) {
        setNombre (p_nombre);
        setDomicilio (p_domicilio);
        setTelefono (p_telefono);
        setCompraMinima (p_compraMin);
        setDiaEntrega (p_diaEnt);
    }
    
    /**
     * Constructor parcial.
     * Crea un laboratorio inicializando nombre, domicilio y telefono.
     * Los valores de compra minima y dia de entrega deben establecerse luego.
     * 
     * @param p_nombre nombre del laboratorio
     * @param p_domicilio domicilio del laboratorio
     * @param p_telefono teléfono de contacto
     */
    public Laboratorio (String p_nombre, String p_domicilio, String p_telefono) {
        setNombre (p_nombre);
        setDomicilio (p_domicilio);
        setTelefono (p_telefono);
    }
    
    //Setters
    public void setNombre (String p_nombre) {
        nombre = p_nombre;
    }
    public void setDomicilio (String p_domicilio) {
        domicilio = p_domicilio;
    }
    public void setTelefono (String p_telefono) {
        telefono = p_telefono;
    }
    public void setCompraMinima (int p_compraMin) {
        compraMinima = p_compraMin;
    }
    public void setDiaEntrega (int p_diaEnt) {
        diaEntrega = p_diaEnt;
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
    
    //Metodos
     /**
     * Actualiza el valor de la compra minima.
     * @param p_compraMin nuevo valor de compra minima
     */
    public void nuevaCompraMinima (int p_compraMin) {
        setCompraMinima(p_compraMin);
    }
    
    /**
     * Actualiza el dia de entrega.
     * @param p_diaEnt nuevo valor del dia de entrega
     */
    public void nuevoDiaEntrega (int p_diaEnt) {
        setDiaEntrega(p_diaEnt);
    }
    
    /**
     * Retorna una representacion en texto del laboratorio
     * con sus datos basicos (nombre, domicilio y telefono).
     * 
     * @return información formateada del laboratorio
     */
    public String mostrar() {
        return ("Laboratorio: " + getNombre()+ "\n"+"Domicilio: "+getDomicilio()+" - "+"Telefono: "+getTelefono());
    }
    
    
}