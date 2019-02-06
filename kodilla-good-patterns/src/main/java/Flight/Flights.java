package Flight;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Flights {
    public Map<Airport, Integer> flightsSchedule(){
        Airport flight1 = new Airport("Rzeszow", "Warsaw", LocalDateTime.of(2018,02,10,12,10),LocalDateTime.of(2018,02,10,13,30));
        Airport flight2 = new Airport("Rzeszow", "Gdansk", LocalDateTime.of(2018,02,10,15,30),LocalDateTime.of(2018,02,10,17,30));
        Airport flight3 = new Airport("Cracow", "Warsaw", LocalDateTime.of(2018,02,10,8,10),LocalDateTime.of(2018,02,10,9,30));
        Airport flight4 = new Airport("Cracow", "Gdansk", LocalDateTime.of(2018,02,10,10,10),LocalDateTime.of(2018,02,10,11,30));
        Airport flight5 = new Airport("Rzeszow", "Cracow", LocalDateTime.of(2018,02,10,12,10),LocalDateTime.of(2018,02,10,13,30));
        Airport flight6 = new Airport("Warsaw", "Cracow", LocalDateTime.of(2018,02,10,15,50),LocalDateTime.of(2018,02,10,16,30));
        Airport flight7 = new Airport("Warsaw", "Gdansk", LocalDateTime.of(2018,02,10,14,50),LocalDateTime.of(2018,02,10,15,30));


        Map<Airport, Integer> flightsData = new HashMap<>();
        flightsData.put(flight1,1);
        flightsData.put(flight2,2);
        flightsData.put(flight3,3);
        flightsData.put(flight4,4);
        flightsData.put(flight5,5);
        flightsData.put(flight6,6);
        flightsData.put(flight7,7);

        return flightsData;
    }
}
