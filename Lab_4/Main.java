import java.util.ArrayList;
import java.util.List;

import MyMath.MyCalc;
import MyMath.MyComplex;
import MyShapes.Circle;
import MyShapes.Joker;
import MyShapes.Rectangle;
import MyShapes.Shapes;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // MyCalc testing
        MyCalc<Integer> calc = new MyCalc<Integer>(4, 2);

        double log = calc.getLog();
        double div = calc.getDiv();
        double root = calc.getRoot();

        System.out.println("log 4 base 2 = " + log);
        System.out.println("4 divided 2 = " + div);
        System.out.println("2nd root of 4 = " + root);

        // MyShapes test

        List<Rectangle<Integer>> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle<Integer>(0, 5, 10));
        rectangles.add(new Rectangle<Integer>(4, 12, 18));

        List<Circle<Double>> circles = new ArrayList<>();
        circles.add(new Circle<Double>(3.2, 12.9));
        circles.add(new Circle<Double>(20.4, 30.6));

        // Testing the drawShapes method
        System.out.println("Drawing Rectangles:");
        Shapes.drawShapes(rectangles);

        System.out.println("\nDrawing Circles:");
        Shapes.drawShapes(circles);

        // Testing areas method
        double[] rectanglesAreas = Shapes.areaOfShapes(rectangles);
        double[] circlesAreas = Shapes.areaOfShapes(circles);

        System.out.println("Rectangles areas = ");
        for (double rect : rectanglesAreas) {
            System.out.println(rect);
        }
        System.out.println("Circles areas = ");
        for (double circ : circlesAreas) {
            System.out.println(circ);
        }

        // Creating complex numbers
        MyComplex complex1 = new MyComplex(3, 4);
        MyComplex complex2 = new MyComplex(1, 2);

        // Testing addition
        MyComplex resultAdd = complex1.addComplex(complex1, complex2);
        System.out.println("Addition Result: " + resultAdd.getReal() + " + " + resultAdd.getImaginary() + "i");

        // Testing subtraction
        MyComplex resultSubtract = complex1.subtractComplex(complex1, complex2);
        System.out.println(
                "Subtraction Result: " + resultSubtract.getReal() + " + " + resultSubtract.getImaginary() + "i");

        // Testing multiplication
        MyComplex resultMultiply = complex1.multiplyComplex(complex1, complex2);
        System.out.println(
                "Multiplication Result: " + resultMultiply.getReal() + " + " + resultMultiply.getImaginary() + "i");

        // Testing division
        MyComplex resultDivide = complex1.divideComplex(complex1, complex2);
        System.out.println("Division Result: " + resultDivide.getReal() + " + " + resultDivide.getImaginary() + "i");

        // Finally lambda functions:

        Joker draw = () -> Shapes.drawShapes(rectangles);
        ;

        System.out.println("Drawing rectangles again: ");

        draw.joker();
    }
}