public class Sphere extends Shape {
    private float radius;

     Sphere(String shapeName) {
        super(shapeName);
        this.radius=0;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    double area() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return super.toString()+"the radius: "+this.radius;
    }
}
