package MyMath;

public class MyCalc<T extends Number> {
    T input1, input2;
    double res;
    double def;

    public MyCalc(T x, T y) {
        input1 = x;
        input2 = y;
        def = -1;
    }

    public double getLastRes() {
        return res;
    }

    public double[] getInputs() {
        double[] response = new double[] { input1.doubleValue(), input2.doubleValue() };
        return response;
    }

    public void addInputs(T first, T second) {
        input1 = first;
        input2 = second;
    }

    public double getRoot() {
        try {
            double root = MyOperations.root(input1, input2.intValue());
            res = root;
            return res;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            res = def;
            return def;
        }
    }

    public double getDiv() {
        try {
            double div = MyOperations.divide(input1, input2);
            res = div;
            return res;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            res = def;
            return def;
        }
    }

    public double getLog() {
        try {
            double log = MyOperations.log(input1, input2);
            res = log;
            return res;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            res = def;
            return def;
        }
    }

}
