package Country;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Country {
    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private int population;
    private double gnp;
    private int capital;
    private List<City> cities;

    public Country(String code,
            String name,
            String continent,
            double surfaceArea,
            int population,
            double gnp,
            int capital,
            List<City> cities) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
        this.gnp = gnp;
        this.capital = 0;
        this.cities = cities != null ? new ArrayList<>(cities) : new ArrayList<>();
    }

    public int getCapitalIndex() {
        return capital;
    }

    public City getCapital() {
        City capital = null;
        int capIndex = getCapitalIndex();
        List<City> countryCities = getCities();

        if (countryCities != null && capIndex >= 0 && capIndex < countryCities.size()) {
            capital = countryCities.get(capIndex);
        }

        return capital;
    }

    public List<City> getCities() {
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
        Optional<City> maxPopulationCapital = countries.stream()
                .map(c -> c.getCapital())
                .filter(capital -> capital != null)
                .max(Comparator.comparingDouble(c -> c.getPopulation()));

        return maxPopulationCapital.orElse(null);
    }

    public static City maxPopulationCity(Country country) {
        Optional<City> maxPopulationCity = country.getCities().stream()
                .max(Comparator.comparingDouble(City::getPopulation));
        return maxPopulationCity.orElse(null);
    }

    public static City maxPopulationCity(ArrayList<Country> countries) {
        Optional<City> maxPopulationCity = countries.stream()
                .flatMap(c -> c.getCities().stream())
                .max(Comparator.comparingDouble(City::getPopulation));
        return maxPopulationCity.orElse(null);
    }

    public static Country getCountryByName(String name, List<Country> countries) {
        Country country = countries.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
        return country;
    }

    public static Country getHighestPopCountry(List<Country> countries) {
        Optional<Country> country = countries.stream().max(Comparator.comparing(c -> c.getPopulation()));
        return country.orElse(null);
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", population=" + population +
                ", gnp=" + gnp +
                ", capital='" + (getCapital() != null ? getCapital().getName() : "No Capital") +'\''+
                ", cities=" + cities.size() +
                '}';
    }

}
