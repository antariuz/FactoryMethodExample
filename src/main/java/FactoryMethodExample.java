import model.Scooter;
import model.ScooterTypes;
import model.factory.ScooterFactory;

public class FactoryMethodExample {
    public static void main(String[] args) {
        ScooterFactory factory = new ScooterFactory();

        Scooter scooter1 = factory.createScooter(ScooterTypes.MECHANICAL);
        Scooter scooter2 = factory.createScooter(ScooterTypes.ELECTRICAL);

    }
}
