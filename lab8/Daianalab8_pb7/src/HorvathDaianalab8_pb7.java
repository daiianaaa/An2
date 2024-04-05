import java.io.*;
import java.util.Scanner;
//Write a Java application which enables the serialization and deserialization
// of objects that represent arrays of int values. Populate an object with keyboard
// entered data, order the values and store the object in a file. Read the file and display
// the reconstructed array of values.
public class HorvathDaianalab8_pb7 {
    public static void main(String[] args) {
        int[] array = addNumbers();
        System.out.println("\nBefore serialization: ");
        showNumbers(array);

        try (ObjectOutputStream outOS = new ObjectOutputStream(new FileOutputStream("test.dat"))) {
            outOS.writeObject(array);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] arrayAfter = null;
        try (ObjectInputStream inOS = new ObjectInputStream(new FileInputStream("test.dat"))) {
            arrayAfter = (int[]) inOS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nAfter serialization: ");
        showNumbers(arrayAfter);
    }

    public static int[] addNumbers() {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter how many numbers: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void showNumbers(int[] array) {
        for (int test : array) {
            System.out.println("Number: " + test);
        }
    }
}