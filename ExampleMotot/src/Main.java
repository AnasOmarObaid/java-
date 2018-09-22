import java.util.*;
import javax.swing.*;
 class Main {
  
     public static void main(String args[]){
      max(1,2);
  }  
public static void max(int i , int r ){
 while(true){
    String S1 =  JOptionPane.showInputDialog(null, "Enter Yor Number one");
   int I = Integer.parseInt(S1);
   
   String S2 =  JOptionPane.showInputDialog(null, "Enter Yor Number tow");
  
   int I2 = Integer.parseInt(S2);
  
   if(I>I2)
  
       JOptionPane.showMessageDialog(null, "The "+I+" Is Biger "+I2);
     

    else 
      
        JOptionPane.showMessageDialog(null, "The "+I+" Is smaler "+I2);
 }    

}
 
 }

