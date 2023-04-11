import java.time.LocalDateTime;
import java.util.*;
public class Flight {
    public LocalDateTime departure, arrival;
    public Timer duration;
    public String origin, destination;

    Flight(LocalDateTime departure, LocalDateTime arrival, Timer duration, String destination, String source) {
        this.origin = source;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
    }
}
