import java.util.ArrayList;

public class Airplane {
	
	private ArrayList<Seat> seats = new ArrayList<Seat>();
	private String aircraftType;
	private String tailNumber;
	
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
	
}

