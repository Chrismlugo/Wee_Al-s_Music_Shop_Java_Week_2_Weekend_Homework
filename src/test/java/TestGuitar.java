import Enum.InstrumentType;
import Instruments.Guitar;
import org.junit.Before;

public class TestGuitar {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Gretsch", "Rich Mahogany", InstrumentType.STRING);
    }


}
