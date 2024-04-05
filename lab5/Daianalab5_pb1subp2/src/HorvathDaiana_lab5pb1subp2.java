import java.util.Scanner;

// Instead of an interface that contains all the aforementioned methods,
// implement 4 functional interfaces, one for each method.
//The interfaces will be implemented within a single class.
// Instantiate the class and check the implemented operations.
interface Addition{
    double addition(double a, double b);
}
interface Substraction{
    double subtraction(double a, double b);
}
interface Multiplication{
    double multiplication(double a, double b);
}
interface Division{
    double division(double a, double b);
}
class ImplementOperations implements Addition, Substraction, Multiplication, Division{

    @Override
    public double addition(double a, double b) {
        return a+b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }
}
public class HorvathDaiana_lab5pb1subp2 {
    public static void main(String[] args) {

       ImplementOperations ob1= new ImplementOperations();
       Scanner scanner= new Scanner(System.in);
       System.out.println("Enter two values: ");
       double a=scanner.nextDouble();
       double b= scanner.nextDouble();
       System.out.println("The sum of the two numbers is: "+ob1.addition(a, b));
       System.out.println("The subtraction of the two numbers is: "+ob1.subtraction(a, b));
       System.out.println("The multiplication of the two numbers is: "+ob1.multiplication(a, b));
       System.out.println("The division of the two numbers is: "+ob1.division(a, b));

    }
}