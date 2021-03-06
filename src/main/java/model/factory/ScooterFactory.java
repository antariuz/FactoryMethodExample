package model.factory;

import model.Vehicle;
import model.impl.Scooter;

public class ScooterFactory extends Factory {
    @Override
    public Vehicle createVehicle() {
        return new Scooter();
    }
}
