import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.opencsv.*;
import Country.City;
import Country.Country;

/**
 * main
 */
public class main {

    public static void main(String[] args) {

        ArrayList<City> cities = Csv.readCities("./Cities.csv");

        Map<String, List<City>> citiesMap = cities.stream()
                .collect(Collectors.groupingBy(City::getCountryCode));

        ArrayList<Country> countries = Csv.readCountries("./Countries.csv", citiesMap);

        // Test the findHighestPopulatedCapital method
        City highestPopulatedCapital = Country.findHighestPopulatedCapital(countries);

        if (highestPopulatedCapital != null) {
            System.out.println("Highest populated capital: " + highestPopulatedCapital.getName());
        } else {
            System.out.println("No capital found");
        }

        // Test maxPopulation City
        City maxPopulationCity = Country.maxPopulationCity(countries);
        if (maxPopulationCity != null) {
            System.out.println("Highest populated city: " + maxPopulationCity.getName());
        } else {
            System.out.println("No capital found");
        }

        City Tokyo = City.getCityByName("Tokyo", cities);
        City Mumbai = City.getCityByName("Mumbai", cities);
        City Tilburg = City.getCityByName("Tilburg", cities);
            
        Country India = Country.getCountryByName("India", countries);
        Country Egypt = Country.getCountryByName("Egypt", countries);
        Country x = Country.getHighestPopCountry(countries);
        System.out.println(x);
        India.getCapital();
    }
}
