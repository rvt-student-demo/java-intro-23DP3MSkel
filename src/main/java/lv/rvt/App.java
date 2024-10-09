package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ievadiet pirmo skaitli");
        int pirmais = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadiet otro skaitli");
        int otrais = Integer.valueOf(scanner.nextLine());
        System.out.println();
        divisibleByThree(pirmais,otrais);

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
