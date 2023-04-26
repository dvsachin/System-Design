import java.util.ArrayList;
import java.util.HashMap;

class System {
    public HashMap<Customer, ArrayList<Order>> customerDB;
    public HashMap<DeliveryGuy, ArrayList<Order>> deliveryDB;

    public void addCustomerDetails(Customer user, Order order) {
        customerDB.get(user).add(order);
    }

    public ArrayList<Order> getCustomerDetails(Customer customer) {
        return customerDB.get(customer);
    }

    public void addDeliveryDetails(DeliveryGuy delivery, Order order) {
        deliveryDB.get(delivery).add(order);
    }

    public ArrayList<Order> getDeliveryDetails(DeliveryGuy delivery) {
        return deliveryDB.get(delivery);
    }
}