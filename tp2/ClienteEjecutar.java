
/**
 * Write a description of class ClienteEjecutar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClienteEjecutar
{
   public static void main(String args[]){
       int dni = Integer.valueOf(args[0]);
       double saldo = Double.valueOf(args[3]);
       Cliente Cliente1 = new Cliente(dni,args[1],args[2],saldo);
       Cliente1.mostrar();
       double nuevoSaldo = Double.valueOf(args[4]);
       System.out.println("Nuevo Saldo: "+Cliente1.nuevoSaldo(nuevoSaldo));
       System.out.println("Cambio el Saldo: "+ Cliente1.agregaSaldo(nuevoSaldo));
       System.out.println("Apellido y Nombre: "+ Cliente1.apeYNom());
       
   }
}