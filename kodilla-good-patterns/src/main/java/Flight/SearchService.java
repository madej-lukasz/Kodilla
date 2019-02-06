package Flight;

import java.util.Map;

public class SearchService {
    public void searchFlightsFrom(Map<Airport, Integer> flightsData, String departureCity) {
        System.out.println("Flights from: ");
        flightsData.entrySet().stream()
                .filter(e->e.getKey().getDepartureCity()==departureCity)
                .forEach(System.out::println);

    }
    public void searchFlightsTo(Map<Airport, Integer> flightsData, String arrivalCity) {
        System.out.println("Flights to: ");
        flightsData.entrySet().stream()
                .filter(e->e.getKey().getDepartureCity()==arrivalCity)
                .forEach(System.out::println);

    }
    public void searchFlightsVia(Map<Airport, Integer> flightsData,String departureCity, String viaCity, String arrivalCity) {
        System.out.println("Flights via: ");
        flightsData.entrySet().stream()
                .filter(e->e.getKey().getDepartureCity() == viaCity && e.getKey().getArrivalCity() == arrivalCity ||
                        (e.getKey().getDepartureCity() == departureCity && e.getKey().getArrivalCity() == viaCity))
                .forEach(System.out::println);

    }
}
