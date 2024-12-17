import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("orange juice", 85.6);
        assertEquals(42, 42);
        assertEquals("orange juice", c.getliquidType());
    }

    @Test
    void getPercentagefull() {
        Cup c = new Cup("orange juice", 85.6);
        assertEquals(85.6, c.getPercentFull());
    }

    @Test
    void setLiquidType() {
        Cup c = new Cup("orange juice", 85.6);
        c.setLiquidType("water");
        assertEquals("water", c.getliquidType());

    }

    @Test
    void setPercentFull() {
        Cup c = new Cup("orange juice", 85.6);
        c.setPercentFull(85.6);
        assertEquals(85.6, c.getPercentFull(), 0.001);

    }

    @Test
    void isEmpty() {
        Cup c = new Cup("apple juice", 87.99);
        assertFalse(c.isEmpty());
    }

    @Test
    void testsetLiquidwithNull() {
        Cup c = new Cup("water", 67);
        c.setLiquidType(null);
        assertNotNull(c.getliquidType());
    }

    @Test
    public void testSetBadPercentThrows() {
        Cup cup = new Cup("water", 8.7);
        assertThrows(IllegalArgumentException.class, () -> cup.setPercentFull(-1));
    }

    @Test
    public void testSetBadPercentWithAssert() {
        Cup cup = new Cup("kiwi", 90.2);
        assertAll("builds correct objects",
                () -> assertEquals("kiwi", cup.getliquidType()),
                () -> assertEquals(90.2, cup.getPercentFull(), 0.001)
        );

    }
}