package Instruments;

import Abstract.Instrument;
import Enum.InstrumentType;

public class Saxophone extends Instrument {
    public Saxophone(String model, String material, InstrumentType instrumentType) {
        super(model, material, instrumentType);
    }
}
