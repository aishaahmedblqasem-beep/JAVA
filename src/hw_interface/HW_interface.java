package hw_interface;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;



import java.util.Comparator;

class SeniorityComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return a.getJoinDate().compareTo(b.getJoinDate());
    }
}

public class HW_interface {

     //نظام الرواتب (PayrollSystem)
    public static void main(String[] args) {
      
       
      List<Employee > emp = new ArrayList<>();
     emp.add(new FullTimeEmployee("FE1","Ali",5000,LocalDate.of(2020, 3,1),105));
     emp.add(new FullTimeEmployee("FE2", "Sara", 7000, LocalDate.of(2025, 6, 15), 1500));
     emp.add(new ContractorEmployee("CE1", "Omar", LocalDate.of(2022, 1, 10), 50, 120));
     emp.add(new ContractorEmployee("CE2", "Rana", LocalDate.of(2023, 9, 5), 40, 100));
       
       Collections.sort(emp);
        System.out.println("مرتبة حسب صافي الراتب ");
        for (Employee e : emp) {
        System.out.println(e);
    }
        
        
        Collections.sort(emp, new SeniorityComparator());

System.out.println("\n=== Sorted by Seniority ===");
for (Employee e : emp) {
    System.out.println(e);
}
        
    double score = 4.5;
        double totalTax = 0;
        double totalBonus = 0;
        for (Employee emps : emp) {
        totalTax += emps.calculateTax();
        totalBonus += emps.calculateBonus(score);
        }
        System.out.println("\nTotal Tax: " + totalTax);
        System.out.println("Total Bonus: " + totalBonus);
        
}
}
