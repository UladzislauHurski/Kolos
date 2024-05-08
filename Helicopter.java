class Helicopter extends AerialVehicle {
    private int colorCount;

    public Helicopter(String registrationNumber, String color, String model, int yearOfProduction, int colorCount) {
        super(registrationNumber, color, model, yearOfProduction);
        this.colorCount = colorCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Helicopter");
        System.out.println("Color Count: " + colorCount);
    }
}