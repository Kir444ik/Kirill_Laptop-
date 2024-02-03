import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Laptop {
    private String brand;
    private String model;
    private double price;
    private Map<String, String> specifications;

    public Laptop(String brand, String model, double price, Map<String, String> specifications) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.specifications = specifications;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public Map<String, String> getSpecifications() {
        return specifications;
    }

    public static List<Laptop> filterLaptops(List<Laptop> laptops, Map<String, String> filters) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean matchesFilter = true;

            for (Map.Entry<String, String> entry : filters.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                if (!laptop.getSpecifications().containsKey(key) || !laptop.getSpecifications().get(key).equals(value)) {
                    matchesFilter = false;
                    break;
                }
            }

            if (matchesFilter) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        Laptop laptop1 = new Laptop("Brand1", "Model1", 999.99, new HashMap<>());
        Laptop laptop2 = new Laptop("Brand2", "Model2", 1499.99, new HashMap<>());
        Laptop laptop3 = new Laptop("Brand1", "Model3", 799.99, new HashMap<>());

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);

        Map<String, String> filters = new HashMap<>();
        filters.put("brand", "Brand1");
        filters.put("price", "799.99");
        List<Laptop> filteredLaptops = Laptop.filterLaptops(new ArrayList<>(laptops), filters);

        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop.getBrand() + " " + laptop.getModel() + " - $" + laptop.getPrice());
        }
    }
}