public class NutAllergyDietFactory extends Customer {
    private static NutAllergyDietFactory instance;

    public static NutAllergyDietFactory getInstance() {
        if (instance == null) {
            // Create a new instance of the NutAllergyDietFactory class if it hasn't been created yet
            instance = new NutAllergyDietFactory();
        }
        return instance;
    }
    @Override
    public Diet createDiet() {
        setDietType("Nut Allergy");
        return new nutAllergyDiet();
    }
}
