public class PaleoDietFactory extends Customer {
    private static PaleoDietFactory instance;

    public static PaleoDietFactory getInstance() {
        if (instance == null) {
            // Create a new instance of the PaleoDietFactory class if it hasn't been created yet
            instance = new PaleoDietFactory();
        }
        return instance;
    }
    @Override
    public Diet createDiet() {
        setDietType("Paleo");
        return new paleoDiet();
    }
}
