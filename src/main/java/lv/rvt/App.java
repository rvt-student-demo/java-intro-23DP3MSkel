package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("whats the value of the gift?");
        int nauda = Integer.valueOf(scanner.nextLine());

        if (nauda<5000){
            System.out.println("0% tax");
        }else if (nauda>=5000 && nauda<25000){
            System.out.println("tax: "+ (100 + (nauda-5000) * 0.08));
        }else if(nauda>=25000 && 55000>nauda){
        System.out.println("tax: "+(1700 + (nauda-25000)*0.1));
    }else if (nauda>=55000 && nauda<200000){
        System.out.println("tax: "+(4700+(nauda-55000)*0.12));
    }else if (nauda>=200000 && nauda<1000000){
        System.out.println("tax: "+ (22100 + (nauda-200000)*0.15));
    } else if (nauda>=1000000){
        System.out.println("tax: " +(142100 + (nauda-1000000)*0.17));
    }
    
    }

}
