import Instruments.Valve;
import Enum.InstrumentType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTrumpet {
    Trumpet trumpet;
    Valve valve1;
    Valve valve2;
    Valve valve3;

    @Before
    public void setUp() throws Exception {

        trumpet = new Trumpet("shiny", "brass", InstrumentType.BRASS, "brassmann",valve1, valve2, valve3, 485,1800);
    }

    @Test
    public void canPlay() {
        assertEquals("trumpety trumpet sound", trumpet.play());
    }


    @Test
    public void canGetValve1() {
        assertEquals(valve1, trumpet.getValve1());
    }

    @Test
    public void canGetValve2() {
        assertEquals(valve2, trumpet.getValve2());
    }

    @Test
    public void canGetValve3() {
        assertEquals(valve3, trumpet.getValve3());
    }

    @Test
    public void play() {
    }
}
