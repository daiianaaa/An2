import java.util.Scanner;

//Consider the Fraction class that has two protected attributes a and b for the counter
// and denominator, two set () and get () methods for each of the class attributes.
// Define an explicit constructor without parameters that initiates a with 0 and b with 1,
// and an explicit constructor with two parameters that can be called if it is checked whether
// a fraction can be defined (b! = 0). Define a method simplify () that simplifies and returns a
// Fraction object by calling the int greatestCommonDivider (int, int) method (based on divisions).
// Define a method for adding two Fraction objects, which returns a Fraction object.
// Define a ExtendedFraction class derived from Fraction, which will have a constructor with parameters
// (which calls the constructor from the base class) and which will redefine the method simplify() using
// an int greatestCommonDivider (int, int) algorithm based on subtractions. Add a method for subtracting
// two fractions. Instantiate two Fraction objects without parameters. Set the attributes of the data
// objects read from the keyboard. Display the original attributes of the objects and the new defined
// attributes. Simplify, add and display results. Instantiate two ExtendedFraction objects with data read
// from the keyboard. Simplify, add and subtract objects and display results. Make an upcast from
// ExtendedFraction to Fraction and try to subtract the items. All operations will be called from the
// main() method.
class Fraction{
    protected int a;
    protected int b;
    public Fraction()
    {
        this.a=0;
        this.b=1;
        System.out.println("Constructor fara parametri");
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getB() {
        return b;
    }

    Fraction( int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor cu parametri! ");
    }
    int greatestCommonDivider(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivider(b, a % b);
        }
    }
   public Fraction simplify(){
        Fraction fractie=new Fraction();
        fractie.setA(a);
        fractie.setB(b);
        int g=greatestCommonDivider(a, b);
         a = a / g;
         b = b / g;
        return fractie;

    }
    public Fraction addition(Fraction obj1)
    {
        Fraction fractie=new Fraction();
        fractie.setA(this.getA()*obj1.getB()+obj1.getA()*this.getB());
        fractie.setB(this.getB()*obj1.getB());
        return fractie;
    }

}
class ExtendedFraction extends Fraction{

    public ExtendedFraction() {
    }

    public ExtendedFraction(int a, int b) {
        super(a, b);
    }

