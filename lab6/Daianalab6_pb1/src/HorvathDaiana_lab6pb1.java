// Write a Java program that defines an array of double values and read the appropriate data
// from the keyboard. Handle the exception produced when the code tries to acces an element that has
// a negative index or an index greater than the maximum number of elements (ArrayIndexOutOfBoundsException).
// Display a significant message when the exception occurs.
//Consider a matrix with a fixed number of elements for each line and protect the code against the exception
// mentioned above. Consider also the case if each line has a different number of elements.

import java.util.Scanner;
class Vect {
    public void vector_work(int n, Scanner scanner) throws NumberFormatException, ArrayIndexOutOfBoundsException {

        double values[] = new double[n];
        System.out.println("Enter " + n + " double values: ");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextDouble();
        }
        System.out.println("Enter the index you want to access: ");
        int a = scanner.nextInt();
        System.out.println("The element you want to access is: " + values[a]);

    }
}
  class Matrix{
    public void matrix_work (int r, int c, Scanner scanner) throws NumberFormatException, ArrayIndexOutOfBoundsException{

        double[][] mat=new double[r][c];
        System.out.println("Enter the values for the rows and columns: ");
        for (int i=0; i<r; i++)
        {
            for (int j=0; j<c; j++)
            {
                mat[i][j]= scanner.nextDouble();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Enter the element you want to access: ");
        int r_1= scanner.nextInt();
        int c_1= scanner.nextInt();
        System.out.println("The element you accessed is: "+mat[r_1][c_1]);

    }
  }
public class HorvathDaiana_lab6pb1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements of the vector: ");
        int n= scanner.nextInt();
         Vect obj=new Vect();
        try{
          obj.vector_work(n, scanner);
        }
        catch(NumberFormatException e){
            System.out.println("The number has the wrong format!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The index is negative or greater than the number of elements! ");
        }
        finally
        {
            System.out.println("The program will run anyways.");
        }
        Matrix mat=new Matrix();
        System.out.println("Enter the number of rows and columns: ");
        int r= scanner.nextInt();
        int c= scanner.nextInt();
        try{
            mat.matrix_work(r, c, scanner);
        }
        catch(NumberFormatException e)
        {
            System.out.println("The number format is wrong! ");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The index is negative or greater than the nr of elements!");
        }
        finally
        {
            System.out.println("The program continues! ");
        }

    }
}