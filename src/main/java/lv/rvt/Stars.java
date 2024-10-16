package lv.rvt;

public class Stars {
    


public static void PrintStars(int number){    
    for(int i=0;number>i;i++){
        System.out.print("*");
    }
    System.out.println("");
    }

 public static void printRectangle(int number, int height ){
    for(int x =0;height>x;x++){
        PrintStars(number);
    }
}

public static void printTriangle(int tristuris){

    int sakums = 1;
    while(sakums<tristuris+1){
        printSpaces(tristuris-sakums);
        PrintStars(sakums);
        sakums ++;
        
    }

}


public static void printSpaces(int number){
    for(int x=0;number>x++;){
        System.out.print(" ");
    }
}

public static void printTriangle2(int number){

}

}