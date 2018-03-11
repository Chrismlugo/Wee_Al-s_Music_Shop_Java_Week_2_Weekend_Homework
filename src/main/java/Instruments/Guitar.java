package Instruments;

import Abstract.Instrument;
import Enum.InstrumentType;

import java.util.ArrayList;

public class Guitar extends Instrument {
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
}
