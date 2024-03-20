public class Main {
    public static void main(String[] args) {
        // Without Brand
        Pizza basic_pizza = new Pizza.PizzaBuilder("large")
                .addTopping("Cheese")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .build();

        basic_pizza.eat();

        Pizza gf_pizza = new Pizza.PizzaBuilder("medium")
                .addTopping("Ham and Pineapple")
                .addTopping("Extra Cheese")
                .addTopping("Mushrooms")
                .addTopping("Pepperoni")
                .addTopping("Onions")
                .addTopping("Pesto")
                .build();

        gf_pizza.eat();

        Pizza my_pizza = new Pizza.PizzaBuilder("small")
                .addTopping("Chicken")
                .addTopping("Tomato and Basil")
                .addTopping("Onions")
                .addTopping("Mushrooms")
                .addTopping("Ham")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Spinach")
                .addTopping("Pesto")
                .build();

        my_pizza.eat();

        // With Brand
        Pizza pizzaHut1 = new Pizza.PizzaBuilder("large")
                .setBrand("Pizza Hut")
                .addTopping("Peppers")
                .addTopping("Beef")
                .addTopping("Extra Cheese")
                .build();
        pizzaHut1.eat();

        Pizza pizzaHut2 = new Pizza.PizzaBuilder("small")
                .setBrand("Pizza Hut")
                .addTopping("Chicken")
                .addTopping("Tomato and Basil")
                .build();
        pizzaHut2.eat();

        Pizza littleCeasars1 = new Pizza.PizzaBuilder("medium")
                .setBrand("Little Caesars")
                .addTopping("Spicy Pork")
                .addTopping("Olives")
                .addTopping("Spinach")
                .addTopping("Ham and Pinapple")
                .addTopping("Onions")
                .addTopping("Sausage")
                .addTopping("Pepperoni")
                .addTopping("Pesto")
                .build();
        littleCeasars1.eat();

        Pizza littleCeasars2 = new Pizza.PizzaBuilder("small")
                .setBrand("Little Caesars")
                .addTopping("Pepperoni")
                .addTopping("Beef")
                .addTopping("Spinach")
                .addTopping("Ham")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .build();
        littleCeasars2.eat();

        Pizza dominos1 = new Pizza.PizzaBuilder("small")
                .setBrand("Dominos")
                .addTopping("Pesto")
                .build();
        dominos1.eat();

        Pizza dominos2 = new Pizza.PizzaBuilder("large")
                .setBrand("Dominos")
                .addTopping("Tomato and Basil")
                .addTopping("Chicken")
                .addTopping("Pepperoni")
                .build();
        dominos2.eat();

    }
}
