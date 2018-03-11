import Instruments.GuitarString;
import Enum.InstrumentType;
import Instruments.Bass;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBass {
    Bass bass;

    @Before
    public void setUp() throws Exception {
        bass = new Bass("4 stringer", "wood", InstrumentType.STRING, "Rickenbacker", 600, 4500);
    }

    @Test
    public void canGetMarkupPrice() {
        assertEquals(3900, bass.calculateMarkup());
    }

    @Test
    public void hasNoStrings() {

        assertEquals(0, bass.countStrings());
    }


        @Test
    public void canAddGuitarString() {
        GuitarString string = new GuitarString();
        bass.addGuitarString(string);
        assertEquals(1, bass.countStrings());
    }

    @Test
    public void canPlayBass() {
        assertEquals("Dum Dum Dum", bass.play());
    }

    @Test
    public void canGetListOfStrings() {
        ArrayList<String> copy = new ArrayList<>();
        assertEquals(copy, bass.getStrings());
    }
}
