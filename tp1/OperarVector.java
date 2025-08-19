
/**
 * Write a description of class OperarVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner; 
public class OperarVector
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int[] notas = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Ingrese nota "+(i+1)+":");
            notas[i]= teclado.nextInt();
        }
        
        int suma=0;
        for(int i= 0 ; i<notas.length; i++){
            suma+=notas[i];
        }
        
        int maximo = notas[0]; 
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maximo) {
                maximo = notas[i];
            }
        }
        double promedio= (double)suma / notas.length;
        System.out.println("Promedio: "+ promedio +"    Maximo: "+maximo);
    }
}