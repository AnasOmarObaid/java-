
package q1;
import javax.swing.JOptionPane;

public class Q1 {

    public static void main(String[] args ) {
   String T = "Yes";
 
   do{    

      double a1,a2;
     
String ch = JOptionPane.showInputDialog(null, " Enter Your Operotor ==> [ + ,  -  , * Or   /  ]"   , 0);
     
      
      switch (ch){       
    case "+" : String q = JOptionPane.showInputDialog(null, " Enter Your Number [1]" );
               String l = JOptionPane.showInputDialog(null, " Enter Your Number [2] " );
    a1 = Double.parseDouble(l);
     a2 = Double.parseDouble(l);
     double sum = a1+a2;
    JOptionPane.showMessageDialog(null, "The sum Of Opretor " +(a1)+"+"+(a2) + "  ==> " +sum ,  "Test" ,1 );
    break;
    
    case "-" :
     String w = JOptionPane.showInputDialog(null, "ادخل الرقم ي اهبل ");
     String v = JOptionPane.showInputDialog(null, " Enter Your Number [2]");
     a1 = Integer.parseInt(w);
     a2 = Integer.parseInt(v);
     sum = a1-a2;
    JOptionPane.showMessageDialog(null, "The sub Of Opretor "+(a1)+"-"+(a2) + " ==> " +sum, "Test", 1 );
        break; 
        
    case "*" : 
        
      String r = JOptionPane.showInputDialog(null, " Enter Your Number [1] ", 0);
      String r2 = JOptionPane.showInputDialog(null, " Enter Your Number [2] ", 0);
      a1 = Integer.parseInt(r);
     a2 = Integer.parseInt(r2);
     sum = a1*a2;
    JOptionPane.showMessageDialog(null, "The Mault Of Opretor " +(a1)+"*"+(a2) + " ==> " +sum , "Test", 0 );   
       break;
      case "/" :  String t = JOptionPane.showInputDialog(null, " Enter Your Number [1]", 0);
                  String t2 = JOptionPane.showInputDialog(null, " Enter Your Number [2] ", 0);
      a1 = Integer.parseInt(t);
     a2 = Integer.parseInt(t2);
     sum = (a1/a2);
    JOptionPane.showMessageDialog(null, "The Mod Of Opretor " +(a1)+"/"+""+(a2) +" ==> "+sum, "Test", 0 );
       break;
      
      default :  JOptionPane.showMessageDialog(null, "You Must Enter [+ , - , Or  / ] " , "Worng Test" , 0);break;
       
      }
    String e = JOptionPane.showInputDialog(null, "If You Want To Try Again Enter Any Key ");
 }while(T.equals(T));
    }
}