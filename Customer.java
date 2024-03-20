public abstract class Customer {
    private String name;
    private String dietType;
    public Diet getDiet() {
        Diet diet = createDiet();
        diet.curate();
        return diet;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDietType() {
        return dietType;
    }
    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public abstract Diet createDiet();
}
