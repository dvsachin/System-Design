import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vehicle {
    public int licenceNumber, capacity;
    public String model, brand;
    public LocalDateTime manufacturingYear;
    public ArrayList<String> logs = new ArrayList<String>();
    public VehicleCategory category;

    public Vehicle(int licenceNumber, int capacity, String brand, String model, LocalDateTime manufacturingYear, String logs, VehicleCategory category) {
        this.licenceNumber = licenceNumber;
        this.capacity = capacity;
        this.brand = brand;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.logs.add(logs);
        this.category = category;

        VehicleInventory.addVehicle(category, this);
    }

    public void addLogs(String log) {

        logs.add(log);
    }

    public ArrayList<String> getLogs() {

        return logs;
    }

    @Override
    public String toString() {
       return  "Vehicle licence Number: "+licenceNumber+", Vehicle Capacity: "+capacity+", Vehicle Brand: "+brand+", Vehicle Model: "+model+", Vehicle logs: "+logs+", Vehicle Category: "+category+", Registration Time: "+manufacturingYear;
    }
}
