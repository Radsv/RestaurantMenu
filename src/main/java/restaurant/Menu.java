package restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> food;
    private String lastUpdated;

    public Menu(String lastUpdated){
        this.food = new ArrayList<MenuItem>();
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getFood() {
        return food;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public void addFood(MenuItem food1){
        this.food.add(food1);
    }
}
