import java.util.Arrays;
import java.util.Scanner;

//Define a String Array. Using lambda expressions sort it by the following
// criteria: length (small->large), inverse length (large->small),
// alphabetical order, the strings which start with the letter M are first,
// then come the rest.

public class HorvathDaiana_lab5pb5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n= scanner.nextInt();
        String[] strings= new String[n];
        System.out.println("Enter the strings: ");
        for (int i=0; i<n; i++)
        {
            strings[i]=scanner.next();

        }
        System.out.println("The string sorted from small->large: ");
        for (int i=0; i<n; i++)
        {
            Arrays.sort(strings, (str1,str2) -> str1.length() - str2.length());
            System.out.println(strings[i]);
        }
        System.out.println("The string sorted from large->small");
        for (int i=0; i<n; i++)
        {
            Arrays.sort(strings, (str1,str2) -> str2.length() - str1.length());
            System.out.println(strings[i]);
        }
        System.out.println("The string alphabetically ordered is: ");
        for (int i=0; i<n; i++)
        {
            Arrays.sort(strings, (str1,str2) -> str1.compareTo(str2));
            System.out.println(strings[i]);
        }
        System.out.println("The strings which begin with M, and then the rest: ");
        for (int i=0; i<n; i++)
        {
            Arrays.sort(strings, (str1,str2) ->
            {
                if (str1.charAt(0)!= 'M'  &str2.charAt(0)=='M')
                    return str2.compareTo(str1);
                else
                    return str1.compareTo(str2);

            });
            System.out.println(strings[i]);
        }





    }
}