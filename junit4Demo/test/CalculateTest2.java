import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest2 {
    /*
    *
    *
    *
    *
    *
    */

    @Before
    public void setUp() throws Exception {
        System.out.println("this is before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("this is after");
    }

    @Test
    public void add() {
        System.out.println("this is add");
    }

    @Test
    public void subtract() {
    }

    @Test
    public void multiply() {
    }

    @Test
    public void divide() {
    }
}