    @Override
    int greatestCommonDivider(int a, int b) {

        while(a != b) {


            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    @Override
    public ExtendedFraction simplify() {
        ExtendedFraction fractie=new ExtendedFraction();
        fractie.setA(a);
        fractie.setB(b);
        int g=greatestCommonDivider(a, b);
        a = a / g;
        b = b / g;
        return fractie;
    }
    public ExtendedFraction subtraction(ExtendedFraction obj1)
    {
        ExtendedFraction fract=new ExtendedFraction();
        fract.setA(this.getA()*obj1.getB()-obj1.getA()*this.getB());
        fract.setB(this.getB()*obj1.getB());
        return fract;
    }

}

public class HorvathDaiana_lab5pb4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Fraction obj1=new Fraction();
        System.out.println("The original attributes of the first fraction are: "+obj1.getA()+"/"+obj1.getB());
        System.out.println("Enter two values for nominator and denominator of the first fraction: ");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        obj1.setA(a);
        obj1.setB(b);
        if (a==0)
        {
            System.out.println("The result is 0!");
            System.exit(1);
        }
        else if (b==0)
        {
            System.out.println("The denominator is 0! Not possible!");
            System.exit(1);
        }
        Fraction obj1_simplifa =new Fraction();
        obj1_simplifa.setA(a);
        obj1_simplifa.setB(b);
        obj1_simplifa.simplify();
        Fraction obj1_simplifb =new Fraction();
        obj1_simplifb.setA(a);
        obj1_simplifb.setB(b);
        obj1_simplifb.simplify();

        System.out.println("The first fraction is: "+a+"/"+b);
        System.out.println("The first fraction simplified is: "+ obj1_simplifa.getA()+"/"+ obj1_simplifb.getB());

        Fraction obj2=new Fraction();
        System.out.println("The original values of the second fraction are: "+obj2.getA()+"/"+obj2.getB());
        System.out.println("Enter two values for nominator and denominator of the second fraction: ");
        int c= scanner.nextInt();
        int d= scanner.nextInt();
        obj2.setA(c);
        obj2.setB(d);
        if (c==0)
        {
            System.out.println("The result is 0!");
            System.exit(1);
        }
        else if (d==0)
        {
            System.out.println("The denominator is 0! Not possible!");
            System.exit(1);
        }
        Fraction obj2_simplifa =new Fraction();
        obj2_simplifa.setA(c);
        obj2_simplifa.setB(d);
        obj2_simplifa.simplify();

        Fraction obj2_simplifb =new Fraction();
        obj2_simplifb.setA(c);
        obj2_simplifb.setB(d);
        obj2_simplifb.simplify();

        System.out.println("The second fraction is: "+c+"/"+d);
        System.out.println("The second fraction simplified is: "+ obj2_simplifa.getA()+"/"+ obj2_simplifb.getB());

        Fraction sum= obj1.addition(obj2);
        System.out.println("The sum is: "+sum.getA()+"/"+sum.getB());

       ExtendedFraction obj3=new ExtendedFraction();
        System.out.println("The original attributes of the third fraction are: "+obj3.getA()+"/"+obj3.getB());
        System.out.println("Enter two values for nominator and denominator of the third fraction: ");
        int e= scanner.nextInt();
        int f= scanner.nextInt();
        obj3.setA(e);
        obj3.setB(f);
        if (e==0)
        {
            System.out.println("The result is 0!");
            System.exit(1);
        }
        else if (f==0)
        {
            System.out.println("The denominator is 0! Not possible!");
            System.exit(1);
        }
       ExtendedFraction  obj3_simplifa =new ExtendedFraction();
        obj3_simplifa.setA(e);
        obj3_simplifa.setB(f);
        obj3_simplifa.simplify();
        ExtendedFraction obj3_simplifb =new ExtendedFraction();
        obj3_simplifb.setA(e);
        obj3_simplifb.setB(f);
        obj3_simplifb.simplify();

        System.out.println("The third fraction is: "+e+"/"+f);
        System.out.println("The third fraction simplified is: "+ obj3_simplifa.getA()+"/"+ obj3_simplifb.getB());

        ExtendedFraction obj4=new ExtendedFraction();
        System.out.println("The original values of the fourth fraction are: "+obj4.getA()+"/"+obj4.getB());
        System.out.println("Enter two values for nominator and denominator of the fourth fraction: ");
        int g= scanner.nextInt();
        int h= scanner.nextInt();
        obj4.setA(g);
        obj4.setB(h);
        if (g==0)
        {
            System.out.println("The result is 0!");
            System.exit(1);
        }
        else if (h==0)
        {
            System.out.println("The denominator is 0! Not possible!");
            System.exit(1);
        }
        ExtendedFraction obj4_simplifa =new ExtendedFraction();
        obj4_simplifa.setA(g);
        obj4_simplifa.setB(h);
        obj4_simplifa.simplify();

        ExtendedFraction obj4_simplifb =new ExtendedFraction();
        obj4_simplifb.setA(g);
        obj4_simplifb.setB(h);
        obj4_simplifb.simplify();

        System.out.println("The fourth fraction is: "+g+"/"+h);
        System.out.println("The fourth fraction simplified is: "+ obj4_simplifa.getA()+"/"+ obj4_simplifb.getB());

        ExtendedFraction sub= obj3.subtraction(obj4);
        System.out.println("The difference is: "+sub.getA()+"/"+sub.getB());

        //upcasting

        Fraction obj6=(Fraction)obj3;
        Fraction obj7=(Fraction)obj4;
        System.out.println("The addition of the two upcasted fractions is: "+obj6.addition(obj7).getA()+"/"+obj6.addition(obj7).getB());

    }
}