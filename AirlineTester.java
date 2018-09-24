import java.util.ArrayList;

public class AirlineTester
{
    public static void main(String[] args)
    {
        AirlineCompany jetBlue = new AirlineCompany();
        Airplane plane1 = new Airplane();
        plane1.setAircraftType("Q400");
        plane1.setTailNumber("N49AF");
        plane1.setCarrier(jetBlue);
        plane1.setBusinessRows(20);
        plane1.setFirstClassRows(10);
        plane1.setSeatsPerRow(3);
        plane1.setSeats(); 
        
        Flight flight1 = new Flight("1044", "KBTV", "KBGR", "9/26/18", "15:30", plane1);
        
        Passenger passenger1 = new Passenger("Joe Bodega");
        Trip trip1 = new Trip(flight1);
        trip1.setSeat("2A", SeatType.VIP);
        passenger1.addTrip(trip1);
        
        passenger1.printItenerary();
        
    }
}