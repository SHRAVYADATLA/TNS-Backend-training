package TicketBookingApp.java;
public class TicketBookingApp{
public class TicketBooking {
	    private String stageEvent;
	    private String customer;
	    private int noOfSeats;

	    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }

	    public void displayDetails() {
	        System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	    }
	}

public void displayDetails() {
	// TODO Auto-generated method stub
	
}
}

