package Accessory;

import Abstract.Item;
import Behaviours.ISell;
import Enum.InstrumentType;

public class SheetMusic extends Item implements ISell{
    private String name;
    private InstrumentType type;

    public SheetMusic(String name, InstrumentType type, String author, int buyPrice, int sellPrice) {
        super(author, buyPrice, sellPrice);
        this.name = name;
        this.type = type;
    }

    @Override
    public int calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }

    public String getName() {
        return name;
    }

    public InstrumentType getType() {
        return type;
    }
}
