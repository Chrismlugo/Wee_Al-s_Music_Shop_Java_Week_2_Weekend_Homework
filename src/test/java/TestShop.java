import Abstract.Item;
import Accessory.PackOfGuitarStrings;
import Accessory.ValveOil;
import Behaviours.ISell;
import Enum.InstrumentType;
import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestShop {
    Shop shop;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("murphy's music house");
    }

    @Test
    public void hasName() {
        assertEquals("murphy's music house", shop.getName());
    }

    @Test
    public void hasNoStockInitially() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStockToShop() {
        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        shop.addStock(guitar);
        shop.addStock(packOfGuitarStrings);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        shop.addStock(guitar);
        shop.addStock(packOfGuitarStrings);
        shop.removeStock(guitar);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canCalculatePotentialProfit() {
        Valve valve1 = new Valve();
        Valve valve2 = new Valve();
        Valve valve3 = new Valve();
        Trumpet trumpet = new Trumpet("YTR2330", "Brass", InstrumentType.BRASS, "Yamaha", valve1, valve2, valve3, 80, 300);
        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        ValveOil valveOil = new ValveOil("Yamaha", 1, 10);
        shop.addStock(trumpet);
        shop.addStock(guitar);
        shop.addStock(packOfGuitarStrings);
        shop.addStock(valveOil);
        assertEquals(990, shop.profit());
    }

    @Test
    public void canGetGuitarsInStock() {

        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        ValveOil valveOil = new ValveOil("Yamaha", 1, 10);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(packOfGuitarStrings);
        shop.addStock(valveOil);
        assertEquals(3, shop.countGuitarStock());
    }

    @Test
    public void canGetTrumpetsInStock() {
        Valve valve1 = new Valve();
        Valve valve2 = new Valve();
        Valve valve3 = new Valve();
        Trumpet trumpet = new Trumpet("YTR2330", "Brass", InstrumentType.BRASS, "Yamaha", valve1, valve2, valve3, 80, 300);
        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        ValveOil valveOil = new ValveOil("Yamaha", 1, 10);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(trumpet);
        shop.addStock(trumpet);
        shop.addStock(trumpet);
        shop.addStock(packOfGuitarStrings);
        shop.addStock(valveOil);
        assertEquals(3, shop.countTrumpetStock());
    }

    @Test
    public void canGetInstrumentsInStock() {
        Valve valve1 = new Valve();
        Valve valve2 = new Valve();
        Valve valve3 = new Valve();
        Trumpet trumpet = new Trumpet("YTR2330", "Brass", InstrumentType.BRASS, "Yamaha", valve1, valve2, valve3, 80, 300);
        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        ValveOil valveOil = new ValveOil("Yamaha", 1, 10);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(trumpet);
        shop.addStock(trumpet);
        shop.addStock(trumpet);
        shop.addStock(packOfGuitarStrings);
        shop.addStock(valveOil);
        assertEquals(6, shop.countInstrumentStock());

    }

    @Test
    public void canGetSaxophonesInStock() {
        Reed reed = new Reed("Single");
        Valve valve1 = new Valve();
        Valve valve2 = new Valve();
        Valve valve3 = new Valve();
        Saxophone saxophone = new Saxophone("alto sax", "brass", InstrumentType.BRASS,reed, "Yamaha" , 100, 750);
        Trumpet trumpet = new Trumpet("YTR2330", "Brass", InstrumentType.BRASS, "Yamaha", valve1, valve2, valve3, 80, 300);
        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        ValveOil valveOil = new ValveOil("Yamaha", 1, 10);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(trumpet);
        shop.addStock(trumpet);
        shop.addStock(trumpet);
        shop.addStock(saxophone);
        shop.addStock(saxophone);
        shop.addStock(saxophone);
        shop.addStock(packOfGuitarStrings);
        shop.addStock(valveOil);
        assertEquals(3, shop.countSaxophoneStock());
    }

    @Test
    public void canGetBassGuitarsInStock() {
        Reed reed = new Reed("Single");
        Valve valve1 = new Valve();
        Valve valve2 = new Valve();
        Valve valve3 = new Valve();
        Bass bass = new Bass("Precision bass", "adler", InstrumentType.STRING, "Fender", 8000, 18000);
        Saxophone saxophone = new Saxophone("alto sax", "brass", InstrumentType.BRASS,reed, "Yamaha" , 100, 750);
        Trumpet trumpet = new Trumpet("YTR2330", "Brass", InstrumentType.BRASS, "Yamaha", valve1, valve2, valve3, 80, 300);
        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        ValveOil valveOil = new ValveOil("Yamaha", 1, 10);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.addStock(trumpet);
        shop.addStock(trumpet);
        shop.addStock(trumpet);
        shop.addStock(saxophone);
        shop.addStock(saxophone);
        shop.addStock(saxophone);
        shop.addStock(bass);
        shop.addStock(bass);
        shop.addStock(packOfGuitarStrings);
        shop.addStock(valveOil);
        assertEquals(2, shop.countBassStock());

    }

    @Test
  public void canFindItemByMake(){
        ArrayList<Item> copy = new ArrayList<>();
        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        ValveOil valveOil = new ValveOil("Yamaha", 1, 10);
        shop.addStock(guitar);
        shop.addStock(packOfGuitarStrings);
        shop.addStock(valveOil);

        assertEquals(1, shop.getStockOfMake("d'addario").size());
        assertEquals(1, shop.getStockOfMake("Ibanez").size());
    }
}
