//Write a Java application where you read from the
// keyboard an int value and the factorial of the number read, is displayed.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);//scanner object
        System.out.print("Enter an integer value: ");
        int n=scanner.nextInt();
        scanner.close();
        long factorial=1;
        for (int i=2; i<=n; i++)
        {
            factorial=factorial*i;
        }
        System.out.println(n + "!=" + factorial);
    }
}