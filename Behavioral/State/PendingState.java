package Behavioral.State;

// PendingState represents a newly created booking.
//
// A pending booking:
// - Can be paid
// - Can be cancelled
// - Cannot be checked in
// - Cannot be completed

public class PendingState implements BookingState {

    @Override
    public void pay(BookingContext context) {
        System.out.println("Payment accepted.");

        // After payment, the booking becomes confirmed.
        context.setState(new ConfirmedState());
    }

    @Override
    public void checkin(BookingContext context) {
        System.out.println(
                "Check-in failed: the booking must be paid first."
        );
    }

    @Override
    public void cancel(BookingContext context) {
        System.out.println("Pending booking cancelled.");

        context.setState(new CancelledState());
    }

    @Override
    public void complete(BookingContext context) {
        System.out.println(
                "Completion failed: a pending booking cannot be completed."
        );
    }

    @Override
    public String getStateName() {
        return "Pending";
    }
}