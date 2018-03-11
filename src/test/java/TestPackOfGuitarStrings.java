import Accessory.PackOfGuitarStrings;
import Enum.StringPackType;
import Enum.StringPackType;
import Instruments.GuitarString;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestPackOfGuitarStrings {
    PackOfGuitarStrings packOfGuitarStrings;
    GuitarString guitarString;

    @Before
    public void setUp() throws Exception {
        packOfGuitarStrings = new PackOfGuitarStrings(StringPackType.STANDARD, "Daddario", 6, 15);
        guitarString = new GuitarString();


    }


    @Test
    public void canPopulatePack___Standard() {

        assertEquals(6, packOfGuitarStrings.countPack());


    }

    @Test
    public void canPopulatePack___Bass() {
        PackOfGuitarStrings packOfGuitarStrings1 = new PackOfGuitarStrings(StringPackType.BASS,"Ernie Ball", 3, 14 );
        assertEquals(4, packOfGuitarStrings1.countPack());
    }

    @Test
    public void canPopulatePack___Twelve() {
        PackOfGuitarStrings packOfGuitarStrings1 = new PackOfGuitarStrings(StringPackType.TWELVE_STRING, "Martin", 7, 20);
        assertEquals(12, packOfGuitarStrings1.countPack());
    }
}
