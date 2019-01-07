public class Main {
    public static void main (String args[]){
        Flight flightCheck = new Flight("Cracow", "Rzeszow");
        FindFlight tryFindFlight = new FindFlight();
        try {
            tryFindFlight.findFlight(flightCheck);
        }catch (RouteNotFoundException e){
            System.out.println("We haven't found any flight");
        }
    }
}
