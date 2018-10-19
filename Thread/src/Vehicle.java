public class Vehicle<T extends GroundVehicle> {

    T t;

    public  Vehicle(T t){
        this.t = t;
    }

    public void drive(){
        System.out.println("I am driving "+t.toString());

    }
}
