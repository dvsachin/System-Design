import java.time.LocalDateTime;

public class Rental {
    public static void main(String args[]) {

        Address address = new Address("street", "city", "state", "zipcode", "country");
        Person p = new Person("Harsh", "h@g.com", "8758149799", address);
        Member harsh = new Member("id", "password", p, AccountStatus.ACTIVE, 5);

        Vehicle car = new Vehicle(1001, 4, "BMW", "sportz", LocalDateTime.now(), "none", VehicleCategory.CAR);
        car.logs.remove("none");
        car.addLogs("car Status: "+VehicleType.ACCIDENT);


        Vehicle mahindra = new Vehicle(1121, 6, "MAHINDRA", "XUV", LocalDateTime.now(), "none", VehicleCategory.SUV);
        mahindra.logs.remove("none");
        mahindra.addLogs("car Status: "+VehicleType.FUELING);



        // testing search query
        for (Vehicle x : VehicleInventory.getAllVehicles()) {
            System.out.println(x);
            System.out.println("licence Number "+x.licenceNumber);
        }

    }
}
