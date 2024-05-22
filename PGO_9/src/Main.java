public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "Focus", 2018, 1100, 100, 500);
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency());

        Car car = new Car("Toyota", "RAV4", 2016, 300, 15);
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency());
    }
}
