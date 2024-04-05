import java.util.Random;
import java.util.Scanner;
//Write a class named Methods having 3 methods:
// a method with a variable number of integer parameters, which returns the arithmetic mean
// of the parameters; another method in which will be defined a one-dimensional
// array of n double-type numbers (n being the parameter of the method and which will be
// read in main () from the keyboard), its elements will receive randomly generated values and
// the method will return this array; a static method that receives as a parameter a character
// array, converts the respective characters into uppercase letters and forms a String object
// from this array, which will be returned by the function. From the main () method, defined in
// another class, call the methods of the Methods class and display the results on the screen
// (the call values for the first method and the character string for the 3rd method will be 
// defined in main ()).
class Methods
{
    void m1(int... sir)
    {
        int sum=0;
        double arit_sum=0;
        for (int j : sir) {
            sum +=j ;
            arit_sum=(double)sum/j;
        }
        System.out.println("The aritmetic mean of the numbers is: "+arit_sum);
    }
    void m2(int n)
    {
        double[]sir=new double[n];
        Random random=new Random();
        System.out.print("The randomly generated numbers are: ");
        for (int i=0; i<n; i++)
        {
            sir[i]= random.nextDouble();
            System.out.println(sir[i]+" ");
        }
    }
    static void m3(String array)
    {
            System.out.println("The string converted in upper case only is: "+array.toUpperCase());
    }


}
public class HorvathDaiana_lab4pb1 {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    int[] sir=new int[50];
    Methods ob1=new Methods();
    ob1.m1(1, 2 ,3 ,4);
    System.out.print("Enter the number of randomly generated numbers:  ");
    int n=scanner.nextInt();
    ob1.m2(n);

    System.out.print("Enter a few characters: ");
    String str=scanner.next();
    Methods.m3(str);





    }
}
