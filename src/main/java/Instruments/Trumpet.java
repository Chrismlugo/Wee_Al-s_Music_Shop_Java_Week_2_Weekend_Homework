package Instruments;

import Abstract.Instrument;
import Behaviours.IPlay;
import Enum.InstrumentType;

public class Trumpet extends Instrument implements IPlay {

    private Valve valve1;
    private Valve valve2;
    private Valve valve3;
    public Trumpet(String model, String material, InstrumentType instrumentType, String make, Valve valve1, Valve valve2, Valve valve3, int buyPrice, int sellPrice) {
        super(model, material, instrumentType, make, buyPrice, sellPrice);
        this.valve1 = valve1;
        this.valve2 = valve2;
        this.valve3 = valve3;

    }

    public Valve getValve1() {
        return valve1;
    }

    public Valve getValve2() {
        return valve2;
    }

    public Valve getValve3() {
        return valve3;
    }

    @Override
    public String play() {
        return "trumpety trumpet sound";
    }
}
