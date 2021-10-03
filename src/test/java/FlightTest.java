import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passenger passenger;
    Plane plane;


    @Before
    public void before() {
        pilot = new Pilot("Jim", Rank.CAPTAIN, "AB1234");
        cabinCrewMember = new CabinCrewMember("Alice", Rank.FLIGHTATTENDANT);
        passenger = new Passenger("Donald", 3);
        plane = Plane.AIRBUS420;
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger);
        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
        cabinCrew.add(cabinCrewMember);
        flight = new Flight(pilot, cabinCrew, passengers, plane, "EZ123", "Edinburgh", "Vienna", "20:00");

    }
    @Test
    public void flightHasPilot() {
        assertEquals("Jim", flight.getPilot().getName());
        }
    }

