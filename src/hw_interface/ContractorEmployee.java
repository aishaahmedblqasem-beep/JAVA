package hw_interface;

import java.time.LocalDate;
//             موظف متعاقد
public class ContractorEmployee extends Employee{
               //سعر الساعة
    private int hourlyRate;
               //ساعات العمل
    private int hoursWorked;

    public ContractorEmployee(String id, String name, LocalDate joinDate,int hourlyRate, int hoursWorked ) {
        super(id, name,0, joinDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateNetSalary() {
       return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateBonus(double preformanceScore) {
       if (preformanceScore > 4) {
        return 500;
    } else {
        return 0;
    } 
    }
}
