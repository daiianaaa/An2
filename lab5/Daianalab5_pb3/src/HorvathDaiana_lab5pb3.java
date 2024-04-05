//Develop a class hierarchy of shapes and write a program that computes the amount of paint needed
// to paint different objects. The hierarchy will consist of a parent class Shape with three derived
// classes - Sphere, Rectangle, and Cylinder. For the purposes of this exercise, the only attribute a
// shape will have is a name and the method of interest will be one that computes the area of the shape
// (surface area in the case of three-dimensional shapes). Do the following.
//A. Write an abstract class Shape with the following members:
// - an instance variable shapeName of String type
//- an abstract method area()
//- a toString() method that returns the name of the shape
//B. The file Sphere.java contains the Sphere class which is a descendant of Shape.
// A sphere has a radius as a private integer variable and implements the body of the inherited abstract
// method area().
//C. Define similar classes for a rectangle and a cylinder. The classes Rectangle and Cylinder are also
// derived from the Shape class. A rectangle is defined by its length and width. A cylinder is defined by a
// radius and height.
//Note: Each of the derived classes override the toString method and define specific mutator and accessor methods.
//D. The file Paint.java contains an interface that has a float constant paintPerSurfaceUnit.
//E. The file PaintThings.java implements the Paint interface and contains a program that computes the
// amount of paint needed to paint various shapes.
//Instantiate the three shape objects: deck <- Rectangle, bigBall <- Sphere and tank <- Cylinder.
// Make the appropriate method calls to assign each object’s specific attributes with data read from the keyboard.
//Compute the amount of paint needed for covering each created shape.


import java.util.Scanner;

abstract class Shape{
    private String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract double area();

    public String toString() {
        return this.shapeName;
    }
}

public class HorvathDaiana_lab5pb3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Rectangle deck = new Rectangle("rectangle");
        Sphere bigBall=new Sphere("sphere");
        Cylinder tank=new Cylinder("cylinder");
       //implementation for the rectangle
        System.out.println("Enter the values for the length and width of the rectangle: ");
        double l= scanner.nextDouble();
        double w= scanner.nextDouble();
        deck.setLength(l);
        deck.setWidth(w);
        System.out.println("The length of the rectangle is: "+deck.getLength() +" and the width is: "+ deck.getWidth());

        System.out.println("The area of the rectangle is: "+deck.area());
       // PaintThings obj;
        //the constant paint per unit sutface is equal with 2
        System.out.println("The amount of paint needed to paint the deck is: "+ PaintThings.computePaint((float) deck.area()));

        //implementation for the sphere

        System.out.println("Enter the radius of the sphere: ");
        float r= scanner.nextFloat();
        bigBall.setRadius(r);
        System.out.println("The radius of the sphere is: "+bigBall.getRadius());
        System.out.println("The area of the sphere is: "+bigBall.area());
        System.out.println("The amount of paint needed to paint a big ball is: "+PaintThings.computePaint((float)bigBall.area()));

        System.out.println("Enter the radius and height of the cylinder: ");
        double rad= scanner.nextDouble();
        double height= scanner.nextDouble();
        tank.setHeight(height);
        tank.setRadius(rad);
        System.out.println("The radius of the cylinder is: "+tank.getRadius()+" and the height is: "+tank.getHeight());
        System.out.println("The area of the cylinder is: "+tank.area());
        System.out.println("The amount of pain needed to paint a tank is: "+PaintThings.computePaint((float)tank.area()));

    }
}