
package hw_exception_handling;

public class InvalidAgeException extends Exception{
//   استثناء العمر غير الصالح //  الرسالة اللي نبيها تطلعلي
    public InvalidAgeException(String message) {
        super(message);
    }
    
}
