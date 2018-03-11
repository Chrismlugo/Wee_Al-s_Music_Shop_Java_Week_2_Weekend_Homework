import Accessory.SheetMusic;
import Enum.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSheetMusic {
    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("guitar songs for beginners", InstrumentType.STRING,"Chris Murphy", 4, 11);
    }

    @Test
    public void canGetName() {
        assertEquals("guitar songs for beginners", sheetMusic.getName());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(7, sheetMusic.calculateMarkup());
    }


    @Test
    public void getType() {
        assertEquals(InstrumentType.STRING, sheetMusic.getType());
    }
}
