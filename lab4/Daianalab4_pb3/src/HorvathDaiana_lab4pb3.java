
//Write a Java class that models a matrix of integer values.
// The dimensions and the array of elements are private attributes and are controlled
// using appropriate setter-getter methods. Write the methods for displaying the matrix,
// for determining and returning the number of 9 adjacent elements cells that don’t differ
// with more than 5% from a threshold value.
class Matrix{
    private int rows;
    private int cols;
    private int[][] elements;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.elements = new int[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void setElement(int row, int col, int value) {
        elements[row][col] = value;
    }

    public int getElement(int row, int col) {
        return elements[row][col];
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int countAdjacentCells(int threshold) {
        int count = 0;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                double average = (elements[i][j] + elements[i][j + 1] + elements[i + 1][j] + elements[i + 1][j + 1]) / 4.0;
                if (Math.abs(average - threshold) <= threshold * 0.05) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class HorvathDaiana_lab4pb3 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        matrix.setElement(0, 0, 10);
        matrix.setElement(0, 1, 12);
        matrix.setElement(0, 2, 9);
        matrix.setElement(1, 0, 8);
        matrix.setElement(1, 1, 11);
        matrix.setElement(1, 2, 10);
        matrix.setElement(2, 0, 9);
        matrix.setElement(2, 1, 9);
        matrix.setElement(2, 2, 12);
        System.out.println("The matrix is: ");
        matrix.displayMatrix();

        int count = matrix.countAdjacentCells(10);
        System.out.println("Number of adjacent cells that don't differ from 10 by more than 5%: " + count);
    }

    }
