import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("Aaida Noor","PC866025A", 80000);
    }
    @Test
    public void hasName(){
        assertEquals("Aaida Noor", admin.getName());
    }

    @Test
    public void cannotNullName(){
        admin.setName(null);
        hasName();
    }

    @Test
    public void hasNationalNum(){
        assertEquals("PC866025A", admin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(80000, admin.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        admin.raiseSalary(10000);
        assertEquals(90000, admin.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(800,admin.payBonus(),2d);
    }

    @Test
    public void cannotNegativeRaiseSalary(){
        admin.raiseSalary(-50000.00);
        assertEquals(80000, admin.getSalary(),2d);
    }
}
