import static org.junit.Assert.*;

public class CalculateTest {

    @org.junit.Test
    public void add() {
        assertEquals(7,new Calculate().add(2,5));
    }

    @org.junit.Test
    public void subtract() {
        assertEquals(3,new Calculate().subtract(5,2));
    }

    @org.junit.Test
    public void multiply() {
        assertEquals(10,new Calculate().multiply(2,5));
    }

    @org.junit.Test
    public void divide() {
        assertEquals(2,new Calculate().divide(2,1));
    }
}