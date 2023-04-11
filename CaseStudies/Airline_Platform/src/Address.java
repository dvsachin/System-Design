public class Address {
    public String apartments, area, landmark, city, state, country;

    Address(String apartments, String area, String city, String state, String country, String landmark) {
        this.apartments = apartments;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
        this.landmark = landmark;
    }

    // Constructor overloading
    Address(String apartments, String area, String city, String state, String country) {
        this.apartments = apartments;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
        this.landmark = "";

    }
}
