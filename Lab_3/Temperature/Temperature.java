package Temperature;

import java.util.function.Function;

public class Temperature {

    public static double CToF(double celsius) {

        Function<Double, Double> celsiusToFahrenheit = Temperature::convertCelsiusToFahrenheit;
        double fahrenheit = celsiusToFahrenheit.apply(celsius);

       return fahrenheit;
    }

    public static double FToC(double fahrenheit) {

        Function<Double, Double> fahrenheitToCelsius = Temperature::convertFahrenheitToCelsius;
        double celsius = fahrenheitToCelsius.apply(fahrenheit);

        return celsius;
    }

    // Function to convert Celsius to Fahrenheit
    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
