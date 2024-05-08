class Glider extends AerialVehicle {
    private double wingLength;

    public Glider(String registrationNumber, String color, String model, int yearOfProduction, double wingLength) {
        super(registrationNumber, color, model, yearOfProduction);
        this.wingLength = wingLength;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Glider");
        System.out.println("Wing Length: " + wingLength + " meters");
    }
}