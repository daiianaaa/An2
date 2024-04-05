//Write a Java program that generates 2 random values
// and performs some mathematical operations on them.
import java.util.Random;


public class HorvathDaiana_lab3pb6 {
    public static void main(String[] args) {
       //Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        int upperbound=1000;
        int rand_nr1= random.nextInt(upperbound);
        int rand_nr2=random.nextInt(upperbound);
        System.out.println("The two numbers randomly generated are: " + rand_nr1 +" , " + rand_nr2);
        System.out.println("The sum of the two randomly generated numbers is: " +Math.addExact(rand_nr1, rand_nr2));
        System.out.println("The subtraction of the two randomly generated numbers is: " + Math.subtractExact(rand_nr1, rand_nr2));
        int prod=rand_nr1*rand_nr2;
        System.out.println("The product of the two randomly generated numbers is: " + prod);
        int div=rand_nr1/rand_nr2;
        System.out.println("The division of the two randomly generated numbers is: " + div);
        int mod=rand_nr2%rand_nr1;
        System.out.println("The modulus of the two randomly generated numbers is: " + mod);
        System.out.println("The maximum of the two numbers is: "+Math.max(rand_nr1, rand_nr2));
        System.out.println("The minimum of the two numbers is: "+Math.min(rand_nr1, rand_nr2));
        System.out.println("The absolute value of the first numbers is: "+Math.abs(rand_nr1));
        System.out.println("The absolute value of the second numbers is: "+Math.abs(rand_nr2));
        System.out.println("The floor modulus of the two numbers numbers is: "+Math.floorMod(rand_nr1, rand_nr2));
        System.out.println("The first number incremented is: " +Math.incrementExact(rand_nr1));
        System.out.println("The second number incremented is: " +Math.incrementExact(rand_nr2));
        System.out.println("The first number decremented is: " +Math.decrementExact(rand_nr1));
        System.out.println("The second number decremented is: " +Math.decrementExact(rand_nr2));
        System.out.println("The negation of the first number is: " +Math.negateExact(rand_nr1));
        System.out.println("The negation of the second number is: " +Math.negateExact(rand_nr2));
        System.out.print("Another way of generating random number, between 0 and 1 : "+Math.random());
    }
}