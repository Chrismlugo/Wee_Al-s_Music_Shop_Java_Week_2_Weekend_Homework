import Enum.InstrumentType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTrumpet {
    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet("shiny", "brass", InstrumentType.BRASS, "brassmann", 485,1800);
    }

    @Test
    public void canPlay() {
        assertEquals("trumpety trumpet sound", trumpet.play());
    }
}
