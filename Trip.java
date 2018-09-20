
public class Trip {
	private Flight flight;
	private Seat seat;
	
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
