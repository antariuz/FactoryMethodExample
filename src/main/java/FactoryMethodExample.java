import model.factory.ElectricalScooterFactory;
import model.factory.MechanicalScooterFactory;
import model.factory.ScooterFactory;

import java.util.Arrays;

public class FactoryMethodExample {
    public static void main(String[] args) {
        ScooterFactory[] factories = {new MechanicalScooterFactory(), new ElectricalScooterFactory(),
                new MechanicalScooterFactory(), new ElectricalScooterFactory()};
        Arrays.stream(factories).forEach(System.out::println);
    }
}
