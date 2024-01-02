package MyMath;

import java.util.function.Function;

@Author("Ibrahim")
public class Quadratic implements Function<Void,double[]> {
    double a, b, c;
    @Author("Steven")
    public Quadratic(double A, double B, double C) {
        a = A;
        b = B;
        c = C;
    }
    @Author("Ba4mohndsa Menna")
    @Override
    public  double[] apply(Void input) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double[] res = {root1,root2};
           return res;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
             double[] res = {root};
           return res;
        } else {
            double[] res = {};
            return res;
        }
    }
}
