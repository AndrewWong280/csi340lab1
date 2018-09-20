
public class Seat {
	private SeatType type;
	private String seatNumber;

	public Seat(SeatType type, String seatNumber) {
		this.type = type;
		this.seatNumber = seatNumber;
	}

	public SeatType getType() {
		return type;
	}

	public String getNumber() {
		return seatNumber;
	}
}
