/* Authors: Ryan Weeks   -   ryan.weeks@mymail.champlain.edu
 * 			Andrew Wong  -  andrew.wong@mymail.champlain.edu
 * 		    Ashton Allen - ashton.allen@mymail.champlain.edu
 * 
 * Class: CSI-340-01
 * Assignment: Lab 01 - Airline Reservation System
 * Due Date: 9/25/18
 * 
 * Certification of Authenticity:
 * 	We certify that this is entirely our own work, except where we have given
 * 	fully-documented references to the work of others. We understand the definition
 * 	and consequences of plagiarism and acknowledge that the assessor of this
 * 	assignment may, for the purpose of assessing this assignment:
 * 		Reproduce this assignment and provide a copy to another member of academic
 * 		staff; and/or Communicate a copy of this assignment to a plagiarism checking
 * 		service (which may then retain a copy of this assignment on its database for
 * 		the purpose of future plagiarism checking)
 * */

import java.util.ArrayList;

public class Airplane {

	private ArrayList<Seat> seats = new ArrayList<Seat>();
	private String aircraftType;
	private String tailNumber;
	private int businessRows;
	private int firstClassRows;
	private int seatsPerRow;
	private AirlineCompany carrier;
	
	public int getBusinessRows() {
		return businessRows;
	}

	public int getFirstClassRows() {
		return firstClassRows;
	}

	public int getSeatsPerRow() {
		return seatsPerRow;
	}

	public boolean matches(Airplane testPlane) {
		if (this.aircraftType != testPlane.getAircraftType())
			return false;
		if (this.getSeats().size() < testPlane.getSeats().size())
			return false;
		if (this.getNumVIPSeats() < testPlane.getNumVIPSeats())
			return false;
		return true;
	}
	
	public void setSeatNumbers(int businessRows, int firstClassRows, int seatsPerRow)
	{
		this.businessRows = businessRows;
		this.firstClassRows = firstClassRows;
		this.seatsPerRow = seatsPerRow;
	}

	// must set businessRows, firstClassRows, and seatsPerRow
	// before calling setSeats()
	public void setSeats() {
		SeatType section;
		char seatChar;
		int totalRows = firstClassRows + businessRows;

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 1; j <= seatsPerRow; j++) {
				Seat seat;
				String location;

				seatChar = returnSeatLetter(j);

				if (i <= (totalRows - businessRows))
					section = SeatType.VIP;
				else
					section = SeatType.ECONOMY;

				seat = new Seat(section, String.valueOf(i) + seatChar);
				location = seat.getInfo(seatsPerRow, j);
				seat.setSeatLocation(location);

				seats.add(seat);
			}

		}

	}

	public char returnSeatLetter(int index) {
		int charValue = 64; 
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

	public int getNumVIPSeats() {
		int numVIPSeats = 0;
		for (Seat s : seats) {
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
