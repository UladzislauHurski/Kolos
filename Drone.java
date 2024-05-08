class Drone extends AerialVehicle {
    private int batteryLife;
    private boolean cameraEquipped;

    public Drone(String registrationNumber, String color, String model, int yearOfProduction, int batteryLife, boolean cameraEquipped) { 
        super(registrationNumber, color, model, yearOfProduction);
        this.batteryLife = batteryLife;
        this.cameraEquipped = cameraEquipped;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Drone");
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Camera Equipped: " + (cameraEquipped ? "Yes" : "No"));
    }
}