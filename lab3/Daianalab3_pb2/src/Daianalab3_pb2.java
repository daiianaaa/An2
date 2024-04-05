import java.util.Scanner;

//Read a string from the standard input.
// Turn the string into a character array.
// Look for in this array a character specified in the program.
// Display the number of occurrences.
public class Daianalab3_pb2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input=scanner.nextLine();

        char[] sir_caract=input.toCharArray();

        System.out.println("Enter the character you want to display the nr of occurences: ");
        char character=scanner.next().charAt(0);
        int cnt=0;
        for (char c : sir_caract )
        {
            if (c==character)
            {
                cnt++;
            }
        }
        System.out.println("The number of occurences of " + character + " is "+ cnt);
    }

}