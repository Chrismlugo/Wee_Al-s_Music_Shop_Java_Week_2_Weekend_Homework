package Enum;

public enum StringPackType {
    STANDARD(6),
    BASS(4),
    TWELVE_STRING(12);

    public final int numberOfStrings;

    StringPackType(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
