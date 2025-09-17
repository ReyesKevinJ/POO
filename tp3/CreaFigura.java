import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class CrarFigura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreaFigura
{
    public static void main(String args[]){
        System.out.println("Prueba de la clase circulo:");
        probarCirculo();
        System.out.println("Prueba de la clase rectangulo:");
        probarRectangulo();
    }
    
    public static double numeroRandom(){
        Random unNumero = new Random();
        return unNumero.nextDouble() * 100.0;
    }
    
    public static void probarRectangulo(){
        Scanner lector = new Scanner(System.in);
        double ancho = numeroRandom();
        double alto = numeroRandom();
        Rectangulo rectangulo1 = new Rectangulo(ancho, alto);
        rectangulo1.caracteristicas();
        rectangulo1.desplazar(ingresarCoordenada(lector, "x"), ingresarCoordenada(lector, "y"));
        rectangulo1.caracteristicas();
        //Otro circulo
        Punto centro2 = new Punto(ingresarCoordenada(lector, "x"), ingresarCoordenada(lector, "y"));
        double radio2 = numeroRandom();
        Rectangulo rectangulo2 = new Rectangulo(centro2, ancho, alto);
        rectangulo2.caracteristicas();
        
        System.out.println("Datos del mayor para que mi par me deje en paz");
        rectangulo1.elMayor(rectangulo2).caracteristicas();
        //Desplazamiento de un circulo
        
        System.out.println("Distancia entre rectangulos: "+rectangulo1.distanciaA(rectangulo2));
    }
    public static void probarCirculo(){
        Scanner lector = new Scanner(System.in);
        Punto centro = new Punto();
        double radio = numeroRandom();
        Circulo circulo1 = new Circulo(radio, centro);
        circulo1.caracteristicas();
        //Otro circulo
        Punto centro2 = new Punto(ingresarCoordenada(lector, "x"), ingresarCoordenada(lector, "y"));
        double radio2 = numeroRandom();
        Circulo circulo2 = new Circulo(radio2,centro2);
        circulo2.caracteristicas();
        
        System.out.println("Datos del mayor para que mi par me deje en paz");
        circulo1.elMayor(circulo2).caracteristicas();
        //Desplazamiento de un circulo
        circulo1.desplazar(ingresarCoordenada(lector, "x"), ingresarCoordenada(lector, "y"));
        System.out.println("Distancia entre ciruclos: "+circulo1.distanciaA(circulo2));
    }
    
    
    public static double ingresarCoordenada(Scanner p_lector, String p_coordenada){
        System.out.println("Ingrese coordenadas "+p_coordenada);
        return p_lector.nextDouble();
    }
}