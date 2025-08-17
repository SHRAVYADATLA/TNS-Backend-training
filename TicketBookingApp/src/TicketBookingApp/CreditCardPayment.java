package TicketBookingApp;

public class CreditCardPayment extends Payment {
    private String cardHolderName;
    private int amount;
    private String creditCardType;
    private String ccvNumber;

    public CreditCardPayment(String cardHolderName, int amount, String creditCardType, String ccvNumber) {
        this.cardHolderName = cardHolderName;
        this.amount = amount;
        this.creditCardType = creditCardType;
        this.ccvNumber = ccvNumber;
    }

    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid using %s card%n", amount, creditCardType);
    }
}

