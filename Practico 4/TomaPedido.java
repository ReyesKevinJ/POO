import java.util.*;
/**
 * Write a description of class TomaPedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TomaPedido
{
    public static void main(String args[]){
        Laboratorio laboratorio1 = new Laboratorio("Laboratorio Susana","Mexico 1030",
                                                    "33377893",23,13);
        Producto producto1 = new Producto(31,"Cuidado","Producto de cuidado",25890,25.4,
                                            32, laboratorio1);
        Producto producto2 = new Producto(32,"Baño","Producto de baño",2589,5.4,
                                            23, laboratorio1);
        Producto producto3 = new Producto(33,"Cuidado","Crema corporal",2590,20.4,
                                            10, laboratorio1);
        Producto producto4 = new Producto(35,"Farmacia","Producto de farmacia",25890,5.4,
                                            5, laboratorio1);
        producto1.ajuste(36);
        producto2.ajuste(27);
        producto3.ajuste(26);
        producto4.ajuste(17);
        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto2);
        Cliente cliente1 = new Cliente(34456788,"Perez","Juan",290000);
        Calendar fechaHoy = new GregorianCalendar();
        Pedido pedido = new Pedido(fechaHoy,cliente1, producto1);
        Pedido pedido2 = new Pedido(fechaHoy,cliente1, productos);
        pedido.mostrarPedido();
        pedido2.mostrarPedido();
        pedido.agregarProducto(producto4);
        System.out.println("Producto agregado a pedido 1");
        pedido.mostrarPedido();
    }
}