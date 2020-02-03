import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Aaida Noor","TIKTOK",80000);
    }

    @Test
    public void hasName(){
        assertEquals("Aaida Noor", developer.getName());
    }

    @Test
    public void cannotNullName(){
        developer.setName(null);
        hasName();
    }

    @Test
    public void hasNationalNum(){
        assertEquals("TIKTOK", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(80000,developer.getSalary());
    }


    @Test
    public void canRaiseSalary(){
            developer.raiseSalary(10000);
        assertEquals(90000,developer.getSalary(),2d);
    }

    @Test
    public void canGetBonus(){
        assertEquals(800,developer.payBonus(),2d);
    }

    @Test
    public void cannotNegativeRaiseSalary(){
        developer.raiseSalary(-50000.00);
        assertEquals(80000, developer.getSalary(),2d);
    }

}
