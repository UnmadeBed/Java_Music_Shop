import Accessories.DrumSticks;
import Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Bob's Strings", 5.00, 10.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob's Strings", guitarStrings.getName());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(5.00, guitarStrings.getBuyingCost(), 00.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(10.00, guitarStrings.getSellingPrice(), 00.00);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(5.00, guitarStrings.calculateMarkup(), 00.00);
    }
}
