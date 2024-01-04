package MyMath;

public class MyComplex {
    private double real;
    private double imaginary;

    public MyComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public MyComplex addComplex(MyComplex a, MyComplex b) {
        return addMyComplex(a, b);
    }

    public MyComplex subtractComplex(MyComplex a, MyComplex b) {
        return subtractMyComplex(a, b);
    }

    public MyComplex multiplyComplex(MyComplex a, MyComplex b) {
        return multiplyMyComplex(a, b);
    }

    public MyComplex divideComplex(MyComplex a, MyComplex b) {
        return divideMyComplex(a, b);
    }

    private MyComplex addMyComplex(MyComplex a, MyComplex b) {
        double realPart = a.getReal() + b.getReal();
        double imaginaryPart = a.getImaginary() + b.getImaginary();
        return new MyComplex(realPart, imaginaryPart);
    }

    private MyComplex subtractMyComplex(MyComplex a, MyComplex b) {
        double realPart = a.getReal() - b.getReal();
        double imaginaryPart = a.getImaginary() - b.getImaginary();
        return new MyComplex(realPart, imaginaryPart);
    }

    private MyComplex multiplyMyComplex(MyComplex a, MyComplex b) {
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryPart = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new MyComplex(realPart, imaginaryPart);
    }

    private MyComplex divideMyComplex(MyComplex a, MyComplex b) {
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;
        return new MyComplex(realPart, imaginaryPart);
    }
}
