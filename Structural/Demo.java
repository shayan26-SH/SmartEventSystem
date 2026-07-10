package Structural;

import Creational.ConferenceFactory;
import Creational.EventFactory;
import Structural.BasicEventBooking;
import Structural.CateringDecorator;
import Structural.CleaningDecorator;
import Structural.EventBooking;
import Structural.RecordingDecorator;
import Structural.SecurityDecorator;

public class Demo {

    public static void main(String[] args) {

        // Create the conference package using Abstract Factory.
        EventFactory factory = new ConferenceFactory();

        // Create the original basic event booking.
        EventBooking booking = new BasicEventBooking(
                "Cybersecurity Conference",
                factory.createRoom(),
                factory.createEquipment(),
                factory.createAccessControl()
        );

        // ==========================================
        // DECORATOR PATTERN START
        // Add optional services dynamically.
        // ==========================================

        booking = new CateringDecorator(booking);
        booking = new SecurityDecorator(booking);
        booking = new CleaningDecorator(booking);
        booking = new RecordingDecorator(booking);

        // ==========================================
        // DECORATOR PATTERN END
        // ==========================================

        System.out.println("BOOKING INFORMATION");
        System.out.println("------------------------------");
        System.out.println(booking.getDescription());

        System.out.println("------------------------------");
        System.out.printf(
                "Total Cost: $%.2f%n",
                booking.getCost()
        );
    }
}