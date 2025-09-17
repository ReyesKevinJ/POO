import java.util.Scanner;
/**
 * Clase ejecutable para probar la funcionalidad de la clase Punto.
 * Los datos son ingresados por teclado utilizando la clase Scanner.
 * Se crean objetos de tipo Punto con diferentes constructores 
 * y se aplican operaciones de desplazamiento y visualización.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class PuntoEjecutable {
    public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);

        //Punto creado en el origen
        Punto p1 = new Punto();
        System.out.println("Punto creado en el origen: " + p1.coordenadas());
        //Desplazamiento de p1
        System.out.print("Ingrese desplazamiento en X para el punto 1: ");
        double dx = lector.nextDouble();
        System.out.print("Ingrese desplazamiento en Y para el punto 1: ");
        double dy = lector.nextDouble();
        p1.desplazar(dx, dy);
        System.out.println("Despues de desplazar el punto 1: " + p1.coordenadas());
        p1.mostrar();

        System.out.println("---------------------------");

        //Punto creado con coordenadas ingresadas por teclado
        System.out.print("Ingrese coordenada X para el punto 2: ");
        dx = lector.nextDouble();
        System.out.print("Ingrese coordenada Y para el punto 2: ");
        dy = lector.nextDouble();

        Punto p2 = new Punto(dx, dy);
        System.out.println("Punto 2 creado en: " + p2.coordenadas());
        //Desplazamiento de p2
        System.out.print("Ingrese desplazamiento en X para el punto 2: ");
        dx = lector.nextDouble();
        System.out.print("Ingrese desplazamiento en Y para el punto 2: ");
        dy = lector.nextDouble();

        p2.desplazar(dx, dy);
        System.out.println("Despues de desplazar el punto 2: " + p2.coordenadas());
        p2.mostrar();
    }
}