import java.util.Scanner;

//Starting from the previous problem,
// copy the first 3 characters of the array to another array and
// display the obtained result(use the arraycopy () method from the System class).
public class Daianalab3_pb3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input=scanner.nextLine();
        char[] sir_caract=input.toCharArray();
        char[] sir_copy=new char[3];
        System.arraycopy(sir_caract, 0, sir_copy, 0, 3);
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
        System.out.println("The first three characters of the string are: ");
        for (int i=0; i< 3; i++) {
            System.out.print(sir_copy[i]);
        }
    }


}