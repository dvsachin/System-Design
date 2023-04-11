import java.time.LocalDateTime;

public class Reservation {
    public LocalDateTime creationDate;
    public String reservationNumber;
    public Flight flight;
    public Seat seats;
    public Airport destinationAirport, sourceAirport;

    Reservation(LocalDateTime creationDate, String reservationNumber, Flight flight, Seat seat,
                Airport destinationAirport, Airport sourceAirport) {
        this.destinationAirport = destinationAirport;
        this.sourceAirport = sourceAirport;
        this.flight = flight;
        this.creationDate = creationDate;
        this.seats = seat;
        this.reservationNumber = reservationNumber;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public Seat getSeats() {
        return seats;
    }
}
