import java.util.Scanner;

//Write a class called Calculator which has the methods to do addition, subtraction,
// multiplication and division. The methods will take generic input variables and will return the
// corresponding type. For example, the sum of two integers should return an integer, and for floats
// it should return a float. Same for division. Adding and subtracting is allowed for String variables as
// well, but the multiplication and division will print an error message.

class Exception extends Throwable
{
    public Exception(String s){
        super("Two strings cannot be divided or multiplied!");
    }

}
class Operations <T> {
    public T addition(T var1, T var2) throws Exception {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            return (T) Integer.valueOf(((Integer) var1).intValue() + ((Integer) var2).intValue());
        }
        else if (var1 instanceof Double && var2 instanceof Double) {
            return (T) Double.valueOf(((Double) var1).doubleValue() + ((Double) var2).doubleValue());
        } else if (var1 instanceof Float && var2 instanceof Float) {
            return (T) Float.valueOf(((Float) var1).floatValue() + ((Float) var2).floatValue());
        } else if (var1 instanceof String && var2 instanceof String) {
            return (T) new String(var1.toString() + var2.toString());
        }
        else
            throw new Exception("Invalid input!");

    }
    public T subtraction (T var1, T var2) throws Exception
    {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            return (T) Integer.valueOf(((Integer) var1).intValue() - ((Integer) var2).intValue());
        }
        else if (var1 instanceof Double && var2 instanceof Double) {
            return (T) Double.valueOf(((Double) var1).doubleValue() - ((Double) var2).doubleValue());
        } else if (var1 instanceof Float && var2 instanceof Float) {
            return (T) Float.valueOf(((Float) var1).floatValue() - ((Float) var2).floatValue());
        } else  if (var1 instanceof String && var2 instanceof String){

            return (T) (String)((String) var1).replace((String)var2, "");
        }
        else
            throw new Exception("Invalid input");
    }
    public T multiplication (T var1, T var2) throws Exception
    {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            return (T) Integer.valueOf(((Integer) var1).intValue() * ((Integer) var2).intValue());
        }
        else if (var1 instanceof Double && var2 instanceof Double) {
            return (T) Double.valueOf(((Double) var1).doubleValue() * ((Double) var2).doubleValue());
        } else if (var1 instanceof Float && var2 instanceof Float) {
            return (T) Float.valueOf(((Float) var1).floatValue() * ((Float) var2).floatValue());
        } else if (var1 instanceof String && var2 instanceof String)
            {
                throw new Exception("Two strings cannot be multiplied!");
            }
        else
            throw new Exception("Invalid input!");

    }
    public T division (T var1, T var2) throws Exception
    {
        if (var1 instanceof Integer && var2 instanceof Integer) {
            return (T) Integer.valueOf(((Integer) var1).intValue() / ((Integer) var2).intValue());
        }
        else if (var1 instanceof Double && var2 instanceof Double) {
            return (T) Double.valueOf(((Double) var1).doubleValue() / ((Double) var2).doubleValue());
        } else if (var1 instanceof Float && var2 instanceof Float) {
            return (T) Float.valueOf(((Float) var1).floatValue() / ((Float) var2).floatValue());
        } else if (var1 instanceof String && var2 instanceof String)
        {
            throw new Exception("Two strings cannot be divided!");

        }
        else
            throw new Exception("Invalid input!");

    }

}

public class HorvathDaiana_lab7pb2{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

       try
       {
           Operations<Integer> obj_int=new Operations<>();
           System.out.println("The sum of the integer nr is: "+obj_int.addition(1, 2));


           Operations<Float> obj_float=new Operations<>();
           System.out.println("The subtraction of the double nr is: "+obj_float.subtraction(3.13F, 4.2F));

           Operations<Double> obj_double=new Operations<>();
           System.out.println("The division of the double nr is: "+obj_double.division(6.28, 3.14));

           Operations<String> obj_string=new Operations<>();
           System.out.println("The sum of strings is: "+obj_string.addition("abc", "def"));
           obj_string.division("ala", "bala");

       }
       catch(Exception e)
       {
           e.getMessage();
           e.printStackTrace();
       }
       finally
       {
           System.out.println("!!!");
       }





    }
}