
public class Seat {
	private SeatType type;
	private String seatNumber;
	private boolean booked;
	
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
}
