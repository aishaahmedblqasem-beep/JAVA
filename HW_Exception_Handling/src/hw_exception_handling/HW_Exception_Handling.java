
package hw_exception_handling;

import java.util.Scanner;

public class HW_Exception_Handling {

   
    public static void main(String[] args) {
        WorkshopRegistration R = new WorkshopRegistration();
        Scanner s = new Scanner(System.in);
        
        try
        {        
         System.out.println("الرجاء ادخال الاسم : "); 
         String name = s.nextLine();
         System.out.println("الرجاء ادخال العمر : "); 
         int age = s.nextInt();
         R.registerParticipant(name,age);
        } 
        
        catch (InvalidAgeException e) {
        System.out.println("Caught Exception: " + e.getMessage());
        }
    finally
        {
            System.out.println("شكرا لتسجيلكم في ورشتنا "+"  "+"\n☆*: .｡. o(≧▽≦)o .｡.:*☆");
            s.close();
        }
    }

}
