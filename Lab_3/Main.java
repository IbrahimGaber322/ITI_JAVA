
import MyMath.Quadra;
import MyMath.Quadratic;
import MyMath.Author;
import Temperature.Temperature;

public class Main {
    public static void main(String[] args) {
        Quadra eq = new Quadra(1, -7, 12);
        double[] roots = eq.getRoots();
        if (roots.length > 1) {
            System.out.println("First root = " + roots[0] + ", Second root = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root = " + roots[0]);
        } else {
            System.out.println("Complex number");
        }
        
          Quadratic eq2 = new Quadratic(1, -7, 12);
        double[] roots2 = eq2.apply(null);
        if (roots2.length > 1) {
            System.out.println("First root = " + roots2[0] + ", Second root = " + roots2[1]);
        } else if (roots2.length == 1) {
            System.out.println("Root = " + roots2[0]);
        } else {
            System.out.println("Complex number");
        }
        
       
       double f = Temperature.CToF(20); 
       System.out.println("Fahrenheit temp = "+ f);
       double c = Temperature.FToC(f);
       System.out.println("Celsius temp = "+ c);



       Author classAuthorAnnotation = Quadra.class.getAnnotation(Author.class);
       if (classAuthorAnnotation != null) {
           System.out.println("Class Author: " + classAuthorAnnotation.value());
       } else {
           System.out.println("Class Author annotation not found.");
       }
    }
}
