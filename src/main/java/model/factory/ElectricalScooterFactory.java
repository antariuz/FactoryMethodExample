package model.factory;

import model.Scooter;
import model.impl.ElectricalScooter;

public class ElectricalScooterFactory extends ScooterFactory {
    @Override
    public Scooter createScooter() {
        return new ElectricalScooter();
    }
}
