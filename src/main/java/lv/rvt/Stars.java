package lv.rvt;

public class Stars {
    


public static void PrintStars(int number){    
    for(int i=0;number>i;i++){
        System.out.print("*");
    }
    System.out.println("");
    }

public static void PrintSqare(int number){
    for(int x =0;number>x;x++){
        PrintStars(number);
    }
}
}