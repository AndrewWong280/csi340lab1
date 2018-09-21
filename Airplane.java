import java.util.ArrayList;

public class Airplane {
	
	private ArrayList<Seat> seats = new ArrayList<Seat>();
	private String aircraftType;
	private String tailNumber;
	private int businessRows;
	private int firstClassRows;
	private int seatsPerRow;
	
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
		String seatLetter;
		int totalRows = firstClassRows + businessRows;

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 1; j <= seatsPerRow; j++) {
				Seat seat;
				seatLetter = ""; //probably should be determined by separate function
				if (j == 1)
					seatLetter = "A";
				else if (j == 2)
					seatLetter = "B";
				else if (j == 3)
					seatLetter = "C";
				else
					seatLetter = "D";

				if (i < (totalRows - businessRows))
					seat = new Seat(SeatType.VIP, String.valueOf(i) + seatLetter);
				else
					seat = new Seat(SeatType.ECONOMY, String.valueOf(i) + seatLetter);

				seats.add(seat);
			}

		}

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
	
}

