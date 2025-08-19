
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
    private String nombre;
    private double precio;
    private int cantidad;
    
    Producto(String p_nombre, double p_precio, int p_cantidad){
        nombre= p_nombre;
        precio= p_precio;
        cantidad= p_cantidad;
    }
    
    public void modificarCantidad(int nuevaCantidad){
        cantidad = nuevaCantidad;
    }
}