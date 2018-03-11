import Instruments.Reed;
import Enum.InstrumentType;
import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSaxophone {
    Saxophone saxophone;
    Reed reed;

    @Before
    public void setUp() throws Exception {
        reed = new Reed("single");
        saxophone = new Saxophone(" M Series", "brass", InstrumentType.BRASS, reed, "Conn", 199, 580);

    }

    @Test
    public void hasTypeOfReed() {
        assertEquals("single", saxophone.getReedType());
    }

    @Test
    public void canGetReed() {
        assertEquals(reed, saxophone.getReed());

    }

    @Test
    public void canPlay() {

        assertEquals("blasts baker street", saxophone.play());
    }

    @Test
    public void canGetMarkupPrice() {
        assertEquals(381, saxophone.calculateMarkup());
    }
}
