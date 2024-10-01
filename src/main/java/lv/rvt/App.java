package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
   
        int skaitli = 0;
        int lietotajs = Integer.valueOf(scanner.nextLine());

        while (true){
            if (skaitli != lietotajs){
                System.out.println(skaitli);
                skaitli = skaitli + 1;
                continue;
            }else if (skaitli == lietotajs){
                System.out.println(skaitli);
                break;
            }
        }
    }

    
}
