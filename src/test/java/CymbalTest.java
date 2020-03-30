import Accessories.Cymbal;
import Instrument.Bass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CymbalTest {

    Cymbal cymbal;

    @Before
    public void before() {
        cymbal = new Cymbal("Crash", 100.00, 200.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Crash", cymbal.getName());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(100.00, cymbal.getBuyingCost(), 00.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(200.00, cymbal.getSellingPrice(), 00.00);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(100.00, cymbal.calculateMarkup(), 00.00);
    }
}
