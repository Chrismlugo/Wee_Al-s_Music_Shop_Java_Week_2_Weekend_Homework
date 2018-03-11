import Enum.InstrumentType;
import Instruments.Bass;
import org.junit.Before;
import org.junit.Test;

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
}
