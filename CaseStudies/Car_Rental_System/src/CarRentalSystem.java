public class CarRentalSystem {
    public String name;
    public Address location;

    CarRentalSystem(String name, Address address) {
        this.name = name;
        this.location = address;
    }

    public Address getLocation() {
        return location;
    }
}
