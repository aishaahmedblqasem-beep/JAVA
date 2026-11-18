package hw_interface;

//خاضع للضريبة          
public interface Taxable {
           //معدل الضريبة
     double TAX_RATE = 0.15;
           //حساب الضريبة
    double calculateTax();
}
