import java.util.*;
/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido
{
    private Calendar fecha;
    private ArrayList<Producto> productos;
    private Cliente cliente;
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<Producto>());
        this.agregarProducto(p_producto);
    }
    
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    
    private void setProductos(ArrayList<Producto> p_productos){
        this.productos = p_productos;
    }
    
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    public boolean quitarProducto(Producto p_producto){
        return this.getProductos().remove(p_producto);
    }
    
    
}