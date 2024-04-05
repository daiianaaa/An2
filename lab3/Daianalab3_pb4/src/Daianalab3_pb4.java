import java.util.Scanner;

//Write a Java application which defines an integer value and displays it as a binary,
// octal and hexadecimal string.
// Write various bases convertion methods.
public class Daianalab3_pb4 {
    public static String base_conv(String nr, int source, int destination)
    {
        return Integer.toString(Integer.parseInt(nr, source), destination);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int x = scanner.nextInt();
        Integer integer1 = x;
        System.out.println("The number converted in hex is " + Integer.toHexString(x));
        System.out.println("The number converted in binary is " + Integer.toBinaryString(x));
        System.out.println("The number converted in octal is " + Integer.toOctalString(x));

        String nr="234";
        System.out.println("The number 234 converted from octal to binary is: " + base_conv(nr, 8, 2));
        System.out.println("The number 234 converted from octal to decimal is: " + base_conv(nr, 8, 10));
        System.out.println("The number 234 converted from octal to hexa is: " + base_conv(nr, 8, 16));
    }
}