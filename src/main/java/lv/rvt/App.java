package lv.rvt;
import java.nio.channels.InterruptibleChannel;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Iedo punktus (0-100)");
        int punkti = Integer.valueOf(scanner.nextLine());

        if (punkti<0){
            System.out.println("Nav iespējams");
        } else if (punkti < 49) {
            System.out.println("fails");
        } else if (punkti>50 && punkti<59){
            System.out.println("1");
        } else if (punkti>60 && punkti<69){
            System.out.println("2");
        } else if (punkti>70 && punkti<79){
            System.out.println("3");
        } else if (punkti>80 && punkti<89){
            System.out.println("4");
        } else if (punkti>90 && punkti<100){
            System.out.println("5");
        } else if (punkti>100){
            System.out.println("neticami");
        }
    
    scanner.close();
    
    }

}
