
/**
 * Write a description of class TrianguloRectangulo here.
 * 
 * @author (Torres Jemina Cesia - Reyes Kevin Josue)  
 * @version (a version number or a date)
 */
public class TrianguloRectangulo
{
    public static void main(String args[]){
        int h = Integer.valueOf(args[0]);
        int cateto1 = Integer.valueOf(args[1]);
        int cateto2 = Integer.valueOf(args[2]);
        int hPow = h*h;
        int cateto1Pow = cateto1*cateto1;
        int cateto2Pow = cateto2*cateto2;
        
        if((h*h)==(cateto1Pow+ cateto2Pow)){
            System.out.println("triangulo rectangulo");
        }else{
            System.out.println("no es");
        }
    }
}