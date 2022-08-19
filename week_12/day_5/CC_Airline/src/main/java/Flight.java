import java.util.ArrayList;
import java.time.LocalDateTime;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departureLoc;
    private LocalDateTime departureTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrew> crew, Plane plane,
                  int flightNumber, String destination, String departureLoc, LocalDateTime departureTime) {

        this.pilots = pilots;
        this.crew = crew;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureLoc = departureLoc;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public ArrayList<Pilot> getPilots() {
        return this.pilots;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public int getPilotCount() {
        return this.pilots.size();
    }

    public LocalDateTime getDepartureTime() {
        return this.departureTime;
    }

    public int getCrewCount() {
        return this.crew.size();
    }

    public boolean addPassenger(Passenger p1) {
        if (this.plane.getCapacity() > 0) {
            this.passengers.add(p1);
            this.plane.decreaseCapBy1();
            return true;
        }
        return false;
    }

    // get current remaining seats
    public int getCurrentCap() {
        return this.plane.getCapacity();
    }

    public String startFlight() {
        Pilot p = this.pilots.get(0);
        String message = p.fly();
        return message;
    }

    public CabinCrew getCrewMember(int i) {
        return this.crew.get(i);
    }
}
