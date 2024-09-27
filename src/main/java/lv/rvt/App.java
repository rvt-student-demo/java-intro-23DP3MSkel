package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
   
        int numbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("give a number:");
            int nulle = Integer.valueOf(scanner.nextLine());
            if(nulle != 0){
                numbers = numbers+1;
                sum = sum + nulle;
                continue;
            }
            if (nulle == 0){
                break;
            }
            

        }
        System.out.println("Number of numbers:"+numbers);
        System.out.println("Sum of the numbers:"+sum);
    }

}
