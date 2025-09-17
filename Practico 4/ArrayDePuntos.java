import java.util.*;
/**
 * Write a description of class ArrayDePuntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayDePuntos {
    public static void main(String args[]){
        Punto puntos[] = new Punto[6];
        Scanner lector = new Scanner(System.in);
        double x, y;
        
        for(int i = 0 ; i < puntos.length; i++){
            x = 0;
            y = 0;
            
            System.out.println("** Crear el punto " + (i+1) + "**");
            System.out.print("Ingrese coordenada x: ");
            x = lector.nextDouble();
            
            System.out.print("Ingrese coordenada y:");
            y = lector.nextDouble();
            puntos[i] = new Punto(x,y); //{(1,2), (2,3)}
        }
        
        for (Punto unPunto : puntos){
            unPunto.mostrar();
        }
        
        double distancia;
        for(int i = 1 ; i < 6; i++){
            distancia = puntos[i-1].distanciaA(puntos[i]);
            System.out.println("Distancia entre punto "+(i)+
                                " y punto " + (i+1) + " "+ distancia);
        }
    }
}