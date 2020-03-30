import Instrument.ElectricGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    ElectricGuitar electricGuitar;

    @Before
    public void before() {
        electricGuitar = new ElectricGuitar("Stringed", "wood", "red", 700.00, 1000.00);
    }

    @Test
    public void canGetType() {
        assertEquals("Stringed", electricGuitar.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", electricGuitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("red", electricGuitar.getColour());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(700.00, electricGuitar.getBuyingCost(), 00.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(1000.00, electricGuitar.getSellingPrice(), 00.00);
    }

    @Test
    public void canGetSound() {
        assertEquals("Twang", electricGuitar.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(300.00, electricGuitar.calculateMarkup(), 00.00);
    }
}
