package MyShapes;

public class Rectangle<T extends Number> extends Shape<T> {

    public Rectangle(T x, T y) {
        super(x, y);
    }

    public Rectangle(T x, T y, T z) {
        super(x, y, z);
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
    @Override
    double area(){
          double res = (y.doubleValue()-x.doubleValue())*(z.doubleValue()-y.doubleValue()); 
          return res;
    }
}
