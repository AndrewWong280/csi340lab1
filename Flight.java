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

public class Flight {
	private String flightNumber;
	private String origin;
	private String destination;
	private String departureDate;
	private String departureTime;
	private Airplane aircraft;

	public Flight(String flightNumber, String origin, String destination, String departureDate, String departureTime, Airplane aircraft)
	{
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.aircraft = aircraft;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public void setAircraft(Airplane aircraft) {
		this.aircraft = aircraft;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public Airplane getAircraft() {
		return aircraft;
	}
	
	public ArrayList<Seat> getAvailableSeats() {
		ArrayList<Seat> availableSeats = new ArrayList<Seat>();
		
		ArrayList<Seat> seats = aircraft.getSeats();
		
		for(int i = 0; i < seats.size(); i++) {
			if(!seats.get(i).isBooked()) {
				availableSeats.add(seats.get(i));
			}
		}
		
		return availableSeats;
	}
	
	public ArrayList<Seat> getBookedSeats() {
		ArrayList<Seat> bookedSeats = new ArrayList<Seat>();
		
		ArrayList<Seat> seats = aircraft.getSeats();
		
		for(int i = 0; i < seats.size(); i++) {
			if(seats.get(i).isBooked()) {
				bookedSeats.add(seats.get(i));
			}
		}
		
		return bookedSeats;
	}
}