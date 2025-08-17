package TicketBookingApp;

public class CashPayment extends Payment {
    private int amount;

    public CashPayment(int amount) {
        this.amount = amount;
    }

    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash%n", amount);
    }
}
