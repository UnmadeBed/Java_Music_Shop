import Accessories.Cymbal;
import Accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Woody's", 15.00, 30.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Woody's", drumSticks.getName());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(15.00, drumSticks.getBuyingCost(), 00.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(30.00, drumSticks.getSellingPrice(), 00.00);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(15.00, drumSticks.calculateMarkup(), 00.00);
    }
}
