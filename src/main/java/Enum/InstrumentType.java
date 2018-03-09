package Enum;

public enum InstrumentType {
    BRASS("Brass"),
    WOODWIND("Woodwind"),
    KEYBOARD("Keyboard"),
    STRING("String");

    public final  String type;

    InstrumentType(String type) {
        this.type = type;
    }
}
