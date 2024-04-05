import java.util.ArrayList;
import java.util.Scanner;

//Write a class for determining a certain value from Fibonacci’s array. The class has 2 methods,
// one for calculating and the other for displaying the desired value. Use a synchronized multithreading
// mechanism in which one process displays all the Fibonacci numbers smaller than the desired value computed by
// the other process.
 class FibonacciCalc implements Runnable {

    private int value;
    ArrayList<Integer> fib=new ArrayList<>();

    FibonacciCalc(int value) {
        this.value = value;
        fib=new ArrayList<>();
    }

    public synchronized void calc_fib(){
        if (value==0 || value==1)
        {
            return ;
        }

        fib.add(0, 0);
        fib.add(1, 1);
        for (int i=2; i<value+1; i++)
        {
           fib.add(i, (fib.get(i - 1) + fib.get(i - 2)));
        }

    }


    @Override
    public synchronized void run() {
        int result = 0;
        for (int i = 0; result <value ; i++) {
            result=fib.get(i)+ fib.get(i+1);
            System.out.println("The result is: "+result);
            fib.add(result);
        }
    }
}
public class HorvathDaiana_lab9pb3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value that you want to display: ");
        int n = scanner.nextInt();
        FibonacciCalc obj = new FibonacciCalc(n);

        obj.calc_fib();

        Thread thread1 = new Thread(obj);

        thread1.start();

        try {

            thread1.join();

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }



    }
}
