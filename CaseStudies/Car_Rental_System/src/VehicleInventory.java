import java.util.ArrayList;
import java.util.HashMap;
public class VehicleInventory {
    public static HashMap<VehicleCategory, ArrayList<Vehicle>> inventory = new HashMap<VehicleCategory, ArrayList<Vehicle>>();
    public static ArrayList<Vehicle> database = new ArrayList<Vehicle>();

    public static void addVehicle(VehicleCategory category, Vehicle Vehicle) {
        inventory.putIfAbsent(category, new ArrayList<Vehicle>());
        inventory.get(category).add(Vehicle);
        database.add(Vehicle);

    }

    public static ArrayList<Vehicle> getVehicleByCategory(VehicleCategory category) {
        return inventory.get(category);
    }

    public static ArrayList<Vehicle> getAllVehicles() {
        return database;
    }
}
