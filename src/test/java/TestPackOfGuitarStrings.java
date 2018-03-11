import Accessory.PackOfGuitarStrings;
import Instruments.GuitarString;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestPackOfGuitarStrings {
    PackOfGuitarStrings packOfGuitarStrings;

    @Before
    public void setUp() throws Exception {
        packOfGuitarStrings = new PackOfGuitarStrings("Daddario", 6, 15);

    }

    @Test
    public void canGetStrings() {
        ArrayList<GuitarString> copy = new ArrayList<>();
        assertEquals(copy, packOfGuitarStrings.getStrings());
    }
}
