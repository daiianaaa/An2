//Write an application which checks if 3 random points form an obtuse
//triangle. If the condition is not met, a specific exception is thrown:
//AcuteTriangle, RightTriangle. If the 3 points are on the same line or if the segments
//determined by the 3 points cannot make up a triangle, throw an ImpossibleTriangle exception,
//and within the corresponding catch block print a warning and throw a RuntimeException.

import java.util.Scanner;

class AcuteTriangle extends Exception{
    public AcuteTriangle()
    {
        super("Acute Triangle exception.");
    }
}
class RightTriangle extends Exception {
    public RightTriangle(){
        super("Right triangle exception.");
    }
}
class ImpossibleTriangle extends Exception{
    public ImpossibleTriangle()
    {
        super("Impossible triangle exception.");
    }
}
class Point{
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double calculateDist(Point p1)
    {
        return Math.sqrt((double)(Math.pow((x-p1.x), 2) + Math.pow((y-p1.y), 2)));

    }

}
class Triangle{
    //private double d1, d2, d3;
    private Point p1, p2, p3;
    public Triangle()
    {
        p1=null;
        p2=null;
        p3=null;
    }
    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return this.p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }



    public void checkExc() throws AcuteTriangle, ImpossibleTriangle, RightTriangle {
        double d1= p1.calculateDist(p2);
        System.out.println(d1);
        double d2= p2.calculateDist(p3);
        System.out.println(d2);
        double d3= p1.calculateDist(p3);
        System.out.println(d3);

        if (d1==0 || d2==0 || d3==0)
        {
            throw new ImpossibleTriangle();
        }
        if (Math.pow(d1, 2) + Math.pow(d2, 2) > Math.pow(d3, 2)) {

            throw new AcuteTriangle();

        }
        else if(Math.pow(d1, 2) + Math.pow(d2, 2) == Math.pow(d3, 2))
        {
            throw new RightTriangle();

        }
        else
            System.out.println("The triangle is obtuse");

    }
}
public class HorvathDaiana_lab6pb5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two coordinates for the first point: ");
        Triangle obj=new Triangle();
        Point pct;
        double x1= scanner.nextDouble();
        double y1= scanner.nextDouble();
        pct = new Point(x1,y1);
        System.out.println("The first point is: "+"("+pct.getX()+" , "+pct.getY()+")");
        obj.setP1(pct);
        System.out.println("Enter two coordinates for the second point: ");
        x1= scanner.nextDouble();
        y1= scanner.nextDouble();
        pct = new Point(x1,y1);
        obj.setP2(pct);
        System.out.println("The second point is: "+"("+pct.getX()+" , "+pct.getY()+")");

        System.out.println("Enter two coordinates for the third point: ");
        x1= scanner.nextDouble();
        y1= scanner.nextDouble();
        pct = new Point(x1,y1);
        obj.setP3(pct);
        System.out.println("The third point is: "+"("+pct.getX()+" , "+pct.getY()+")");
        scanner.close();

        try
        {
            obj.checkExc();
        }
        catch(AcuteTriangle | RightTriangle | ImpossibleTriangle e) {
            e.printStackTrace();
        } finally {
            System.out.println("I may or may not have caught an exception");
        }
    }
}