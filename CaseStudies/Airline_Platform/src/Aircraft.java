public class Aircraft {
    public String name, model, manufacturingYear;
    public int seats;

    Aircraft(String name, String model, String year, int seat) {
        this.name = name;
        this.model = model;
        this.seats = seat;
        this.manufacturingYear = year;
    }

    public String getFlightName() {
        return name;
    }
}
