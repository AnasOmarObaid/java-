
package javaapplication28;

import java.util.*;

public class JavaApplication28 {

    
    public static void main(String[] args) {
        int Enter1 ,Enter2;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter An Enteger From [20 to 90 ]");
        Enter1 = Input.nextInt();
        Enter2 = Input.nextInt();
        switch (Enter1){
            case 2 : System.out.print("Twenty"); break;
            case 3 : System.out.print("Thirty"); break;
            case 4 : System.out.print("Forty"); break;
            case 5 : System.out.print("Fifty"); break;
            case 6 : System.out.print("Sixty"); break;
            case 7 : System.out.print("Seventy"); break;
            case 8 : System.out.print("Eigty"); break;
            case 9 : System.out.print("Ninety"); break;
        }
        switch (Enter2){
            case 2 : System.out.print("Tow"); break;
            case 3 : System.out.print("Three"); break;
            case 4 : System.out.print("Four"); break;
            case 5 : System.out.print("Five"); break;
            case 6 : System.out.print("Six"); break;
            case 7 : System.out.print("Seven"); break;
            case 8 : System.out.print("Eigt"); break;
            case 9 : System.out.print("Nin"); break;
    }
 
}


}

