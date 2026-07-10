package Behavioral.State;

// CancelledState represents a booking that was cancelled.
//
// Once cancelled, no other actions can be performed.

public class CancelledState implements BookingState {

    @Override
    public void pay(BookingContext context) {
        System.out.println(
                "Payment failed: a cancelled booking cannot be paid."
        );
    }

    @Override
    public void checkin(BookingContext context) {
        System.out.println(
                "Check-in failed: this booking has been cancelled."
        );
    }

    @Override
    public void cancel(BookingContext context) {
        System.out.println(
                "Cancellation failed: this booking is already cancelled."
        );
    }

    @Override
    public void complete(BookingContext context) {
        System.out.println(
                "Completion failed: a cancelled booking cannot be completed."
        );
    }

    @Override
    public String getStateName() {
        return "Cancelled";
    }
}