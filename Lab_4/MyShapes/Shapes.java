package MyShapes;

import java.util.List;

public class Shapes {
    public static <T extends Number> void drawShapes(List<? extends Shape<T>> shapes) {
        for (Shape<T> shape : shapes) {
            shape.draw();
        }
    }

    public static <T extends Number> double[] areaOfShapes(List<? extends Shape<T>> shapes) {
        double[] res = new double[shapes.size()];
        int index = 0;
        for (Shape<T> shape : shapes) {
            res[index++] = shape.area();
        }
        return res;
    }

}
