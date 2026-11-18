package hw_interface;

import java.time.LocalDate;

     //موظف
public abstract class Employee  implements Taxable, BonusCalculable, Comparable<Employee>  {
    private String id;
    private String name;
                    //راتب أساسي
    protected double baseSalary;
                    //ناريخ الانضمام
    private LocalDate joinDate;
    
    public Employee(String id, String name, double baseSalary, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.joinDate = joinDate;
    }
    
     public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }
    //                     حساب صافي الراتب
    public abstract double calculateNetSalary();
    
    @Override
    //        حساب الضريبة
    public double calculateTax()
    //حساب صافي الراتب*الضريبة
   {return calculateNetSalary() * TAX_RATE;}
    
    @Override
    //        المقارنة بين الموظفين
    public int compareTo(Employee other) 
   {return Double.compare(other.calculateNetSalary(), this.calculateNetSalary());}
    
   
public abstract double calculateBonus(double performanceScore);
    
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", baseSalary=" + baseSalary + ", joinDate=" + joinDate + '}';
    }
}
