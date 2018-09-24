import java.util.ArrayList;

public class Airplane {
	
	private ArrayList<Seat> seats = new ArrayList<Seat>();
	private String aircraftType;
	private String tailNumber;
	private int businessRows;
	private int firstClassRows;
	private int seatsPerRow;
	private AirlineCompany carrier;

	public boolean matches(Airplane testPlane)
	{
		if (this.aircraftType != testPlane.getAircraftType())
			return false;
		if (this.getSeats().size() < testPlane.getSeats().size())
			return false;
		if (this.getNumVIPSeats() < testPlane.getNumVIPSeats())
			return false;
		return true;
	}
	
	//must set businessRows, firstClassRows, and seatsPerRow 
	//before calling setSeats()
	public void setSeats() {
		char seatChar;
		int totalRows = firstClassRows + businessRows;

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 1; j <= seatsPerRow; j++) {
				Seat seat;
				
				seatChar = returnSeatLetter(j);
				
				if (i < (totalRows - businessRows))
					seat = new Seat(SeatType.VIP, String.valueOf(i) + seatChar);
				else
					seat = new Seat(SeatType.ECONOMY, String.valueOf(i) + seatChar);

				seats.add(seat);
			}

		}

	}
	
	
	//function would probably do better in another class,
	//got it here in the meantime
	//up to 6 seats per row as is, going to switch out with chars
	public char returnSeatLetter(int index)
	{
		int charValue = 64; //start of alphabet
		charValue += index;
		
		return (char) charValue;
		
	}
	
	public ArrayList<Seat> getSeats() {
		return seats;
	}
	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}
	public String getAircraftType() {
		return aircraftType;
	}
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	public String getTailNumber() {
		return tailNumber;
	}
	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}
	
	public int getNumVIPSeats()
	{
		int numVIPSeats = 0;
		for (Seat s: seats)
		{
			if (s.getType() == SeatType.VIP)
				numVIPSeats++;
		}
		return numVIPSeats;
	}
	
	
	public void setBusinessRows(int businessRows) {
		this.businessRows = businessRows;
	}

	public void setFirstClassRows(int firstClassRows) {
		this.firstClassRows = firstClassRows;
	}

	public void setSeatsPerRow(int seatsPerRow) {
		this.seatsPerRow = seatsPerRow;
	}
	
	public AirlineCompany getCarrier() {
		return carrier;
	}

	public void setCarrier(AirlineCompany carrier) {
		this.carrier = carrier;
	}
	
}

