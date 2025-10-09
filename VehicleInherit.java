class Vehicle {
    String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Method to display vehicle details
    void showDetails() {
        System.out.println("Brand: " + brand);
    }
}

// Derived class 1
class Car extends Vehicle {
    int year;

    // Constructor using super()
    Car(String brand, int year) {
        super(brand); // Calls Vehicle constructor
        this.year = year;
    }

    // Overriding method
    @Override
    void showDetails() {
        super.showDetails(); // Calls Vehicle's showDetails()
        System.out.println("Year: " + year);
    }
}

// Derived class 2
class ElectricCar extends Car {
    int batteryCapacity;

    // Constructor using super()
    ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year); // Calls Car constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding method
    @Override
    void showDetails() {
        super.showDetails(); // Calls Car's showDetails()
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Main class
public class VehicleInherit {
    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar("Tesla", 2024, 100);
        myTesla.showDetails();
    }
}
