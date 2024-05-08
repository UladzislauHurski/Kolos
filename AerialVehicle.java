class AerialVehicle {
    private String registrationNumber;
    private String color;
    private String model;
    private int yearOfProduction;

    public AerialVehicle(String registrationNumber, String color, String model, int yearOfProduction) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void displayInfo() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Year of Production: " + yearOfProduction);
    }
}