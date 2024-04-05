import java.util.Scanner;

//Define an interface called GeometricForm that contains methods which return the area
// and perimeter of the geometric form. Implement the interface for: squares, rectangles, circles,
// equilateral triangles and isosceles triangles. Read from the keyboard N distinct geometric forms
// specified by their type and specific parameters (for example for a circle, you would need to read
// its radius). Compute the total area and perimeter of all the geometric forms, taking into account
// the fact that they do not overlap.
interface GeometricForm{
   double area();
   double perimeter();
}
class Square implements GeometricForm{

    private double l;
    Square(double l)
    {

        this.l = l;
    }
    @Override
    public double area() {
        return l*l ;
    }
    @Override
    public double perimeter() {
        return 4*l;
    }
}
class Rectangle implements GeometricForm{

    private double lung, lat;

    Rectangle(double lung, double lat)
    {
        this.lat=lat;
        this.lung=lung;
    }

    @Override
    public double area() {
        return lat*lung;
    }

    @Override
    public double perimeter() {
        return 2*lat+2*lung;
    }
}
class Circle implements GeometricForm{
   private double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }
}
class EquilatTriangle implements GeometricForm{
      private double l;

    EquilatTriangle(double l) {
        this.l = l;
    }

    @Override
    public double area() {
        return l*l*Math.sqrt(3)/4 ;
    }

    @Override
    public double perimeter() {
        return 3*l;
    }
}
class IsoscTriangle implements GeometricForm{
   private double l, b, h;

    IsoscTriangle(double b, double l) {
        this.b = b;
        this.l = l;
    }
    private double height()
    {

        h=Math.sqrt(l*l+b*b/4);
        return h;
    }

    @Override
    public double area() {
        return b*height()/2;
    }

    @Override
    public double perimeter() {
        return 2*l+b;
    }
}

public class HorvathDaiana_lab5pb2 {

    public static boolean checkForm(Scanner scanner, int in){

       if (in==1) {
            System.out.println("Enter the side of the square: ");
            double l= scanner.nextDouble();
            Square obj=new Square(l);
            System.out.println("The area of the square is: "+obj.area()+" and the perimeter of the square is: "+ " " +obj.perimeter());
            return true;
       }
        if (in==2) {
            System.out.println("Enter the sides of the rectangle: ");
            double lung= scanner.nextDouble();
            double lat= scanner.nextDouble();
            Rectangle obj=new Rectangle(lung, lat);
            System.out.println("The area of the rectangle is: "+obj.area()+" and the perimeter of the rectangle is: "+ " " +obj.perimeter());
            return true;
        }
        if (in==3) {
            System.out.println("Enter the radius of the circle: ");
            double r = scanner.nextDouble();
            Circle obj = new Circle(r);
            System.out.println("The area of the circle is: "+obj.area()+" and the perimeter of the circle is: "+ " " +obj.perimeter());
            return true;
        }
        if (in==4) {
            System.out.println("Enter the sides of the equilateral triangle: ");
            double l= scanner.nextDouble();
            EquilatTriangle obj=new EquilatTriangle(l);
            System.out.println("The area of the equilateral triangle is: "+obj.area()+" and the perimeter of it is: "+ " " +obj.perimeter());
            return true;
        }
        if (in==5) {
            System.out.println("Enter the 2 sides and the base of the isosceles triangle: ");
            double l= scanner.nextDouble();
            double b= scanner.nextDouble();
            IsoscTriangle obj=new IsoscTriangle(b, l);
            System.out.println("The area of the isosceles triangle is: "+obj.area()+" and the perimeter of it is: "+ " " +obj.perimeter());
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the number of figures: ");
       int n= scanner.nextInt();
        for (int i=0; i<n; i++)
        {
            System.out.println("Enter the figure: 1-Square| 2-Rectangle | 3-Circle | 4-Equilateral triangle| 5-Isosceles triangle ");
            int d= scanner.nextInt();
            if (!checkForm(scanner, d))
            {
                System.out.println("The input is wrong! You should enter either 1,2,3,4,5! Enter again: ");
                i--;
            }



        }


    }
}