import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDirector {
    Director director;

    @Before
    public void before(){
        director = new Director("Mina", 3333, 2000, "Codeclan", 4000000);
    }

    @Test
    public void canGetName(){
        assertEquals("Mina", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals(3333, director.getniNmuber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(2000, director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Codeclan", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(4000000.0, director.getBudget());
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(3000, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(40.0, director.payBonus());
    }



}

