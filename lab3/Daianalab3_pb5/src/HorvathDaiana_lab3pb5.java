//Implement the already known sorting algorithms (bubble sort, insertion sort,
// quick sort, etc.)
// and apply them upon an array of integer variables read from the keyboard.

import java.util.Arrays;
import java.util.Scanner;

public class HorvathDaiana_lab3pb5 {
     static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    static void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n=scanner.nextInt();
    int[] v=new int[n];
    System.out.println("Enter the elements you want to sort: ");
    for (int i=0; i<n; i++)
    {
        v[i]= scanner.nextInt();
    }
    HorvathDaiana_lab3pb5.bubbleSort(v);
    System.out.print("The array sorted using bubble sort is: " );
    System.out.println(Arrays.toString(v));

    HorvathDaiana_lab3pb5.insertionSort(v);
    System.out.print("The array sorted using insertion sort is: ");
    System.out.println(Arrays.toString(v));

    quickSort(v, 0, n-1);
    System.out.print("The array sorted using quick sort is: ");
    printArray(v, n);

    }
}