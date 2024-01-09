package Country;

import java.util.List;

public class City {
    private int id;
    private String name;
    private Double population;
    private String countryCode;

    public City(int id, String name, Double population, String countryCode) {
        this.countryCode = countryCode;
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPopulation() {
        return population;
    }

    public static City getCityByName(String name, List<City> cities){
        City city = cities.stream()
        .filter(c -> c.getName().equals(name))
        .findFirst()
        .orElse(null);
        return city;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
