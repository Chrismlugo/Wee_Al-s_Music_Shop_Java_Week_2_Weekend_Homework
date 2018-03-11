package Instruments;

import Abstract.Instrument;
import Abstract.Item;
import Behaviours.IPlay;
import Behaviours.ISell;
import Enum.InstrumentType;

import java.util.ArrayList;

public class Guitar extends Instrument implements IPlay, ISell {
    ArrayList<GuitarString> strings;
    public Guitar(String model, String material, InstrumentType instrumentType, String make, int buyPrice, int sellPrice) {
        super(model, material, instrumentType, make, buyPrice, sellPrice);
        this.strings = new ArrayList<>();

    }

    public ArrayList<GuitarString> getStrings() {
        ArrayList<GuitarString> copy = new ArrayList<>();
        copy = this.strings;
        return copy;
    }

    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }

    @Override
    public String play() {
        return "Strum";
    }
}
