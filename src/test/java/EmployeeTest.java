import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Pilot("Jim", Rank.CAPTAIN, "AB1234");
    }

    @Test
    public void employeeHasName() {
        assertEquals("Jim", employee.getName());
    }
}
