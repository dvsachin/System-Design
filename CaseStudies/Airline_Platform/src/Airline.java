public class Airline {
    public static void main(String args[]) {

        Address address = new Address("apartments", "area", "BLR", "KA", "india");
        Passport harshPassport = new Passport("9148-0934-1142", "25/07/2000", address, "expiryDate");

        Customer passanger = new Customer("id", "pass", "name", "email", "8758149799", harshPassport);

        System.out.println("done");

    }
}
