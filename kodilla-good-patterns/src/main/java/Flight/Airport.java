package Flight;

import java.time.LocalDateTime;

public class Airport {
    String departureCity;
    String arrivalCity;
    LocalDateTime departureTime;
    LocalDateTime arrivalTime;

    public Airport(String departureCity, String arrivalCity, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;

        Airport airport = (Airport) o;

        if (!departureCity.equals(airport.departureCity)) return false;
        if (!arrivalCity.equals(airport.arrivalCity)) return false;
        if (!departureTime.equals(airport.departureTime)) return false;
        return arrivalTime.equals(airport.arrivalTime);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + arrivalTime.hashCode();
        return result;
    }
}
