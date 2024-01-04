package MyShapes;

public class Circle<T extends Number> extends Shape<T> {

    public Circle(T x, T y) {
        super(x, y);
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    double area() {
        double radius = (y.doubleValue() - x.doubleValue());
        double pow = Math.pow(radius, 2);
        double res = pow * 3.14;
        return res;
    }
}