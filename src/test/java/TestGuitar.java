import Enum.InstrumentType;
import Instruments.Guitar;
import Instruments.GuitarString;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestGuitar {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Explorer", "Rich Mahogany", InstrumentType.STRING, "Gibson", 1500, 3000);
    }

    @Test
    public void hasModel() {
        assertEquals("Explorer", guitar.getModel());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void canGetListOfStrings() {
        ArrayList<GuitarString> copy = new ArrayList<>();
        assertEquals(copy, guitar.getStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum", guitar.play());
    }
}
