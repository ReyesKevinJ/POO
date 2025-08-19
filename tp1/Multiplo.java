
/**
 * Write a description of class Multiplo here.
 * 
 * @author (your name) 
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