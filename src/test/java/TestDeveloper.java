import org.junit.Before;
import org.junit.Test;
import teckStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Kira", 1111, 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Kira", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals(1111, developer.getniNmuber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(50);
        assertEquals(150, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(1.0, developer.payBonus(), 0.01);
    }
}

