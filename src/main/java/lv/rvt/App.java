package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int reizes = 0;
   
        int lietotajs = Integer.valueOf(scanner.nextLine());
        while(reizes<lietotajs ){
            reizes +=1;
            text();
        }
}
public static void text(){
    System.out.println("In a hole in the ground there lived a method");
}
    
}
