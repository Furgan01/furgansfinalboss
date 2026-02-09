import java.util.*;
import java.util.stream.Stream;

public class TicketAnalyticsMore {

    /**
     * TASK 10:
     * Return a list of DISTINCT passenger names
     * sorted alphabetically.
     */
    public static List<String> passengerNamesSorted(Stream<Ticket> tickets) {
        // TODO
        return List.of();
    }

    /**
     * TASK 11:
     * Compute the average ticket price of VIP passengers only.
     * If there are no VIP tickets, return 0.0.
     */
    public static double averageVipTicketPrice(Stream<Ticket> tickets) {
        // TODO
        return 0.0;
    }

    /**
     * TASK 12:
     * Group tickets by flight number.
     * Key: flight number
     * Value: list of tickets
     */
    public static Map<String, List<Ticket>> groupByFlightNumber(Stream<Ticket> tickets) {
        // TODO
        return Map.of();
    }

    /**
     * TASK 13:
     * For each destination country, return the CHEAPEST ticket price.
     */
    public static Map<Country, Double> cheapestPricePerDestination(Stream<Ticket> tickets) {
        // TODO
        return Map.of();
    }

    /**
     * TASK 14:
     * Return a set of passengers who have flown
     * to MORE THAN ONE destination.
     */
    public static Set<Passenger> passengersWithMultipleDestinations(Stream<Ticket> tickets) {
        // TODO
        return Set.of();
    }

    /**
     * TASK 15:
     * Return the passenger who has the MOST tickets.
     * If there are no tickets, return null.
     */
    public static Passenger mostFrequentPassenger(Stream<Ticket> tickets) {
        // TODO
        return null;
    }

    /**
     * TASK 16:
     * Return Map<Country, Long> =
     * number of VIP tickets per destination.
     */
    public static Map<Country, Long> vipTicketsPerDestination(Stream<Ticket> tickets) {
        // TODO
        return Map.of();
    }

    /**
     * TASK 17:
     * Return a list of flight numbers
     * sorted by TOTAL revenue descending.
     */
    public static List<String> flightsSortedByRevenue(Stream<Ticket> tickets) {
        // TODO
        return List.of();
    }

    /**
     * TASK 18:
     * Return the MOST EXPENSIVE ticket
     * for flights longer than 3 hours.
     * If none exist, return null.
     */
    public static Ticket mostExpensiveLongFlight(Stream<Ticket> tickets) {
        // TODO
        return null;
    }

    /**
     * TASK 19 (BOSS):
     * Return Map<Country, Long> =
     * number of DISTINCT VIP passengers per destination.
     */
    public static Map<Country, Long> distinctVipPassengersPerDestination(Stream<Ticket> tickets) {
        // TODO
        return Map.of();
    }

    /**
     * TASK 20 (FINAL BOSS):
     * Return destination country with the LOWEST total revenue.
     * If there are no tickets, return null.
     */
    public static Country lowestRevenueDestination(Stream<Ticket> tickets) {
        // TODO
        return null;
    }
}
