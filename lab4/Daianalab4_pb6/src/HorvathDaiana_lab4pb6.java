import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Define a one-dimensional array of char type, less than a value n introduced
// from the keyboard. Each value contains some randomly generated alpha-numerical
// characters. Generate a String object using the array. Display the initial content
// of the array and after that, process all the elements so that all numbers will be
// replaced with ‘*’. Display the result.
public class HorvathDaiana_lab4pb6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the char array: ");
        int n = scanner.nextInt();
        char[] AlphaNumericString   ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();



        // create the char array with random alpha-numerical characters
        char[] charArray = new char[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            charArray[i]=AlphaNumericString[rand.nextInt(AlphaNumericString.length)];
                }

                // convert the char array to a String object
        String str = new String(charArray);

                // display the initial content of the char array and the String object
         System.out.println("Initial content of the char array: " + Arrays.toString(charArray));
        System.out.println("String object: " + str);

                // replace all numbers with '*'
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(charArray[i])) {
                    charArray[i] = '*';
            }
        }

        // display the result after replacing numbers with '*'
        System.out.println("Result after replacing numbers with '*': " + Arrays.toString(charArray));

        }

    }
