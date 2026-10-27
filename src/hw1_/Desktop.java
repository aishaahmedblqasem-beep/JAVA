package hw1_;

public class Desktop extends Computers {
    
    public Desktop (String Name , int Model , int storage)
    {
    super(Name , Model , storage);
    }
    @Override
    public void system()
    {System.out.println(getName() +" --> "+ "Windows");
    
    }
    
    
}
