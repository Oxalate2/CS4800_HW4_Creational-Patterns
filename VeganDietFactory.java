public class VeganDietFactory extends Customer {
    private static VeganDietFactory instance;
    public static VeganDietFactory getInstance() {
        if (instance == null) {
            // Create a new instance of the VeganDietFactory class if it hasn't been created yet
            instance = new VeganDietFactory();
        }
        return instance;
    }
    @Override
    public Diet createDiet() {
        setDietType("Vegan");
        return new veganDiet();
    }
}
