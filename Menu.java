package orderingSystem;



public class Menu {
    private int price;
    String [] main_dish = {"Beef Stew", "Pasta", "Sweet and Sour Chicken", "Chicken Cordon Bleu", "Chicken Parmesan"};
    String [] dessert = {"Cake", "Ice Cream", "Halo-Halo", "Leche Flan", "Banana Pudding"};
    String [] drinks = {"Coke", "Sprite", "Royal", "Iced Coffee"};


    public void displayMainDish() {
        for (int i = 0; i < main_dish.length ; i++) {
            if(i == 0) {
                price = 650;
            } else if(i == 1) {
                price = 300;
            } else if(i == 2) {
                price = 400;
            } else if(i == 3) {
                price = 450;
            } else if(i == 4) {
                price = 475;
            }
            System.out.println(main_dish[i] + " " + price + "₱");
        }
    }


    public void displayDessert() {
        for (int i = 0; i < dessert.length; i++) {
            if(i == 0) {
                price = 150;
            } else if(i == 1) {
                price = 200;
            } else if(i == 2) {
                price = 125;
            } else if(i == 3) {
                price = 100;
            } else if(i == 4) {
                price = 85;
            }
            System.out.println(dessert[i] + " " + price + "₱");
        }
    }

    public void displayDrinks() {
        for (int i = 0; i < drinks.length; i++) {
            if(i <= 2) {
                price = 40;
            } else {
                price = 60;
            }
            System.out.println(drinks[i] + " " + price + "₱");
        }
    }


    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMainDish();
        menu.displayDessert();
        menu.displayDrinks();
    }


}
