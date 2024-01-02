package MyMath;

@Author("Ibrahim")
public class Quadra {
    double a, b, c;
    @Author("Steven")
    public Quadra(double A, double B, double C) {
        a = A;
        b = B;
        c = C;
    }
    @Author("Ba4mohndsa Menna")
    public  double[] getRoots() {
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
