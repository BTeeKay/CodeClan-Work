import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FlightTest {

    Flight flight1;
    Plane plane1;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrew crew1;
    CabinCrew crew2;
    Passenger p1;
    Passenger p2;
    Passenger p3;
    Passenger p4;
    ArrayList<Pilot> pilotList;
    ArrayList<CabinCrew> cabinList;

    @Before
    public void before() {
        plane1 = new Plane("B737", 10, 5000);
        pilot1 = new Pilot("Brian", "Kerr", PilotRank.CAPTAIN, 282809);
        pilot2 = new Pilot("Tina", "Munro", PilotRank.FIRST_OFFICER, 292904);
        pilotList = new ArrayList<>();
        pilotList.add(pilot1);
        pilotList.add(pilot2);
        crew1 = new CabinCrew("Dev", "McClure", CabinRank.TRAINEE);
        crew2 = new CabinCrew("Preet", "Something", CabinRank.PURSER);
        cabinList = new ArrayList<>();
        cabinList.add(crew1);
        cabinList.add(crew2);
        p1 = new Passenger("Tommy", "Gardner", 1);
        p2 = new Passenger("Jean", "Gardner", 0);
        p3 = new Passenger("Vinnie", "Henderson", 1);
        p4 = new Passenger("Tommy", "Kerr", 1);
        LocalDateTime dept = LocalDateTime.now();
        flight1 = new Flight(pilotList, cabinList, plane1, 0001, "EDI", "GLA", dept);
    }

    @Test
    public void flightStartsWithNoPassengers() {
        assertEquals(0, flight1.getPassengerCount());
    }
    @Test
    public void flightStartsWithTwoPilots() {
        assertEquals(2, flight1.getPilotCount());
    }

    @Test
    public void flightTimePrintTime() {
        System.out.println(flight1.getDepartureTime());
    }

    @Test
    public void flightStartsWithTwoCrew() {
        assertEquals(2, flight1.getCrewCount());
    }

    @Test
    public void canAddPassengerToFlight() {
        flight1.addPassenger(p1);
        assertEquals(1, flight1.getPassengerCount());
    }

    @Test
    public void flightCapStartsAt10() {
        assertEquals(10, flight1.getCurrentCap());
    }

    @Test
    public void addPassengerToFlightDecreasesCapBy1() {
        flight1.addPassenger(p1);
        assertEquals(9, flight1.getCurrentCap());
    }

    @Test
    public void cantAddPassengerIfFlightFull() {
        flight1.addPassenger(p1);
        flight1.addPassenger(p1);
        flight1.addPassenger(p1);
        flight1.addPassenger(p1);
        flight1.addPassenger(p1);
        flight1.addPassenger(p1);
        flight1.addPassenger(p1);
        flight1.addPassenger(p1);
        flight1.addPassenger(p1);
        flight1.addPassenger(p1);
        assertEquals(false, flight1.addPassenger(p1));
    }

    @Test
    public void pilotCanFlyFlight() {
        assertEquals("Flight In Progress", flight1.startFlight());
    }

    public void crewAnnounceSeatBeltsOn() {
        CabinCrew c = flight1.getCrewMember(0);
        assertEquals("Please fasten seatbelts", c.seatbelt());
    }
}
