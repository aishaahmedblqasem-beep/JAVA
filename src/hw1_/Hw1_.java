package hw1_;
import java.util.Optional;

public class Hw1_ {

 
    public static void main(String[] args) {
        Desktop pc = new Desktop("Dell",2024,512);
        Desktop pc1 = new Desktop("HP",2024,512);
        Laptop lap = new Laptop("mac",2022,256);
        Laptop lap1 = new Laptop("Mac",2020,0);
        
        pc.system();
        pc1.system();
        lap.system();
        lap1.system();
        
        Departments<Desktop> deptDesktop = new Departments<>();
        deptDesktop.checkWorks();
        deptDesktop.work(pc);
        deptDesktop.checkWorks();
         deptDesktop.checkWorks();
        deptDesktop.work(pc1);
        deptDesktop.checkWorks();
        
        Departments<Laptop> deptLaptop = new Departments<>();
        deptLaptop.work(lap);
        deptDesktop.checkWorks();
        deptLaptop.work(lap1);
        deptDesktop.checkWorks();

         Departments<Computers> deptAll = new Departments<>();
        deptAll.work(pc);
         deptAll.checkWorks();
         deptAll .work(lap);
         deptAll.checkWorks();
         deptAll.work(pc1);
         deptAll.checkWorks();
         deptAll .work(lap1);
         deptAll.checkWorks();
    }
    
}
