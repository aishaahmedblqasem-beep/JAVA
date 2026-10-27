package hw1_;

abstract class Computers {
    private String Name;
    private int Model;
    private int storage;
    public Computers(String Name , int Model , int storage)
        { this.Name = Name;
          this.Model = Model;
          this.storage = storage;  }
    public String getName()
       {  return Name;   }
     public int getModel()
       {  return Model;   }
        public int getstorage()
       {  return storage;   }
    public abstract void system();
}
