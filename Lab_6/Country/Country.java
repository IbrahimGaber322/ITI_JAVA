package Country;

import java.util.ArrayList;
/* import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional; */
import java.util.function.Function;
import java.util.stream.Collectors;

public class Country {
    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private int population;
    private double gnp;
    private int capital;
    private ArrayList<City> cities;

    public Country(String code,
            String name,
            String continent,
            double surfaceArea,
            int population,
            double gnp,
            int capital,
            ArrayList<City> cities) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
        this.gnp = gnp;
        this.capital = capital;
        this.cities = cities;
    }

    public int getCapital() {
        return capital;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public String getCode() {
        return code;
    }

    public String getContinent() {
        return continent;
    }

    public double getGnp() {
        return gnp;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public static City findHighestPopulatedCapital(ArrayList<Country> countries) {

        ArrayList<City> capitals = countries.stream()
                .filter(country -> country.getCapital() >= 0 && country.getCapital() < country.getCities().size())
                .map((Function<Country, City>) country -> country.getCities().get(country.getCapital()))
                .collect(Collectors.toCollection(ArrayList<City>::new));

        City maxPopulationCapital = null;
        int maxPop = 0;
        for (City c : capitals) {
            if (c.getPopulation() > maxPop) {
                maxPopulationCapital = c;
                maxPop = c.getPopulation();
            }
        }

        return maxPopulationCapital;

        /*
         * Optional<City> maxPopulationCapital = countries.stream()
         * .map(country -> country.getCities().get(country.getCapital()))
         * .max(Comparator.comparingInt(City::getPopulation));
         * 
         * return maxPopulationCapital.orElse(null);
         */

    }
}
