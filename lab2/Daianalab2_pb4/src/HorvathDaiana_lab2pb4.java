//Write a Java application where you read from the keyboard an integer
// and display all the dividers of the number you read.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int a = scanner.nextInt();
        System.out.println("The divisors of " + a + " are: " );
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print( i + " ");
            }
        }

    }

}