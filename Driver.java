public class Driver {
    public static void main(String[] args) {

        Customer customer1 = noDietFactory.getInstance();
        Diet diet1 = customer1.getDiet();
        customer1.setName("Jayson");
        System.out.print("Customer Name: " + customer1.getName() + "\n");
        diet1.printDiet();

        Customer customer2 = NutAllergyDietFactory.getInstance();
        Diet diet2 = customer2.getDiet();
        customer2.setName("Asher");
        System.out.print("Customer Name: " + customer2.getName() + "\n");
        diet2.printDiet();

        Customer customer3 = PaleoDietFactory.getInstance();
        Diet diet3 = customer3.getDiet();
        customer3.setName("Ethan");
        System.out.print("Customer Name: " + customer3.getName() + "\n");
        diet3.printDiet();

        Customer customer4 = VeganDietFactory.getInstance();
        Diet diet4 = customer4.getDiet();
        customer4.setName("Alex");
        System.out.print("Customer Name: " + customer4.getName() + "\n");
        diet4.printDiet();

        Customer customer5 = NutAllergyDietFactory.getInstance();
        Diet diet5 = customer5.getDiet();
        customer5.setName("Natalie");
        System.out.print("Customer Name: " + customer5.getName() + "\n");
        diet5.printDiet();

        Customer customer6 = noDietFactory.getInstance();
        Diet diet6 = customer6.getDiet();
        customer6.setName("Caroline");
        System.out.print("Customer Name: " + customer6.getName() + "\n");
        diet6.printDiet();
    }
}
