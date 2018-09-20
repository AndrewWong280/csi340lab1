
import java.util.ArrayList;

public class Passenger {
	private ArrayList<Trip> trips = new ArrayList<Trip>();
	private String name;

	public String getName() {
		return name;
	}

	public Trip getTrip(int index) {
		return trips.get(index);
	}
}