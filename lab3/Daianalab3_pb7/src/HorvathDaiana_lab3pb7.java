//Read from the keyboard an integer value bigger than 16.777.216.
// Use bit masks for isolating each of the 4 bytes of the read value.
// Display the initial and the isolated values as decimal, binary and hexadecimal strings.

import java.util.Scanner;

public class HorvathDaiana_lab3pb7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a value bigger than 16777216: ");
        int nr= scanner.nextInt();
        if (nr<16777216)
        {
            System.out.println("The value you entered is wrong! Try again!");
            System.exit(1);
        }
        System.out.println("The initial number in decimal is: " + nr);
        System.out.println("The initial number in binary is: " + Integer.toBinaryString(nr));
        System.out.println("The initial number in hexa is: " + Integer.toHexString(nr));

        int a= (nr>>24) & 0xff;
        int b= (nr>>16) & 0xff;
        int c= (nr>>8) & 0xff;
        int d= nr & 0xff;
        System.out.println("The isolated values are: "+a+ " , " +b+ ", "+c+" , "+d);
        System.out.println("The isolated values in binary are: "+Integer.toBinaryString(a) +" , " + Integer.toBinaryString(b)+ " ," + Integer.toBinaryString(c)+ " , "+Integer.toBinaryString(d));
        System.out.println("The isolated values in hexa are: "+Integer.toHexString(a) +" , " + Integer.toHexString(b)+ " ," + Integer.toHexString(c)+ " , "+Integer.toHexString(d));
    }
}