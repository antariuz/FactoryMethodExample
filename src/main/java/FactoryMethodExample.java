import model.Vehicle;
import model.factory.BicycleFactory;
import model.factory.ScooterFactory;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Vehicle scooter = new ScooterFactory().createVehicle();
        Vehicle bicycle = new BicycleFactory().createVehicle();
        System.out.println(scooter.getClass() + "\n" + bicycle.getClass());
    }
}
