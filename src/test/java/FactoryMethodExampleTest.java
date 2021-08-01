import model.Scooter;
import model.ScooterTypes;
import model.factory.ScooterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryMethodExampleTest {

    private ScooterFactory scooterFactory;
    private Scooter scooter;

    @Test
    public void testScooterTypeSelection() {
        ScooterTypes scooterType = ScooterTypes.ELECTRICAL;
        assertEquals("Type was not lexically identical to \"ELECTRICAL\"",
                0, scooterType.compareTo(ScooterTypes.ELECTRICAL));
    }


}