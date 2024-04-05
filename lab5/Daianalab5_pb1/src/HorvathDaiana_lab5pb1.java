//Consider a Java interface that contains the prototypes of the methods
// of addition, subtraction, multiplication, division, square root and raising
// a number to a certain power. All methods will have two double type parameters
// and specify the returned double type.
//Implement the interface so that operations are defined within a class. Instantiate the
// class and check the implemented operations.
import java.lang.*;
import java.util.Scanner;

interface Operations{
     double addition(double a, double b);
     double subtraction(double a, double b);
     double multiplication(double a, double b);
     double division(double a, double b);
      double SqrRootA(double a);
    double SqrRootB(double b);
     double pow(double a, double e);
}
 class implementOperations implements Operations
{
    @Override
    public double addition (double a, double b)
    {
        return a+b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }
@Override
    public double multiplication(double a, double b)
    {
    return a*b;
      }

    public double subtraction(double a, double b)
    {
        return a-b;
    }

    @Override
    public double SqrRootA(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double SqrRootB(double b) {
        return Math.sqrt(b);
    }

    @Override
    public double pow(double a, double e) {
        return Math.pow(a, e);
    }
}

 class HorvathDaiana_lab5pb1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two double numbers: ");
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        implementOperations ob1=new implementOperations();
        System.out.println("The sum of the two numbers is: "+ob1.addition(a, b));
        System.out.println("The subtraction of the two numbers is: "+ob1.subtraction(a, b));
        System.out.println("The multiplication of the two numbers is: "+ob1.multiplication(a, b));
        System.out.println("The division of the two numbers is: "+ob1.division(a, b));
        System.out.println("The square root  of the first number is: "+ob1.SqrRootA(a));
        System.out.println("The  square root of the second number is: "+ob1.SqrRootB(b));
        System.out.println("Enter the power of the number: ");
        int e= scanner.nextInt();
        System.out.println("The number "+a+" raised at the power "+e+" is " +ob1.pow(a, e));
        System.out.println("The number "+b+" raised at the power "+e+" is " +ob1.pow(b, e));

    }
}