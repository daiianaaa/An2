import pack1.Class1;
import pack1.Int1;
import pack1.Int2;

public class Class2 extends Class1 implements Int1, Int2 {
    private double a, b;

    public Class2(double a, double b) {
        super(a, b);
        System.out.println("Constructor clasa 2");
    }

    @Override
    public int sum() {
        return (int) (a + b);
    }

    @Override
    public double product() {
        return a * b;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }
    @Override
    public double getA() {
        return a;
    }
    @Override
    public double getB() {
        return b;
    }
}
