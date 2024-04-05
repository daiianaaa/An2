import java.util.Scanner;

//Read from the keyboard the elements of a matrix of integer values with m lines
// (m taken from the command line).
// For each line the number of elements will increase by 1 compared to the previous line,
// the first line having only one element.
// Implement the methods that:
// - display the matrix, line by line and column by column;
//  - eliminate from the matrix (turns into 0) the values that are outside the
//  interval defined by 2 specified limits;
//  - display the existent neighbour values of an element identified by its
//  indexes (sent as parameters);
public class HorvathDaiana_lab3pb8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m;
        m=Integer.parseInt(args[0]);
        int[][] matrice = new int[m][m];
        System.out.println("Enter " + (m*(m+1)/2) + " values for the matrix: ");
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<i+1; j++)
            {
                matrice[i][j]= scanner.nextInt();
            }
        }
        displayMatrix(matrice, m);
        System.out.print("Enter two values for the limits: ");
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        elimMatrix(x,y, matrice, m);
        displayMatrix(matrice, m);
        System.out.println("Enter the indexes of the number: ");
        int i1= scanner.nextInt();
        int i2= scanner.nextInt();
        System.out.println("The neighbours of the element are: ");
        neighboursMat(i1, i2, m, matrice);




    }
   private static void displayMatrix(int[][] mat, int m)
    {
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<i+1; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void elimMatrix(int a, int b, int [][] mat, int m)
    {
        if (a>b)
        {
            a=a+b;
            b=a-b;
            a=a-b;
        }
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<i+1; j++)
            {
                if (mat[i][j]<a || mat[i][j]>b)
                {
                    mat[i][j]=0;
                }
            }
        }
    }
    private static void neighboursMat(int i1, int j1, int m, int[][] mat)
    {
        if (m==1)
        {
            System.out.println("There are no neighbours to print!");
            System.exit(1);
        }
        if (i1<0 || j1<0)
        {
            System.out.print("Enter positive values! ");
            System.exit(1);
        }

        for(int i=i1-1; i<=i1+1; i++)
        {
            for (int j=j1-1; j<=j1+1; j++)
            {
                if (i>0 && i<m && j>0 && j<mat[i].length && !(i==i1 && j==j1))
                {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }

}





