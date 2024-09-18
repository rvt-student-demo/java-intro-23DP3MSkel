package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        // Make your first Hello World app!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        
        String tekstsPirmais = scanner.nextLine();
        int pirmaisSkaitlis = Integer.valueOf(tekstsPirmais);
        
        System.out.println("Give the second number:");
        String tekstsOtrais = scanner.nextLine();
        int otraisSkaitlis = Integer.valueOf(tekstsOtrais);

        double dalishana = (double) pirmaisSkaitlis / otraisSkaitlis;

        System.out.println(tekstsPirmais + "+" + tekstsOtrais + "=" + (pirmaisSkaitlis + otraisSkaitlis));
        System.out.println(tekstsPirmais + "-" + tekstsOtrais + "=" + (pirmaisSkaitlis-otraisSkaitlis));
        System.out.println(tekstsPirmais + "*" + tekstsOtrais + "=" +(pirmaisSkaitlis * otraisSkaitlis));
        System.out.println(tekstsPirmais + "/" + tekstsOtrais + "=" + dalishana);
    }

}
