
import java.util.ArrayList;

public class Passenger {
	private ArrayList<Trip> trips = new ArrayList<Trip>();
	private String name;
	
	public Passenger(String name)
	{
		this.name = name;
	}

	public Trip getTrip(int index) {
		return trips.get(index);
	}
	
	void updateTrip(int index, Trip single_trip) {
		trips.set(index, single_trip);
	}

	public ArrayList<Trip> getTrips() {
		return trips;
	}

	public void setTrips(ArrayList<Trip> trips) {
		this.trips = trips;
	}
	
	public void addTrip(Trip trip)
	{
		this.trips.add(trip);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printItenerary() {
		System.out.print("Name        : " + name + "\n");
		for(int i = 0; i < trips.size(); i++) {
			System.out.print("From        : " + trips.get(i).getFlight().getOrigin() + "\n");
			System.out.print("To          : " + trips.get(i).getFlight().getDestination() + "\n");
			System.out.print("Date        : " + trips.get(i).getFlight().getDepartureDate() + "\n");
			System.out.print("Time        : " + trips.get(i).getFlight().getDepartureTime() + "\n");
			System.out.print("Seat Number : " + trips.get(i).getSeat().getSeatNumber() + "\n");
			System.out.print("Carrier     : " + trips.get(i).getFlight().getAircraft().getCarrier() + "\n");
		}
	}
}