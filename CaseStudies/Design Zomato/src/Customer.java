import java.util.ArrayList;

class Customer extends Person {

    public ArrayList<Order> orders = new ArrayList<>();

    Customer(String name, String email, String phone, Address address) {
        super(name, email, phone, address);
    }

    public void addOrders(Order order) {
        this.orders.add(order);
    }

    public Boolean receiveOrder(Order order) {
        if (!orders.contains(order))
            return false;

        this.orders.remove((order));
        return true;
    }
}