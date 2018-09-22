
public class Book {
    
 String  Name = "Anas";
 int Price = 155 ;
 int Qty = 12 ;

public Book(){
    
}
    public Book(String Name, int Price, int Qty) {
        this.Name = Name;
        this.Price = Price;
        this.Qty = Qty;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

public void printInformation(){
    System.out.println("The Name Is "+Name);
System.out.println("The Prise  Is "+Price);
System.out.println("The Qty  Is "+Qty);

}

}
