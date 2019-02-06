package Flight;

import java.util.Map;

public class Main {
    public static void main (String[]args) {
    Flights flights = new Flights();
    Map<Airport, Integer> flightsData = flights.flightsSchedule();

    SearchService searchService = new SearchService();
    searchService.searchFlightsFrom(flightsData, "Rzeszow");
    searchService.searchFlightsTo(flightsData, "Cracow");
    searchService.searchFlightsVia(flightsData, "Rzeszow","Warsaw","Gdansk");
    }
}
