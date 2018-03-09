import Enum.InstrumentType;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Explorer", "Rich Mahogany", InstrumentType.STRING);
    }

    @Test
    public void hasModel() {
        assertEquals("Explorer", guitar.getModel());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }
}
