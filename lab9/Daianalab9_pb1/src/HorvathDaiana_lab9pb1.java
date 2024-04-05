// Write a Java application which contains a class which implements the Runnable
// interface. The class' constructor sets the name of the instantiated object. Also,
// there is a class variable which counts the number of instantiated objects from that class.
// The run( ) method of the class will print the object's name for a number of times equal to
// the counter's value, each printing being delayed 1000 msec.
//In a distinct class, create multiple threads built from separate objects of the previously
// described class. Analyze the results.
class MyRunnable implements Runnable{
    int count;
    String name;
    MyRunnable(String name){
        this.name=name;
        count++;
    }
    @Override
    public void run() {
        for (int i=0; i<count; i++)
        {
            System.out.println(name);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class HorvathDaiana_lab9pb1 {
    public static void main(String[] args) {

        MyRunnable runnable1=new MyRunnable("ana");
        MyRunnable runnable2=new MyRunnable("are");
        MyRunnable runnable3=new MyRunnable("mere");
        MyRunnable runnable4=new MyRunnable("si");
        MyRunnable runnable5=new MyRunnable("pere");


        Thread thread1= new Thread(runnable1);
        Thread thread2=new Thread(runnable2);
        Thread thread3=new Thread(runnable3);
        Thread thread4=new Thread(runnable4);
        Thread thread5=new Thread(runnable5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}