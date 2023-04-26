import java.time.LocalDateTime;
import java.util.ArrayList;

class Order {

    public String orderId;
    public Customer customer;
    public DeliveryGuy delivery;
    public LocalDateTime creationOrder;
    public PaymentMethod billingMode;
    public ArrayList<FoodItem> meal;

    public OrderStatus orderStatus;

    public PaymentStatus paymentStatus = PaymentStatus.PENDING;

    public Order(String orderId, Customer customer, DeliveryGuy delivery, LocalDateTime creationOrder,
                 PaymentMethod billingMode, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.customer = customer;
        this.delivery = delivery;
        this.creationOrder = creationOrder;
        this.billingMode = billingMode;
        this.orderStatus = orderStatus;
        meal = new ArrayList<FoodItem>();
    }

    public void addMeal(FoodItem dish) {
        meal.add(dish);
    }
    public void updateOrderStatus( OrderStatus status) { this.orderStatus = status;}



}