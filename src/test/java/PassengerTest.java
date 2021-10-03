import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Donald", 4);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Donald", passenger.getName());
    }

    @Test
    public void passengerHasNumBags() {
        assertEquals(4, passenger.getNumBags());
    }
}
