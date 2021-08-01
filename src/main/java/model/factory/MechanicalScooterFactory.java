package model.factory;

import model.Scooter;
import model.impl.MechanicalScooter;

public class MechanicalScooterFactory extends ScooterFactory{
    @Override
    public Scooter createScooter() {
        return new MechanicalScooter();
    }
}
