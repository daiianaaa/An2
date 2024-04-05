//Build a Java application that tests the new methods of the String class, introduced in Java11.
public class HorvathDaiana_lab4pb5 {
    public static void main(String[] args) {

        System.out.println("\n".isBlank());
        System.out.println("alabala".isBlank());

        System.out.println("ana are mere".lines().count());
        System.out.println("ana \n are mere".lines().count());
        System.out.println("ana  \n are \n  mere".lines().count());

        System.out.println("1234 \n".repeat(2));

        System.out.println("  AAA  ");
        System.out.println("  AAA  ".strip());

        System.out.println("  bbbbb  ".stripLeading());

        System.out.println("  1234  ");
        System.out.println(" 1234  ".stripTrailing());

    }
}