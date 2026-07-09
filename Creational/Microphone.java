package Creational;

public class Microphone implements Equipment {

    @Override
    public String getEquipmentName() {
        return "Microphone";
    }

    @Override
    public double getEquipmentCost() {
        return 40.00;
    }
}