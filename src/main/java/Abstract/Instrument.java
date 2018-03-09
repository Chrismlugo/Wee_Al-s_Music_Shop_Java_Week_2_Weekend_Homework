package Abstract;

import Enum.InstrumentType;

public abstract class Instrument {
    private  String model;
    private String material;
    private InstrumentType instrumentType;

    public Instrument(String model, String material, InstrumentType instrumentType) {
        this.model = model;
        this.material = material;
        this.instrumentType = instrumentType;
    }

    public String getModel() {
        return model;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
