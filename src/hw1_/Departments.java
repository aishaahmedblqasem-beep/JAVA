
package hw1_;

import java.util.Optional;


public class Departments<T extends Computers> {
    private Optional<T> works = Optional.empty();
    public void work(T w)
    { works = Optional.of(w);}
    public void checkWorks()
    {if (works.isPresent())
    {T c = works.get();
    System.out.println(c.getName() +" --> " + "هل يخدم؟" + (c.getstorage()> 0 ? "نعم" :"لا"));}
    else
    {System.out.println("القسم فارغ");}
    }
}
