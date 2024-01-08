import java.util.ArrayList;

import Country.City;
import Country.Country;

/**
 * main
 */
public class main {
    public static void main(String[] args) {
        // Create cities for Country1
        City city1 = new City(1, "Tokyo", 37435191, "JPY");
        City city2 = new City(2, "Osaka", 14977661, "JPY");
        City city3 = new City(3, "Kyoto", 1474579, "JPY");

        // Create an ArrayList of cities for Country1
        ArrayList<City> citiesCountry1 = new ArrayList<>();
        citiesCountry1.add(city1);
        citiesCountry1.add(city2);
        citiesCountry1.add(city3);

        // Create Country1 with its capital
        Country country1 = new Country("JP", "Japan", "Asia", 125360000, 37797500, 5400000, 0, citiesCountry1);

        // Create cities for Country2
        City city4 = new City(4, "Mumbai", 23355000, "INR");
        City city5 = new City(5, "Delhi", 30290936, "INR");
        City city6 = new City(6, "Bangalore", 12535403, "INR");

        // Create an ArrayList of cities for Country2
        ArrayList<City> citiesCountry2 = new ArrayList<>();
        citiesCountry2.add(city4);
        citiesCountry2.add(city5);
        citiesCountry2.add(city6);

        // Create Country2 with its capital
        Country country2 = new Country("IN", "India", "Asia", 1393409038, 328726000, 2970000, 1, citiesCountry2);

        // Create cities for Country3
        City city7 = new City(7, "Beijing", 21516000, "CNY");
        City city8 = new City(8, "Shanghai", 27380373, "CNY");
        City city9 = new City(9, "Guangzhou", 13556876, "CNY");

        // Create an ArrayList of cities for Country3
        ArrayList<City> citiesCountry3 = new ArrayList<>();
        citiesCountry3.add(city7);
        citiesCountry3.add(city8);
        citiesCountry3.add(city9);

        // Create Country3 with its capital
        Country country3 = new Country("CN", "China", "Asia", 1444216107, 112442000, 13600000, 2, citiesCountry3);

        // Create cities for Country4
        City city10 = new City(10, "Sao Paulo", 22043028, "BRL");
        City city11 = new City(11, "Rio de Janeiro", 13528171, "BRL");
        City city12 = new City(12, "Brasilia", 3055149, "BRL");

        // Create an ArrayList of cities for Country4
        ArrayList<City> citiesCountry4 = new ArrayList<>();
        citiesCountry4.add(city10);
        citiesCountry4.add(city11);
        citiesCountry4.add(city12);

        // Create Country4 with its capital
        Country country4 = new Country("BR", "Brazil", "South America", 213993437, 8515767, 1580000, 3, citiesCountry4);

        // Create cities for Country5
        City city13 = new City(13, "Cairo", 20007604, "EGP");
        City city14 = new City(14, "Alexandria", 5163751, "EGP");
        City city15 = new City(15, "Giza", 3266641, "EGP");

        // Create an ArrayList of cities for Country5
        ArrayList<City> citiesCountry5 = new ArrayList<>();
        citiesCountry5.add(city13);
        citiesCountry5.add(city14);
        citiesCountry5.add(city15);

        // Create Country5 with its capital
        Country country5 = new Country("EG", "Egypt", "Africa", 104258327, 1002450, 2640000, 4, citiesCountry5);

        // Create an ArrayList of countries
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);

        // Test the findHighestPopulatedCapital method
        City highestPopulatedCapital = Country.findHighestPopulatedCapital(countries);

        if (highestPopulatedCapital != null) {
            System.out.println("Highest populated capital: " + highestPopulatedCapital.getName());
        } else {
            System.out.println("No capital found");
        }
    }
}
