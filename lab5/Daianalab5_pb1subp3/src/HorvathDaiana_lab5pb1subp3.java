import java.util.Scanner;

//Use the structure used at 1’ and implement lambda expressions to define the
// arithmetic operations.
// Check the functionality.
interface Addition{
    double addition(double a, double b);
}
interface Subtraction{
    double subtraction(double a, double b);
}
interface Multiplication{
    double multiplication(double a, double b);
}
interface Division{
    double division(double a, double b);
}
public class HorvathDaiana_lab5pb1subp3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two values: ");
        double a=scanner.nextDouble();
        double b= scanner.nextDouble();
        Addition sum=(double x, double y)->x+y;
        Subtraction sub=(double x, double y)->x-y;
        Multiplication mult=(double x,double y)->x*y;
        Division div=(double x,double y)->x/y;

        System.out.println("The sum of the two numbers is:  "+sum.addition(a, b));
        System.out.println("The subtraction of the two numbers is:  "+sub.subtraction(a, b));
        System.out.println("The multiplication of the two numbers is:  "+mult.multiplication(a, b));
        System.out.println("The division of the two numbers is:  "+div.division(a, b));

    }
}