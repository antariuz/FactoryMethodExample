package model.factory;

import model.Scooter;
import model.ScooterTypes;
import model.impl.ElectricalScooter;
import model.impl.MechanicalScooter;

public class ScooterFactory {

    public Scooter createScooter(ScooterTypes type) {
        Scooter scooter;
        switch (type) {
            case ELECTRICAL -> scooter = new ElectricalScooter();
            case MECHANICAL -> scooter = new MechanicalScooter();
            default -> throw new IllegalArgumentException("Such scooter type hasn't been found" + type);
        }
        return scooter;
    }

}
