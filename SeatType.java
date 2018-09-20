
public enum SeatType {
	VIP, ECONOMY;

	public String toString() {
		switch (this) {
		case VIP:
			return "VIP";
		case ECONOMY:
			return "Economy";
		default:
			return "unspecified";
		}
	}
}
