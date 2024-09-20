package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kāds ir jūsu ātrums?");
        int atrums = Integer.valueOf(scanner.nextLine());
        
        if (atrums>120) {

            System.out.println("Pārāk ātri");
        } else {
            System.out.println("Viss okay");
        }
    
    
    
    }

}
