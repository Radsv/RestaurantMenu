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
        int length = this.food.size();
        boolean exists = false;
        for( int i = 0; i < length; i ++){
            if(this.food.get(i).equals(food1)){
                System.out.println("This item already exists");
                exists = true;
            }
        }
        if(!exists){
            this.food.add(food1);
        }
        //this.food.add(food1);

    }

    public void printMenu(){
        int length = this.food.size();
        for(int i = 0; i < length; i++){
            /*System.out.println(this.food.get(i).getItemName() + " | $" +
                    this.food.get(i).getItemPrice() + " | " +
                    this.food.get(i).getItemDescription() + " | " +
                    this.food.get(i).getItemCategory() + " | " +
                    this.food.get(i).isNew()); */
            this.food.get(i).printItem();
        }
    }

    public void deleteItem(MenuItem trash){
        this.food.remove(trash);
    }
}
