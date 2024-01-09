import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import Country.City;
import Country.Country;

public class Csv {
    public static ArrayList<Country> readCountries(String file, Map<String, List<City>> cities) {
        ArrayList<Country> countries = new ArrayList<>();
   
        try {
            FileReader filereader = new FileReader(file);
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .build();
            List<String[]> allData = csvReader.readAll();
    
            for (String[] row : allData) {
                String code = row[0].trim();
                String name = row[1].trim();
                String continent = row[2].trim();
                double population = Double.parseDouble(row[3]);
                double surfaceArea = Double.parseDouble(row[4]);
                double gnp = Double.parseDouble(row[5]);
                int capital = Integer.parseInt(row[6]);
    
                // Assuming the last column is a list of cities, you need to parse it
                // accordingly
                List<City> countryCities = cities.get(code);
                
                Country country = new Country(code, name, continent, surfaceArea, (int) population, gnp, capital, countryCities); // Convert population to int
                countries.add(country);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countries;
    }
    
    

    public static ArrayList<City> readCities(String file) {
        ArrayList<City> cities = new ArrayList<>();

        try {
            FileReader filereader = new FileReader(file);
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .build();
            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                int id = Integer.parseInt(row[0]);
                String name = row[1].trim();

                Double population = Double.parseDouble(row[2]);
                String code = row[3].trim();
                //System.out.println("id: "+id+" name: "+name+" population: "+population+" code: "+code);
                City city = new City(id, name, population, code);
                cities.add(city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cities;
    }
}
