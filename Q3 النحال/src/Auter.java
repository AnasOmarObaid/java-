
public class Auter extends Book {
 
 String  Email  = "ansmr0002@gmail.com"; 
   
 String Gender = "Plear";

    public Auter() {
    }

    public Auter(String Name, int Price, int Qty) {
        super(Name, Price, Qty);
    }
   
  public void printInformatio(){
  System.out.println("The Name of The Book Is "+Name);
System.out.println("The Prise of The Book Is "+Price);
System.out.println("The Qty  Is "+Qty);
      System.out.println("The Email Is "+Email);
  System.out.println("The Gender Is "+Gender);
  
  } 
}


