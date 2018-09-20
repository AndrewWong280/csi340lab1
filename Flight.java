import java.util.ArrayList;

public class Flight {
	private String flightNumber;
	private String origin;
	private String destination;
	private String departureDate;
	private String departureTime;
	private Airplane aircraft;

	public Flight(String flightNumber, String origin, String destination, String departureDate, String departureTime, Airplane aircraft)
	{
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.aircraft = aircraft;
	}
	
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
		ArrayList<Seat> availableSeats = new ArrayList<Seat>();
		
		ArrayList<Seat> seats = aircraft.getSeats();
		
		for(int i = 0; i < seats.size(); i++) {
			if(!seats.get(i).isBooked()) {
				availableSeats.add(seats.get(i));
			}
		}
		
		return availableSeats;
	}
	
	public ArrayList<Seat> getBookedSeats() {
		ArrayList<Seat> bookedSeats = new ArrayList<Seat>();
		
		ArrayList<Seat> seats = aircraft.getSeats();
		
		for(int i = 0; i < seats.size(); i++) {
			if(seats.get(i).isBooked()) {
				bookedSeats.add(seats.get(i));
			}
		}
		
		return bookedSeats;
	}
}