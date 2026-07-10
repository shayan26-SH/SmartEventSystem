package Behavioral.Strategy;

public class StudentCardPayment implements PaymentStrategy {

    private String studentNumber;
    private double availableBalance;

    public StudentCardPayment(
            String studentNumber,
            double availableBalance) {

        if (studentNumber == null || studentNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Student number cannot be empty."
            );
        }

        if (availableBalance < 0) {
            throw new IllegalArgumentException(
                    "Available balance cannot be negative."
            );
        }

        this.studentNumber = studentNumber;
        this.availableBalance = availableBalance;
    }

    @Override
    public boolean pay(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "Student card payment failed: invalid amount."
            );

            return false;
        }

        if (availableBalance < amount) {
            System.out.printf(
                    "Student card payment failed: available balance is $%.2f.%n",
                    availableBalance
            );

            return false;
        }

        availableBalance -= amount;

        System.out.printf(
                "Student account %s paid $%.2f successfully.%n",
                studentNumber,
                amount
        );

        System.out.printf(
                "Remaining student card balance: $%.2f%n",
                availableBalance
        );

        return true;
    }

    @Override
    public String getPayment() {
        return "Student Card";
    }

    public double getAvailableBalance() {
        return availableBalance;
    }
}