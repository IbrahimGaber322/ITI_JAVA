package MyMath;

public class MyOperations {
    public static <T extends Number> double log(T x, T b) throws MyException {

        if ( x.doubleValue() <= 0)
            throw new MyException("The Logarithmic target must be greater than 0.");
        if ( b.doubleValue() <= 0)
            throw new MyException("The Logarithmic base must be greater than 0.");
        Double res = Math.log(x.doubleValue()) / Math.log(b.doubleValue());

        return res;
    }

    public static <T extends Number, R extends Number> double divide(T divident, R divisor) throws MyException {
        if ( divisor.doubleValue() == 0)
            throw new MyException("The divisor can't be equal to 0.");
        Double res =  divident.doubleValue() / divisor.doubleValue();

        return res;
    }

    public static <T extends Number> double root(T radicand, int index) throws MyException {
        if ( radicand.doubleValue() <= 0)
            throw new MyException("The radicand must be greater than 0");
        if ( index <= 0)
            throw new MyException("The index must be greater than 0");

        double res = Math.pow(radicand.doubleValue(), 1.0/index);
        return res;
    }
}
