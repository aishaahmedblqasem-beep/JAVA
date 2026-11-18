package hw_interface;
            //موظف

import java.time.LocalDate;
//موظف بدوام كامل
public class FullTimeEmployee extends Employee {
   //                البدل
    private double allowance;

    public FullTimeEmployee( String id, String name, double baseSalary, LocalDate joinDate ,double allowance) {
        super(id, name, baseSalary, joinDate);
        this.allowance = allowance;
    }

    @Override
    public double calculateNetSalary() 
            //إرجاع الراتب الأساسي + البدلات
    {return baseSalary + allowance;}
   
        

    @Override
    //التقييم الاداء
    public double calculateBonus(double preformanceScore) 
    {return baseSalary * 0.10 * preformanceScore; }
   
    
}
