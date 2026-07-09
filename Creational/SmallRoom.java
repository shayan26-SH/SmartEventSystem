package Creational;

public class SmallRoom implements Room {

    @Override
    public String getRoomType() {
        return "Small Conference Room";
    }

    @Override
    public double getRoomCost() {
        return 150.00;
    }
}