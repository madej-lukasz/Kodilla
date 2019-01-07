import java.util.HashMap;

public class FindFlight {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Cracow", true);
        flightMap.put("Wasrsaw", true);
        flightMap.put("Rzeszow", true);
        flightMap.put("Lublin", false);
        flightMap.put("Katowice", false);

        Boolean flightTo = flightMap.get(flight.getArrivalAirport());
        if(flightTo == null || !flightTo) {
            throw new RouteNotFoundException();
        }
        return flightTo;


    }
}
