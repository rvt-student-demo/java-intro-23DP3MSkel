package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        divisibleByThree(2,10);

    }
    public static void divide(int pirm, int otr){
        System.out.println((double)pirm/otr);
    }
    public static void divisibleByThree(int first, int second){
        while(first<=second){
            if(first % 3 == 0){
            System.out.println(first);
            
            }
            first++;
        }
        
       
    }
    
}
