package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
   
        int sum = 0;
        int amount = 0;
        int even = 0;
        int odd = 0;

        while(true){
        System.out.println("Give numbers:");
        int skaitlis = Integer.valueOf(scanner.nextLine());
        if(skaitlis>-1 || skaitlis<-1){
            sum = sum +  skaitlis;
            amount = amount + 1;
            if(skaitlis % 2 == 0){
                even ++;
            }else if (skaitlis % 2 != 0){
                odd = odd + 1;
                
            }
        }else if (skaitlis == -1){
            break;
        }
    }

    System.out.println("Thx! Bye!");
    System.out.println("Sum: "+ sum);
    System.out.println("Numbers: "+ amount);
    System.out.println("average: "+ (double) sum/amount);
    System.out.println("Even "+ even);
    System.out.println("ODD: "+ odd);
}

    
}
