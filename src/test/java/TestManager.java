import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestManager {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Kira", 1111, 100, "Codeclan");
    }

    @Test
    public void canGetName(){
        assertEquals("Kira", manager.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals(1111, manager.getniNmuber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100, manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Codeclan", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(50.00);
        assertEquals(150, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(1.0, manager.payBonus());
    }




}
