import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        AirField airField = new AirField("Chopin", 18000, "Warszawa");
        Helicopter helic1 = new Helicopter("T123", "Black", "Mi-28", 2015, 2);
        Helicopter helic2 = new Helicopter("F321", "White", "Mi-26", 2009, 3);
        Drone dr1 = new Drone("A111", "White", "Xiaomi 1 ", 2023, 1, true);
        Glider glider1 = new Glider("B333", "Black", "Xiaomi 2", 2024, 3);

        try {
            airField.addAerialVehicle(helic1);
            airField.addAerialVehicle(dr1);
            airField.addAerialVehicle(glider1);
            airField.addAerialVehicle(helic2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            airField.removeAerialVehicle(dr1);
            airField.removeAerialVehicle(dr1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Aerial Vehicles on AirField:");
        for (AerialVehicle vehicle : airField.getAerialVehicles()) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}