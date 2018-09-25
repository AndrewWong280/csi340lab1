/* Authors: Ryan Weeks   -   ryan.weeks@mymail.champlain.edu
 * 			Andrew Wong  -  andrew.wong@mymail.champlain.edu
 * 		    Ashton Allen - ashton.allen@mymail.champlain.edu
 * 
 * Class: CSI-340-01
 * Assignment: Lab 01 - Airline Reservation System
 * Due Date: 9/25/18
 * 
 * Certification of Authenticity:
 * 	We certify that this is entirely our own work, except where we have given
 * 	fully-documented references to the work of others. We understand the definition
 * 	and consequences of plagiarism and acknowledge that the assessor of this
 * 	assignment may, for the purpose of assessing this assignment:
 * 		Reproduce this assignment and provide a copy to another member of academic
 * 		staff; and/or Communicate a copy of this assignment to a plagiarism checking
 * 		service (which may then retain a copy of this assignment on its database for
 * 		the purpose of future plagiarism checking)
 * */

public class Trip {
	private Flight flight;
	private Seat seat;
	
	public Trip(Flight flight) {
		this.flight = flight;

	}
	
	public void setSeat(String preferredSeat, SeatType type)
	{
		for (Seat seat : flight.getAvailableSeats())
		{
			if (seat.getSeatNumber().equals(preferredSeat)) 
			{
				this.seat = seat; //give them preferred seat
			}
		}
		//preferred seat not available, give first available seat of preferred type
		for (Seat seat : flight.getAvailableSeats())
		{
			if (seat.getType() == type)
			{
				this.seat = seat;
				seat.setBooked(true);
			}
		}
		
	}
	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeatNumber(Seat seat) 
	{
		for (Seat s: flight.getBookedSeats())
		{
			if (s.getSeatNumber() == seat.getSeatNumber())
				System.out.println("That seat has already been booked.");
				return;
		}
		this.seat = seat;
	}
	
	
}
