public class noDietFactory extends Customer {
    private static noDietFactory instance;

    public static noDietFactory getInstance() {
        if (instance == null) {
            // Create a new instance of the NoDietFactory class if it hasn't been created yet
            instance = new noDietFactory();
        }
        return instance;
    }
    @Override
    public Diet createDiet() {
        setDietType("No Restriction");
        return new noDiet();
    }

}
