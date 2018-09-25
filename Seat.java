
public class Seat {
	private SeatType type;
	private String seatNumber;
	private String seatLocation;
	private boolean booked;

	public String getSeatLocation() {
		return seatLocation;
	}

	public void setSeatLocation(String seatLocation) {
		this.seatLocation = seatLocation;
	}

	public Seat(SeatType type, String seatNumber) {
		this.type = type;
		this.seatNumber = seatNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

	public void setType(SeatType type) {
		this.type = type;
	}

	public SeatType getType() {
		return type;
	}

	public String getInfo(int seatsPerRow, int j) {
		String location;

		if (j == 1)
			location = "Aisle";
		else if (j == seatsPerRow)
			location = "Window";
		else
			location = "Middle";

		return location;
	}

}
