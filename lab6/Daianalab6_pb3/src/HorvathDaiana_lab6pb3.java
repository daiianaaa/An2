// Define a package that declares an interface named Int1
// (2 integer variables and a sum() method that returns the sum of 2 integer values).
// Include in the same package a class named Class1 (2 protected double variables, constructor,
// setters and getters). In another source file, add in the same package a new interface
// named Int2 (2 double variables and a method named product() that returns the product
// of 2 double values).
//Implement a distinct source file and import everything from the defined package.
// Define a class named Class2 that is derived from Class1 and implements both interfaces
// Int1 and Int2.
//Instantiate Class2 and call the defined methods for determining the sum and product of some
// values read from the keyboard.

import pack1.Int1;
import pack1.Int2;
import pack1.Class1;

import java.util.Scanner;

public class HorvathDaiana_lab6pb3 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        Class2 obj=new Class2(a, b);
        obj.setA(a);
        obj.setB(b);
        System.out.println("The number a is: "+obj.getA());
        System.out.println("The number b is: "+obj.getB());
        System.out.println("The sum of the two numbers is: "+obj.sum());
        System.out.println("The product of the two numbers is: "+obj.product());


    }
}