import Instrument.Drums;
import Instrument.ElectricGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before() {
        drums = new Drums("percussion", "metal", "black", 700.00, 1000.00);
    }

    @Test
    public void canGetType() {
        assertEquals("percussion", drums.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("metal", drums.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("black", drums.getColour());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(700.00, drums.getBuyingCost(), 00.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(1000.00, drums.getSellingPrice(), 00.00);
    }

    @Test
    public void canGetSound() {
        assertEquals("Badumtish", drums.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(300.00, drums.calculateMarkup(), 00.00);
    }
}
