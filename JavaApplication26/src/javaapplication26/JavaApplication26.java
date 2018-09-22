
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;
import java.util.*;
/**
 *
 * @author ِAnas
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
  Scanner input = new Scanner(System.in);
  System.out.println("Enter Yor Number");
  int Secnt = input.nextInt();
   int Mint  = Secnt/60;
   int Day = Secnt%24*60*60;
   int Hours = Secnt%60*60;
   System.out.println(Mint+"عددالدقاىقق  هلس");
    System.out.println(Day+"عدد الايام ي شلقة");
    System.out.println(Hours+"عدد الساعات ي علق");
    }
    
}
