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

public class AirlineTester
{
    public static void main(String[] args)
    {
        AirlineCompany jetBlue = new AirlineCompany();
        jetBlue.setName("JetBlue");
        Airplane plane1 = new Airplane();
        plane1.setAircraftType("Q400");
        plane1.setTailNumber("N49AF");
        plane1.setCarrier(jetBlue);
        plane1.setSeatNumbers(20, 10, 3);
        plane1.setSeats(); 
        
        Airplane plane2 = new Airplane();
        plane2.setAircraftType("737");
        plane2.setTailNumber("N56JB");
        plane2.setCarrier(jetBlue);
        plane2.setSeatNumbers(40, 20, 6);
        plane2.setSeats(); 
        
        Flight flight1 = new Flight("1044", "KBTV", "KBGR", "9/26/18", "15:30", plane1);
        Flight flight2 = new Flight ("1045", "KMMU", "KEWR", "9/27/18", "12:00", plane2);
        
        Passenger passenger1 = new Passenger("Joe Bodega");
        Trip trip1 = new Trip(flight1);
        trip1.setSeat("2A", SeatType.VIP);
        
        Trip trip2 = new Trip(flight2);
        trip2.setSeat("3C", SeatType.ECONOMY);
        passenger1.addTrip(trip1);
        passenger1.addTrip(trip2);
        
        passenger1.printItenerary();
        
    }
}