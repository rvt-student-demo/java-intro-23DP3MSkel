package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args )
    {
        int summa=0;
        int a=0;
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> skaitli = new ArrayList<>();
        while (a==0) {
            System.out.println("Ievadiet");
            int input =Integer.valueOf(scanner.nextLine());
                skaitli.add(input);
            if (input==-1) {
                a=-1;
                for (int i = 0; i <skaitli.size(); i++) {
                    summa=summa+skaitli.get(i);
                    
           
                }
                System.out.println();
                System.out.println("Sum: "+summa);
           }   
        }

    }
    
    
}
