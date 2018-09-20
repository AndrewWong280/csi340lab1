import java.util.ArrayList;

public class Flight {
	private String flightNumber;
	private String origin;
	private String destination;
	private String departureDate;
	private String departureTime;
	private Airplane aircraft;

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public Airplane getAircraft() {
		return aircraft;
	}
	
	public ArrayList<Seat> getAvailableSeats() {
		ArrayList<Seat> availableSeats = new ArrayList<Seat>;
		
		ArrayList<Seat> seats = aircraft.getSeats();
		
		for(int i = 0; i < seats.size(); i++) {
			if(!seats.get(i).getBooked()) {
				availableSeats.add(seats.get(i));
			}
		}
		
		return availableSeats;
	}
}