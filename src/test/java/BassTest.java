import Instrument.Bass;
import Instrument.ElectricGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;

    @Before
    public void before() {
        bass = new Bass("Stringed", "wood", "blue", 500.00, 800.00);
    }

    @Test
    public void canGetType() {
        assertEquals("Stringed", bass.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", bass.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("blue", bass.getColour());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(500.00, bass.getBuyingCost(), 00.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(800.00, bass.getSellingPrice(), 00.00);
    }

    @Test
    public void canGetSound() {
        assertEquals("Twong", bass.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(300.00, bass.calculateMarkup(), 00.00);
    }
}
