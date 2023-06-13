package restaurant;


import java.util.Objects;

public class MenuItem {
    private String itemName;
    private Double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private boolean isNew;


    public MenuItem(String itemName, Double itemPrice,
                    String itemDescription, String itemCategory, boolean isNew){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.isNew = isNew;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void printItem(){
        System.out.println(this.itemName + " | $" + this.itemPrice + " | " + this.itemDescription + " | "
        + this.itemCategory + " | " + this.isNew);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return isNew == menuItem.isNew && Objects.equals(itemName, menuItem.itemName) && Objects.equals(itemPrice, menuItem.itemPrice) && Objects.equals(itemDescription, menuItem.itemDescription) && Objects.equals(itemCategory, menuItem.itemCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, itemPrice, itemDescription, itemCategory, isNew);
    }
}

