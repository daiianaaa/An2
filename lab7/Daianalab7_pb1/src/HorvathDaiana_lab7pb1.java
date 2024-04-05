//Create an interface called Generator<T> with a single method next(T var).
// Implement the interface so that you can generate the following values when applying it to certain
// data types (Integer, Character, etc.). The class will be instantiated in the main( ) method,
// located in a separate class.
interface Generator<T>
{
    public T next(T var);
}
class IntegerGen implements Generator<Integer>{
    @Override
    public  Integer next( Integer var)
    {
        return var+1;
    }
}
class CharacterGen implements Generator<Character>
{
    @Override
    public Character next(Character var)
    {
        return (char)(var+1);
    }
}
class DoubleGen implements Generator <Double>
{
    @Override
    public Double next(Double var)
        {
            return (double)var+0.1;
        }
}

public class HorvathDaiana_lab7pb1 {
    public static void main(String[] args) {
        Generator<Integer> IntegerGen=new IntegerGen();
        System.out.println("The first generated nr: "+IntegerGen.next(0));

        Generator<Character> CharacterGen= new CharacterGen();
        System.out.println("The generated character is: "+CharacterGen.next('a'));

        Generator<Double>DoubleGen =new DoubleGen();
        System.out.println("The generated double number is: "+DoubleGen.next(1.71));
    }
}