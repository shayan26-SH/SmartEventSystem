package Creational;

public class LargeRoom implements Room {

    @Override
    public String getRoomType() {
        return "Large Conference Room";
    }

    @Override
    public double getRoomCost() {
        return 300.00;
    }
}