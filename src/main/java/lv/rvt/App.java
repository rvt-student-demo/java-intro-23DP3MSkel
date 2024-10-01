package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
   
        int faktorials = 0;
        int summa = 0;
        System.out.println("last number?");
        int lietotajs = Integer.valueOf(scanner.nextLine());
        while(true){
            if(faktorials != lietotajs){
                faktorials = faktorials + 1;
                summa = summa + faktorials;
                continue;
            }else if(faktorials == lietotajs){
                System.out.println("the sum is " + summa );
                break;
            }
        }
    }

    
}
