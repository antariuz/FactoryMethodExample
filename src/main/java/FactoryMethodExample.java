import model.Scooter;
import model.factory.ScooterFactory;

public class FactoryMethodExample {
    public static void main(String[] args) {
        ScooterFactory factory = new ScooterFactory();

        Scooter scooter1 = factory.createScooter(ScooterFactory.ScooterTypes.ELECTRICAL);
        Scooter scooter2 = factory.createScooter(ScooterFactory.ScooterTypes.ELECTRICAL);

    }
}
