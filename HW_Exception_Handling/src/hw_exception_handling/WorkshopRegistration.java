
package hw_exception_handling;

//           تسجيل في ورشة العمل
public class WorkshopRegistration {
   public void registerParticipant(String name, int age) throws InvalidAgeException {
   if (age < 18) {//الشرط لازم يكون فوق 18 سنة
   throw new InvalidAgeException("تم رفض لان العمر لا يسمح " + name + " يجب ان يكون في سن القانونية " + age);}
        System.out.println("تم التسجيل في الورشة"+"   "+"\n (●'◡'●)");
    } 
}
