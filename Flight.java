package csi340lab1;

public class Flight {
	private String flightNumber;
	private String origin;
	private String destination;
	private String departureDate;
	private String departureTime;
	private Airplane aircraft;
}

public String getFlightNumber()
{
    return flightNumber;
}

public String getOrigin()
{
    return origin;
}

public String getDestination()
{
    return destination;
}

public String getDepartureDate()
{
    return departureDate;
}

public String getDepartureTime()
{
    return departureTime;
}

public Airplane getAircraft()
{
    return aircraft;
}