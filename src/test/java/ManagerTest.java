import Managment.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Azhar Sharif","PC866025A", 80000,"Development");
    }

    @Test
    public void hasName(){
        assertEquals("Azhar Sharif", manager.getName());
    }

    @Test
    public void cannotNullName(){
        manager.setName(null);
        hasName();
    }

    @Test
    public void hasNationalNum(){
        assertEquals("PC866025A", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(80000,manager.getSalary(),2d);
    }

    @Test
    public void hasDepName(){
        assertEquals("Development",manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000);
        assertEquals(90000,manager.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(800,manager.payBonus(),2d);
    }

    @Test
    public void cannotNegativeRaiseSalary(){
        manager.raiseSalary(-50000.00);
        assertEquals(80000, manager.getSalary(),2d);
    }
}
