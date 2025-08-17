package TicketBookingApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read ticket booking details
        String[] bookingDetails = sc.nextLine().split(",");
        String stageEvent = bookingDetails[0];
        String customer = bookingDetails[1];
        int noOfSeats = Integer.parseInt(bookingDetails[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);
        double totalAmount = booking.calculateTotalAmount();

        // Read payment mode
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        Payment payment = null;

        switch (choice) {
            case 1:
                int cashAmount = sc.nextInt();
                payment = new CashPayment(cashAmount);
                break;
            case 2:
                int walletAmount = sc.nextInt();
                sc.nextLine(); // consume newline
                String walletNumber = sc.nextLine();
                payment = new WalletPayment(walletAmount, walletNumber);
                break;
            case 3:
                String cardHolderName = sc.nextLine();
                int cardAmount = sc.nextInt();
                sc.nextLine(); // consume newline
                String creditCardType = sc.nextLine();
                String ccvNumber = sc.nextLine();
                payment = new CreditCardPayment(cardHolderName, cardAmount, creditCardType, ccvNumber);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        payment.makePayment(totalAmount);
        sc.close();
    }
}
