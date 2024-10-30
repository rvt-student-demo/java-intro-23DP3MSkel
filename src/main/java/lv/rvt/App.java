package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App 
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        
        int[] masivs = new int[10];

        for(int i=0; i<10; i++){
            masivs[i] = rand.nextInt(10);
            System.out.print(masivs[i] + " ");
        }
        int summa = 0;

        int min = masivs[0];
        int max = masivs[0];

        for(int i = 0;i<10;i++){
            if(min>masivs[i]){
                min = masivs[i];
            }
            if(max<masivs[i]){
                max = masivs[i];
            }
            summa = summa + masivs[i];
        }
        double average = (double) summa/masivs.length ;
        System.out.println();
        System.out.println("Lielākais masīva ir: "+max);
        System.out.println("Mazākais masīvā ir: "+min);
        System.out.println("Vidējā vērtība ir: "+  average);
        
        bubbleSort(masivs);

        
        }
        public static int[] bubbleSort(int[] skaitli){
        
        for(int i = 0; i<skaitli.length; i++){
            for(int j = 0; j<skaitli.length -1; j++){
                if (skaitli[j]> skaitli[j+1]){
                    int temp = skaitli[j];
                    skaitli[j] = skaitli[j+1];
                    skaitli[j+1] = temp;
                }

            }
        }
            for(int skaitlis : skaitli ){
                System.out.print(skaitlis + " ");
            }
            return skaitli;
    }    
    
}
