package TicketBookingApp;

public class WalletPayment extends Payment {
    private int amount;
    private String walletNumber;

    public WalletPayment(int amount, String walletNumber) {
        this.amount = amount;
        this.walletNumber = walletNumber;
    }

    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid using wallet number %s%n", amount, walletNumber);
    }
}

