public class Cylinder extends Shape {
    private double radius, height;

     Cylinder(String shapeName) {
         super(shapeName);
        this.radius = 0;
        this.height = 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double area() {
        return 2*Math.PI*radius*(radius+height);
    }

    @Override
    public String toString() {
        return super.toString()+"the radius is: "+this.radius+"and the height is:  "+this.height;
    }
}
