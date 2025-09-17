
/**
 * Write a description of class GestionStock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionStock
{
    public static void main(String args[]){
        Laboratorio Lab1 = new Laboratorio("Laboratorio 1", "Direccion 12","1223231", 200, 23);
        Producto Producto1 = new Producto(123,"Perfumeria","Jabón Deluxe",1500,15.0,10,Lab1);
        Producto1.ajuste(500);
        Producto1.mostrar();
        Producto1.ajuste(300);
        System.out.println(Producto1.mostrarLinea());
    }
}