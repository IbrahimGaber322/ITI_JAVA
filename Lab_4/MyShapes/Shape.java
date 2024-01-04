package MyShapes;

public abstract class Shape<T extends Number> {
    T x, y, z;

    Shape(T first, T second) {
        x = first;
        y = second;
        z = (T) Double.valueOf(0);
    }

    Shape(T first, T second, T last) {
        x = first;
        y = second;
        z = last;
    }

    abstract void draw();
    abstract double area();
}
