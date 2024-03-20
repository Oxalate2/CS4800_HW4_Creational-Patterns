import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String brand;
    private final String size;
    private final List<String> toppings;

    // Private constructor to enforce the use of the builder
    Pizza(PizzaBuilder builder) {
        this.brand = builder.brand;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    // Getters for the brand, size, and toppings
    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void eat() {
        System.out.print(this.getBrand() + " | " + this.getSize() + ": " + this.getToppings() + "\n");
    }

    public static class PizzaBuilder {
        String brand;
        String size;
        List<String> toppings;

        // Constructor
        public PizzaBuilder(String size) {
            this.size = size;
            this.toppings = new ArrayList<>();
        }

        // Methods to add toppings
        public PizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public PizzaBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        // Method to build the pizza
        public Pizza build() {
            return new Pizza(this);
        }
    }
}