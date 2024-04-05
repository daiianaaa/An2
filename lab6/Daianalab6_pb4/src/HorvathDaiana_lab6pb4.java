// Write a Java class derived from the Exception class,
// called SuperException. Another class, called SmallerException is derived from
// SuperException. Within the classes' constructors print a message which indicates
// which exception was generated. In a third class create a method a() which throws an
// exception of type SmallerException, and a method b() which throws a SuperException.
// In the main() method call these two methods and try to determine the type of exception
// which occurs, as well as if the corresponding catch block for the SmallerException can
// catch a SuperException.
class SuperException extends Exception{

    SuperException(){
        super();
        System.out.println("SuperException exception!");
    }
}
class SmallerException extends SuperException{
        SmallerException()
        {
            super();
            System.out.println("SmallerException exception");
        }
}
class Throw{
    void a()
    {
        try
        {
        throw new SmallerException();
        }
        catch(SmallerException e)
        {
           e.printStackTrace();
        }
    }
    void b()
    {
        try
        {
            throw new SuperException();
        }
        catch(SuperException e)
        {
            e.printStackTrace();
        }
    }

}
public class HorvathDaiana_lab6pb4
{
    public static void main(String[] args) {

       Throw obj=new Throw();
       obj.a();
       obj.b();
    }
}