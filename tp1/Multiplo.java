
/**
 * Write a description of class Multiplo here.
 * 
 *  @author (Torres Jemina Cesia - Reyes Kevin Josue) 
 * @version (a version number or a date)
 */
public class Multiplo
{
    public static void main(String args[]){
        for(int i =42;i<=150;i++){
            int mod= i%4;
            if(mod==0){
                System.out.println(i);
            }
        }
    }
}