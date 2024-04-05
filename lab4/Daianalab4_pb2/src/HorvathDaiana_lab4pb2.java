import java.util.Arrays;

// Define a class X that will have the following attributes: a private array of characters,
// a protected String object and an integer without access specifier.
// The class will contain an explicit constructor, which will initialize the attributes,
// accessor and mutator methods for fields that cannot be accessed outside the class and redefine
// the finalize () method inherited from the Object class, which will display an appropriate
// message.
//In the main() method, placed in another class, create an object of X class,
// display the attribute values, and then prepare the object to be removed by garbage collector.
// Then create a new X object, change the attribute values, and display their attribute values.
class X{
    private char[] arr;
    protected String object;
    int i;
   X(int i, String object){
        System.out.println("Constructor!");
        this.i = i;
        this.object = object;
        this.arr = new char[object.length()];
        this.arr = object.toCharArray();
    }
    public char[] getArr(){ //accesor

        return arr;
    }
    public void setArr(char[] arr) //setter
    {
        this.arr=arr;
    }
    public void finalize()
    {
        System.out.println("The finalize method redefined! ");
    }


}
public class HorvathDaiana_lab4pb2 {
    public static void main(String[] args)
    {
        X obj= new X(100,"alabala");


        obj=null;
        System.gc();

        X obj2= new X(111,"lalala");
        obj2.setArr("portocala".toCharArray()); //obiect anonim de tip String

        System.out.println("The integer nr is: "+obj2.i+ " and the array is: " + Arrays.toString(obj2.getArr()));

    }
}