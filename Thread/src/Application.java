public class Application {

    public static void main(String[] args) {

        Car car = new Car();
        Vehicle<Car> vehicle = new Vehicle<>(car);
        vehicle.drive();

        GroundVehicle groundVehicle = new GroundVehicle();
        Vehicle<GroundVehicle> vehicle2 = new Vehicle<>(groundVehicle);
        vehicle2.drive();

        Printer printer = new Printer();

        Integer intArray[]= {1,3,5,9};

        String s[]={"A","E","I","O","U"} ;
        printer.printArray(intArray);
        System.out.println("");
        printer.printArray(s);
    }
}
