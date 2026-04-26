class Vehicle {
    private String brand; //Private variable for brand
    private String color; //Private variable for color

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color; //Initializing variables
    }

    public void start() {
        System.out.println("Vehicle Brand: " + this.brand);
        System.out.println("Vehicle Color: " + this.color);
        System.out.println("Vehicle is starting...");
        System.out.println(); //display output
    }
}

public class IT_24026 {
    public static void main(String[] args) {
        if (args.length == 0 || args.length % 2 != 0) {
            return; //valid argument pairs
        }

        for (int i = 0; i < args.length; i += 2) { //Loop through command line arguments
            String brand = args[i];
            String color = args[i + 1];

            Vehicle myVehicle = new Vehicle(brand, color);
            myVehicle.start(); // Create object and call start
        }
    }
}
