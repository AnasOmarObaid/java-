
package temp;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer :");
        int n = input.nextInt();
        System.out.println("Enter the exponent :");
        int e = input.nextInt();
        System.out.println(pwr(n,e));
    }
    public  static double pwr(int n,int e){
        int result=1;
        for(int i=0;i<e;i++){
            result*=n;
        }
        return result;
    }
}
