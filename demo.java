public class demo {

  public static void main(String[] args) {
    EventFactory factory = new ConferenceFactory();

    EventBooking booking = new BasicEventBooking(
      "AI Conference",
      factory.createRoom(),
      factory.createEquipment(),
      factory.createAccessControl()
    );

    booking = new CateringDecorator(booking);
    booking = new SecurityDecorator(booking);

    System.out.println(booking.getDescription());
    System.out.println("Cost: $" + booking.getCost());

    BookingContext context = new BookingContext();
    context.pay();
    context.checkIn();

    PaymentStrategy payment = new CreditCardPayment();
    payment.pay(booking.getCost());
  }
}
