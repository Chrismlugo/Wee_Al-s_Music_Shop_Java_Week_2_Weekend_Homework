package Instruments;

import Abstract.Instrument;
import Behaviours.IPlay;
import Behaviours.ISell;
import Enum.InstrumentType;

public class Saxophone extends Instrument implements IPlay, ISell {
    private Reed reed;

    public Saxophone(String model, String material, InstrumentType instrumentType, Reed reed, String make, int buyPrice, int sellPrice) {
        super( model, material, instrumentType, make, buyPrice, sellPrice);
        this.reed = reed;
    }

    public Reed getReed() {
        return reed;
    }

    public String getReedType() {
       return reed.getType();
    }

    @Override
    public String play() {
        return "blasts baker street";
    }

    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
