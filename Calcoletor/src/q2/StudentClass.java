
package q2;


public class StudentClass {
   String Name ;
   int Id ;
   String Sub1 ;
   String Sub2 ;

    public StudentClass(String Name, int Id, String Sub1, String Sub2) {
        this.Name = Name;
        this.Id = Id;
        this.Sub1 = Sub1;
        this.Sub2 = Sub2;
    }
public StudentClass(){
}

    
   public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getId() {
        return "This The Id Of Stydent 1 " +Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getSub1() {
        return Sub1;
    }

    public void setSub1(String Sub1) {
        this.Sub1 = Sub1;
    }

    public String getSub2() {
        return Sub2;
    }

    public void setSub2(String Sub2) {
        this.Sub2 = Sub2;
    }
        public void SumTotalMark(){   
System.out.println("The Sum Of The Mark Is "+(Sub1+Sub2));

        }
}