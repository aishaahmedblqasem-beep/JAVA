package hw1_;


public class Laptop extends Computers {
     public Laptop (String Name , int Model ,  int storage)
    {
    super(Name , Model , storage);
    }
     
    @Override
    public void system()
    {System.out.println(getName() +" --> "+"IOS");
    
    }
}
