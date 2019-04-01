import org.junit.Before;
import org.junit.Test;
import teckStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class TestDatabaseAdmin {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jojo", 2222, 1000);
    }

    @Test
    public void canGetName(){
        assertEquals("Jojo", databaseAdmin.getName());
    }

    @Test
    public void canSetName(){
        databaseAdmin.setName("Mina");
        assertEquals("Mina", databaseAdmin.getName());
    }


    @Test
    public void canGetNiNumber(){
        assertEquals(2222, databaseAdmin.getniNmuber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(1000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(500);
        assertEquals(1500, databaseAdmin.getSalary());
    }

    @Test
    public void canNotRaiseNegativeSalary(){
        databaseAdmin.raiseSalary(-1);
        assertEquals(1000, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){

        assertEquals(10.0, databaseAdmin.payBonus());
    }
}
