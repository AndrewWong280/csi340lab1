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
