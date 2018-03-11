package Instruments;

import Abstract.Instrument;
import Behaviours.IPlay;
import Behaviours.ISell;
import Enum.InstrumentType;

import java.util.ArrayList;

public class Bass extends Instrument implements ISell, IPlay {
    ArrayList<GuitarString> strings;
    public Bass(String model, String material, InstrumentType instrumentType, String make, int buyPrice, int sellPrice) {
        super(model, material, instrumentType, make, buyPrice, sellPrice);
    }

    public ArrayList<GuitarString> getStrings() {
        ArrayList<GuitarString> copy = new ArrayList<>();
        copy = this.strings;
        return copy;
    }

    @Override
    public String play() {
        return "Dum Dum Dum";
    }

    @Override
    public int calculateMarkup() {

      return  sellPrice - buyPrice;

    }
}
