package Instruments;

import Abstract.Instrument;
import Enum.InstrumentType;

public class Guitar extends Instrument {
    public Guitar(String model, String material, InstrumentType instrumentType) {
        super(model, material, instrumentType);
    }
}
