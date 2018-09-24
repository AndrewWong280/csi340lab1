
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
