package Creational;

public class ZoomRoom implements Room {

    @Override
    public String getRoomType() {
        return "Online Zoom Room";
    }

    @Override
    public double getRoomCost() {
        return 50.00;
    }
}