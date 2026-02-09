public class Flight {

    private final String flightNumber;
    private final Country destination;
    private final int durationMinutes;

    public Flight(String flightNumber, Country destination, int durationMinutes) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.durationMinutes = durationMinutes;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Country getDestination() {
        return destination;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}
