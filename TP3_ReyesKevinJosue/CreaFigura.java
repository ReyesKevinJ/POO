import java.util.Random;
import java.util.Scanner;
/**
 * Clase ejecutable que crea dos circulos con radios ingresados por el usuario, 
 * desplaza uno de ellos, y muestra sus características, el mayor de los dos 
 * y la distancia entre sus centros.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class CreaFigura {
  /**
   * Punto de entrada del programa.
   */
   public static void main(String[] args) {
 
    //Variable para ingreso por teclado
    Scanner lector = new Scanner(System.in);
    //Variables auxiliares
    //double aux1, aux2;
    //Circulo de centro (0,0) y radio = numeroAleatorio() 
    Circulo circulo1 = new Circulo(numeroAleatorio(), new Punto());
    
    //Circulo 1
    circulo1.caracteristicas(); //Muestra las caracteristicas
    System.out.println("\n");
    circulo1.desplazar(ingresarDesplazamiento("X", "Circulo", lector), 
                        ingresarDesplazamiento("Y", "Circulo", lector)); //Desplaza el centro
    System.out.println("\n--- RESULTADO---");
    circulo1.caracteristicas(); //Muestra las caracteristicas
    
    //Circulo 2
    //Circulo de centro ingresado por teclado y radio = numeroAleatorio()
    System.out.println("\n");
    Punto punto = new Punto (ingresarCoordenadas("X", "Circulo", lector),  
                            ingresarCoordenadas("Y", "Circulo", lector));
    Circulo circulo2 = new Circulo(numeroAleatorio(), punto);
    System.out.println("\n--- RESULTADO---"); 
    circulo2.caracteristicas(); //Muestra las caracteristicas
    
    //Muestra las caracteristicas del mayor de los dos circulo
    System.out.println("\n--- Mayor de los dos circulos ---");
    circulo1.elMayor(circulo2).caracteristicas();   
    
    //Muestra la distancia entre ambos circulos
    System.out.printf("\nDistancia entre centros: %.2f%n", circulo1.distanciaA(circulo2));
    
    //RECTANGULOS
    
    //Rectangulo en (0,0) y dimensiones aleatorias
    Rectangulo rectangulo1 = new Rectangulo(numeroAleatorio(), numeroAleatorio());
    rectangulo1.caracteristicas(); //Muestra las caracteristicas
    
    //Desplaza el rectangulo 
    System.out.println("\n");
    rectangulo1.desplazar(ingresarDesplazamiento("X", "Rectangulo", lector), 
                            ingresarDesplazamiento("Y", "Rectangulo", lector));
    System.out.println("\n--- RESULTADO ---");
    rectangulo1.caracteristicas();
    
    //Rectangulo con origen ingresado por teclado y dimensiones aleatorias
    System.out.println("\n");
    punto = new Punto(ingresarCoordenadas("X", "Rectángulo", lector),
                    ingresarCoordenadas("Y", "Rectángulo", lector));
    Rectangulo rectangulo2 = new Rectangulo(punto, numeroAleatorio(), numeroAleatorio());
    
    //Muestra las caracteristicas del mayor de los dos rectangulos
    System.out.println("\n--- Mayor de los dos Rectangulos ---");
    rectangulo1.elMayor(rectangulo2).caracteristicas();
    
    //Muestra la distancia entre ambos rectangulos
    System.out.printf("\n\nDistancia entre rectangulos: %.2f%n", rectangulo1.distanciaA(rectangulo2));
    
  }
  
  private static double numeroAleatorio() {
    Random numero = new Random();
    return numero.nextDouble() * 100;
  }
  
  private static double ingresarCoordenadas(String p_letra, String p_palabra, Scanner p_lector) {
    System.out.println("Ingrese coordenada " +  p_letra + " del " + p_palabra + ": ");
    return p_lector.nextDouble();
  }
  
  private static double ingresarDesplazamiento(String p_letra, String p_palabra, Scanner p_lector) {
    System.out.println("Ingrese el desplazamiento " +  p_letra + " del " + p_palabra + ": ");
    return p_lector.nextDouble();  
  }
}