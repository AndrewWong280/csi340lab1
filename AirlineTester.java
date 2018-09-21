import java.util.ArrayList;

public class AirlineTester
{
    public static void main(String[] args)
    {
        AirlineCompany jetBlue = new AirlineCompany();
        Airplane plane1 = new Airplane();
        plane1.setAircraftType("Q400");
        plane1.setTailNumber("N49AF");
        plane1.setBusinessRows(20);
        plane1.setFirstClassRows(10);
        plane1.setSeatsPerRow(3);
        plane1.setSeats(); 
    }
}