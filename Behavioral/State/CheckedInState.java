package Behavioral.State;


public class CheckedInState implements BookingState {

    @Override
    public void pay(BookingContext context) {
        System.out.println(
                "Payment failed: a cancelled booking is already  paid."
        );
    }

    @Override
    public void checkin(BookingContext context) {
        System.out.println(
                "Check-in failed: this booking has beenis already checked in."
        );
    }

    @Override
    public void cancel(BookingContext context) {
        System.out.println(
                "Cancellation failed: this booking is cant be  cancelled."
        );
    }

    @Override
    public void complete(BookingContext context) {
        System.out.println(
                "Completed."
        );
    }

    @Override
    public String getStateName() {
        return "Checked in";
    }
}
