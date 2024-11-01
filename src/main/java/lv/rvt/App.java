package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App 
{
    public static void main( String[] args )
    {
       Scanner input = new Scanner(System.in);
       int gaduSumma = 0;
       int skaits = 0;
       ArrayList <String> vardi = new ArrayList<>();


       while(true){
            String ievade = input.nextLine();
            if (ievade.isEmpty()){
                break;
            }

            String[] pieces = ievade.split(",");
            
            gaduSumma = gaduSumma + Integer.valueOf(pieces[1]);
            // skaits = skaits + Integer.valueOf(pieces[1]);
            skaits++;
            vardi.add(pieces[0]);

        }
        String garakais = "";
        for(int i = 0; i < skaits; i++) {
            if (vardi.get(i).length() > garakais.length()) {
                garakais = vardi.get(i);
            }
                }
            System.out.println("Garākais vārds ir: "+garakais);
            System.out.println("AVRG birth year: "+ ((double) gaduSumma / skaits));


       
       }

    }    
    

