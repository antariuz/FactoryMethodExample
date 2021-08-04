package model.factory;

import model.Vehicle;
import model.impl.Bicycle;

public class BicycleFactory extends Factory {
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
