public class Customer extends Account{
    public Boolean frequentFlyer;

    Customer(String id, String password, String name, String email, String phone, Passport pass) {
        super(id, password, name, email, phone, pass);

    }

    // Constructor overloading
    Customer(String id, String password, String name, String email, String phone, Passport pass,
             Boolean frequentFlyer) {
        super(id, password, name, email, phone, pass);
        this.frequentFlyer = frequentFlyer;

    }
}
