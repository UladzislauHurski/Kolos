import java.util.ArrayList;

class AirField {
    private String name;
    private int capacity;
    private String address;
    private ArrayList<AerialVehicle> aerialVehicles;

    public AirField(String name, int capacity, String address) {
        this.name = name;
        this.capacity = capacity;
        this.address = address;
        this.aerialVehicles = new ArrayList<>();
    }

    public void addAerialVehicle(AerialVehicle aerialVehicle) throws Exception {
        if (aerialVehicles.size() >= capacity) {
            throw new Exception("AirField is full. Cannot add more vehicles.");
        }
        if (aerialVehicles.contains(aerialVehicle)) {
            throw new Exception("Aerial Vehicle with the same registration number already exists on the AirField.");
        }
        aerialVehicles.add(aerialVehicle);
    }

    public void removeAerialVehicle(AerialVehicle aerialVehicle) throws Exception {
        if (!aerialVehicles.contains(aerialVehicle)) {
            throw new Exception("Aerial Vehicle is not present on the AirField.");
        }
        aerialVehicles.remove(aerialVehicle);
    }

    public ArrayList<AerialVehicle> getAerialVehicles() {
        return aerialVehicles;
    }
}