public class Rectangle extends Shape  {
    private double length, width;

     Rectangle(String shapeName) {
        super(shapeName);
        this.length=0;
        this.width=0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    double area() {

         return length*width;
    }

    @Override
    public String toString() {
        return super.toString()+"the length"+this.length+" the width "+this.width;
    }
}
