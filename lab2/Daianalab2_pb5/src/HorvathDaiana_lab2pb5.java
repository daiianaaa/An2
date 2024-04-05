//Write a Java application where you can read several integers from the keypad
// and check that they are prime numbers.
// The number of read values is taken from the KB or command line.
import java.util.Arrays;
import java.util.Scanner;
public class HorvathDaiana_lab2pb5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n= scanner.nextInt();
        int[] v= new int[n];
        System.out.println("Enter a few numbers to check if they are prime or not: ");
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        //check if the nr is prime
         for (int i = 0; i < n; i++) {
             boolean isPrime = true;
             if (v[i]==0 || v[i]==1)
             {
                 System.out.println("The number " + v[i] +  " is not considered a prime number!");
             }
             else {
                 for (int j = 2; j <= v[i] / 2; j++) {
                     if (v[i] % j == 0) {
                         System.out.println("The " + v[i] + " number is not prime.");
                         isPrime = false;
                         break;
                     }
                 }
                 if (isPrime) {

                     System.out.println("The " + v[i] + " number is prime.");
                 }
             }




         }



    }
}