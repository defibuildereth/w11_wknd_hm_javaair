import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Alice", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void cabinCrewMemberHasRank() {
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrewMember.getRank());
    }
}
