package restaurant;

public class Restaurant {
    public static void main(String[] args){
        MenuItem donut = new MenuItem("Donuts",
                1.0, "Sweet", "Dessert",
                true);

        MenuItem burger = new MenuItem("Burger",
                1.0, "Lunch", "Main Course",
                true);

        MenuItem fries = new MenuItem("Fries",
                1.0, "Snack", "Appetizer",
                true);

        MenuItem cake = new MenuItem("Donuts",
                1.0, "Sweet", "Dessert",
                true);

        Menu junkFood = new Menu("date");

        junkFood.addFood(donut);
        junkFood.addFood(burger);
        junkFood.addFood(fries);

        junkFood.printMenu();

        junkFood.deleteItem(donut);

        System.out.println();
        junkFood.printMenu();

        System.out.println();
        donut.printItem();
        junkFood.addFood(donut);
        junkFood.addFood(donut);
        junkFood.addFood(cake);
    }
}
