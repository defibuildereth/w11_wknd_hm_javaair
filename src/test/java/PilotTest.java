import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Jim", Rank.CAPTAIN, "AB1234");
    }

    @Test
    public void pilotHasLicenseNum() {
        assertEquals("AB1234", pilot.getLicenseNum());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("pilot is flying the plane", pilot.flyPlane());
    }
}
