// UML Practice: Vehicle System --> Hierarchical Inheritance practice
//                                                         ┌─────────────────────────┐
//                                                         │        Vehicle          │
//                                                         ├─────────────────────────┤
//                                                         │ - brand : String        │
//                                                         │ - price : double        │
//                                                         ├─────────────────────────┤
//                                                         │ + displayVehicle():void │
//                                                         └────────────┬────────────┘
//                                                                     │
//                                                     ┌────────────────┴────────────────┐
//                                                     │                                 │
//                                                     ▼                                 ▼
//                                         ┌─────────────────────┐          ┌─────────────────────┐
//                                         │        Car          │          │       Bike          │
//                                         ├─────────────────────┤          ├─────────────────────┤
//                                         │ - doors : int       │          │ - engineCC : int    │
//                                         ├─────────────────────┤          ├─────────────────────┤
//                                         │ + displayCar():void │          │ + displayBike():void│
//                                         └─────────────────────┘          └─────────────────────┘

class Vehicle {
    private String brand;
    private double price;

    Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + " BDT");
    }
}

class Car extends Vehicle {
    private int doors;
    
    Car(String brand, double price, int doors) {
        super(brand, price);
        this.doors = doors;
    }

    public void displayCar() {
        System.out.println("Car Has: " + doors + " Doors");
    }
}

class Bike extends Vehicle {
    private int engineCC;

    Bike(String brand, double price, int engineCC) {
        super(brand, price);
        this.engineCC = engineCC;
    }

    public void displayBike() {
        System.out.println("Engine CC: " + engineCC);
    }
}

class Vehicles {

    public static void main(String[] args) {
        System.out.println("--------------------------------------");

        System.out.println("Car Information:");
        Car c = new Car("Toyota", 2500000, 4);
        c.displayVehicle();
        c.displayCar();

        System.out.println("--------------------------------------");

        System.out.println("Bike Information:");
        Bike b = new Bike("Royal Enfield", 550000, 150);
        b.displayVehicle();
        b.displayBike();

        System.out.println("--------------------------------------");
    }
}