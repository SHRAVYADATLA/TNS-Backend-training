package TicketBookingApp.java;
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        TicketBookingApp booking = new TicketBookingApp();
	        int choice = Integer.parseInt(sc.nextLine());

	        ((TicketBookingApp) booking).displayDetails();

	        switch (choice) {
	            case 1:
	                double cashAmount = Double.parseDouble(sc.nextLine());
	                System.out.printf("Amount %.1f paid in cash\n", cashAmount);
	                break;
	            case 2:
	                double walletAmount = Double.parseDouble(sc.nextLine());
	                String walletNumber = sc.nextLine();
	                System.out.printf("Amount %.1f paid using wallet number %s\n", walletAmount, walletNumber);
	                break;
	            case 3:
	                String cardHolderName = sc.nextLine();
	                double cardAmount = Double.parseDouble(sc.nextLine());
	                String cardType = sc.nextLine();
	                String ccv = sc.nextLine();
	                System.out.printf("Holder name:%s\n", cardHolderName);
	                System.out.printf("Amount %.1f paid using %s card\n", cardAmount, cardType);
	                System.out.println("CCV:" + ccv);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        sc.close();
	    }
	}


