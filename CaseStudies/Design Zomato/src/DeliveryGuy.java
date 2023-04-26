import java.util.ArrayList;

class DeliveryGuy extends Person {

    public ArrayList<Order> deliveries  = new ArrayList<>();

    DeliveryGuy(String name, String email, String phone, Address address) {
        super(name, email, phone, address);
    }

    public void addDeliveries(Order order) {
        this.deliveries.add(order);
    }

    public Boolean deliverItem(Order order) {
        if (!deliveries.contains(order))
            return false;
        this.deliveries.remove(order);
        return true;
    }

}