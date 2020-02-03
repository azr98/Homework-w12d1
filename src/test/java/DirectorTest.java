import Managment.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Azhar Sharif", "PC866025A", 80000,250000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Azhar Sharif", director.getName());
    }

    @Test
    public void cannotNullName(){
        director.setName(null);
        hasName();
    }

    @Test
    public void hasNationalNum(){
        assertEquals("PC866025A", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(80000,director.getSalary(),2d);
    }

    @Test
    public void hasBudget(){
        assertEquals(250000,director.getBudget(),2d);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000);
        assertEquals(90000,director.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(1600,director.payBonus(),2d);
    }

    @Test
    public void cannotNegativeRaiseSalary(){
        director.raiseSalary(-50000.00);
        assertEquals(80000, director.getSalary(),2d);
    }
}
