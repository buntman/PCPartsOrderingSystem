package orderingSystem;

public class orderItems {
    private String main_dish;
    private String dessert;
    private String drinks;

    orderItems(String main_dish, String dessert, String drinks) {
        this.main_dish = main_dish;
        this.dessert = dessert;
        this.drinks = drinks;
    }

    public String getMain_dish() {
        return main_dish;
    }

    public void setMain_dish(String main_dish) {
        this.main_dish = main_dish;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }
}
