//Write a Java app which uses the synchronized method access for mutual exclusion.
// Create 3 separate threads which simultaneously call methods to increment and decrement
// a separate class' class variable. Check if the results are what you expect them to be.
// Remove the synchronized blocks and reevaluate the results.

import java.util.Scanner;

class ImplementCalc {

    int a;

    ImplementCalc(int a) {
        this.a = a;
    }

    public synchronized void increment() {
        System.out.println("Yhe value incremented is: "+a++);
    }

    public synchronized void decrement() {
        System.out.println("The value decremented is: "+a--);
    }

}
class ImplementIncrement implements Runnable{

    ImplementCalc obj;

    public ImplementIncrement(ImplementCalc obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.increment();
    }
}
class ImplementDecrement implements Runnable{

    ImplementCalc obj;

    public ImplementDecrement(ImplementCalc obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.decrement();
    }
}



public class HorvathDaiana_lab9pb4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value that you want to increment and decrement: ");
        int nr= scanner.nextInt();

        ImplementCalc obj=new ImplementCalc(nr);

        ImplementIncrement obj2=new ImplementIncrement(obj);

        ImplementDecrement obj3=new ImplementDecrement(obj);

        ImplementIncrement obj4=new ImplementIncrement(obj);
        Thread thread1=new Thread(obj2);
        Thread thread2=new Thread(obj3);
        Thread thread3=new Thread(obj4);

        thread1.start();
        thread2.start();
        thread3.start();
        try
        {
            thread1.join();
            thread2.join();
            thread3.join();

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("All threads finished their work! ");

    }
}