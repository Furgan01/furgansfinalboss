import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TicketAnalyticsMore {

    /**
     * TASK 1:
     * Return the average ticket price.
     * If there are no tickets, return 0.0.
     */
    public static double averageTicketPriceSafe(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 2:
     * Return a list of ALL passenger names (including non-VIP),
     * DISTINCT, sorted alphabetically (A-Z).
     */
    public static List<String> allPassengerNamesSorted(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 3:
     * Return Map<Country, Double> total revenue per destination.
     */
    public static Map<Country, Double> revenuePerDestination(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 4:
     * Return Map<Country, Long> = number of DISTINCT passengers per destination.
     * (Passenger distinctness uses Passenger.equals -> same name.)
     */
    public static Map<Country, Long> distinctPassengersPerDestination(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 5:
     * Return Optional<Ticket> = the cheapest ticket overall.
     * If there are no tickets -> Optional.empty()
     */
    public static Optional<Ticket> cheapestTicket(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 6:
     * Return Map<Country, Ticket> = most expensive ticket per destination.
     * (No Optional in the map values)
     *
     * Hint: you can use collectingAndThen + Optional::get
     */
    public static Map<Country, Ticket> mostExpensiveTicketPerDestination(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 7:
     * Return a Set<String> of flight numbers that have at least ONE VIP passenger.
     */
    public static Set<String> flightsWithVipPassenger(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 8:
     * Return Map<Boolean, List<Ticket>> partitioned by VIP passenger.
     * key=true -> VIP tickets, key=false -> non-VIP tickets
     */
    public static Map<Boolean, List<Ticket>> partitionByVip(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 9:
     * Return the top 3 DISTINCT ticket prices (descending).
     * Example: [10, 10, 50, 40] -> [50, 40, 10]
     */
    public static List<Double> top3DistinctPrices(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 10:
     * Return Optional<Country> = destination with the MOST tickets.
     * If tie: choose the country with lexicographically smallest name (Country.name()).
     * If no tickets -> Optional.empty()
     */
    public static Optional<Country> busiestDestinationTieBreak(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 11:
     * Return Map<Country, Double> = average ticket price per destination.
     * If a destination has tickets, it appears. (No destinations with empty lists.)
     */
    public static Map<Country, Double> averagePricePerDestination(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 12:
     * Return Optional<Passenger> = passenger who spent the most total money.
     * (Sum ticket prices per passenger)
     */
    public static Optional<Passenger> topSpender(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 13:
     * Return List<PassengerSpend> of the top 3 passengers by total spend (descending).
     * If fewer than 3 passengers exist, return as many as exist.
     */
    public static List<PassengerSpend> top3Spenders(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 14 (BOSS):
     * Return Map<Country, Long> = number of DISTINCT VIP passengers per destination.
     */
    public static Map<Country, Long> distinctVipPassengersPerDestination(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 15 (BOSS):
     * Return Optional<Country> = destination with the highest VIP revenue ONLY.
     * If there are no VIP tickets -> Optional.empty()
     */
    public static Optional<Country> topVipRevenueDestination(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * TASK 16 (FINAL BOSS):
     * Return a formatted report string with one line per destination:
     *
     * GERMANY -> tickets=3, passengers=2, revenue=1200.0
     * USA -> tickets=1, passengers=1, revenue=500.0
     *
     * Sorted by revenue descending.
     * Only include destinations that appear in the ticket stream.
     */
    public static String destinationReport(Stream<Ticket> tickets) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    // Helper record for spend leaderboards
    public record PassengerSpend(Passenger passenger, double totalSpend) {}
}
