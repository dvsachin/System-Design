import java.util.ArrayList;

class Menu {
    public String menuId;
    public ArrayList<FoodItem> menu = new ArrayList<FoodItem>();

    Menu(String id) {
        this.menuId = id;
    }

    public void addFood(FoodItem dish) {
        this.menu.add(dish);
    }
}