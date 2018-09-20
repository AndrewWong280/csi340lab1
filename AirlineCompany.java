import java.util.ArrayList;

public class AirlineCompany 
{
	private ArrayList<Airplane> fleet;
	private String name;


	public AirlineCompany()
	{
		fleet = new ArrayList<Airplane>();
	}
	
	public void addPlane(Airplane plane)
	{
		fleet.add(plane);
	}
	
	public ArrayList<Airplane> getAllPlanes()
	{
		return fleet;
	}
	
	public ArrayList<Airplane> getAvailablePlanes(Airplane testPlane)
	{
		ArrayList<Airplane> availablePlanes = new ArrayList<>();
		
		for(Airplane a: fleet)
		{
			if (a.matches(testPlane))
			{
				availablePlanes.add(a);
			}
		}
		
		return availablePlanes;
	}
}