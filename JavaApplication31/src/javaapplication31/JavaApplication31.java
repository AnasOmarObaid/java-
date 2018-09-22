/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author ِAnas
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int x [] = {0,1,2,3,4,5};
      for(int i = x.length-2;i>=0;--i){
          x[i+1]=x[i];
      }
        for(int e : x){
            System.out.print(e);
        }
    }
    
}
