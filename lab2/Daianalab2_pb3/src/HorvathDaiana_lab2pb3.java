//Write a Java application that reads from the keyboard 2 integer values
// and displays the cmmdc of the values.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter two values for the numbers: ");
       int a=scanner.nextInt();
       int b= scanner.nextInt();
       int cmmdc=findCMMDC(a, b);
       System.out.print("The cmmdc of " + a + " and " + b + " is " + cmmdc);

    }
    public static int findCMMDC(int a, int b)
    {
        if (b == 0) {
            return a;
        }
        return findCMMDC(b, a % b);
    }

}