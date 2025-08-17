package TicketBookingApp;

public class TicketBooking {
    private String stageEvent;
    private String customer;
    private int noOfSeats;

    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public double calculateTotalAmount() {
        return noOfSeats * 100.0; // Assuming each seat costs 100.0
    }

    public String getCustomer() {
        return customer;
    }
}

	

