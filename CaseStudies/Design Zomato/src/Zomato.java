import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Zomato {
    public static void main(String[] args) {
        // added by system - adding customer, delivery guy, restaurant and its menu and dishes, creates new order
        System system = new System();


        Customer customer1 = new Customer("Sachin", "sachin777@gmail.com", "765432322",
                new Address("HSR layout-6", "Bangalore", "KA", "560103","India"));


        DeliveryGuy deliveryGuy1 = new DeliveryGuy("Rakesh", "rakeshrocks12@gmail.com", "9876543234",
                new Address("KR-Puram", "Bangalore", "KA", "560041", "India"));

        Restaurant restaurant = new Restaurant("AnandSweets",
                new Branch(new Address("sarjapur main road", "Bangalore","KA", "560035", "India"),
                        "Anand Sweets & Purani Delhi"));

        Menu menu = new Menu("432");

        FoodItem southThali = new FoodItem("South Indian Thali", "123", "3 sabzi and 3 roti with half bowl rice with one sweet", 150);
        FoodItem northThali = new FoodItem("North Indian Thali", "532", "3 sabzi and 4 roti with rice with one sweet", 180);

        menu.addFood(southThali);
        menu.addFood(northThali);

        Order order = new Order("349482302", customer1, deliveryGuy1, LocalDateTime.now(), PaymentMethod.CASH, OrderStatus.ACTIVE);
        order.addMeal(northThali);

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(order);

        system.customerDB = new HashMap<Customer, ArrayList<Order>>();
        system.customerDB.put(customer1,orders);

        system.deliveryDB = new HashMap<DeliveryGuy, ArrayList<Order>>();
        system.deliveryDB.put(deliveryGuy1,orders);

        system.addCustomerDetails(customer1,order);
        system.addDeliveryDetails(deliveryGuy1,order);

        // done by user
        customer1.addOrders(order);

        // done by system

        deliveryGuy1.deliverItem(order);
        customer1.receiveOrder(order);
        order.paymentStatus = PaymentStatus.COMPLETED;
        deliveryGuy1.addDeliveries(order);
        order.updateOrderStatus(OrderStatus.CLOSED);


    }
}