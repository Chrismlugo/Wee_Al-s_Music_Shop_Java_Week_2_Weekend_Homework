import Accessory.PackOfGuitarStrings;
import Accessory.ValveOil;
import Enum.InstrumentType;
import Instruments.Guitar;
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
        Guitar guitar = new Guitar("acoustic", "Beech", InstrumentType.STRING, "Ibanez", 450, 1200);
        PackOfGuitarStrings packOfGuitarStrings = new PackOfGuitarStrings("d'addario", 5, 16);
        ValveOil valveOil = new ValveOil("Yamaha", 1, 10);
        shop.addStock(guitar);
        shop.addStock(packOfGuitarStrings);
        shop.addStock(valveOil);
        assertEquals(770, shop.profit());
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
}
