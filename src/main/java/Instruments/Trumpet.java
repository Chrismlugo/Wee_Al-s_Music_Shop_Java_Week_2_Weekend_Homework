package Instruments;

import Abstract.Instrument;
import Accessory.Valve;
import Behaviours.IPlay;
import Enum.InstrumentType;

import java.util.ArrayList;

public class Trumpet extends Instrument implements IPlay {
    ArrayList<Valve> valves;
    public Trumpet(String model, String material, InstrumentType instrumentType, String make, int buyPrice, int sellPrice) {
        super(model, material, instrumentType, make, buyPrice, sellPrice);

        this.valves = new ArrayList<>();
    }

    public ArrayList<Valve> getValves() {
        ArrayList<Valve> copy = new ArrayList<>();
        copy = this.valves;
        return copy;
    }

    @Override
    public String play() {
        return "trumpety trumpet sound";
    }
}
