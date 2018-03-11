package Accessory;

import Instruments.GuitarString;

import java.util.ArrayList;

public class PackOfGuitarStrings {
    private ArrayList<GuitarString> strings;

    public PackOfGuitarStrings() {
        this.strings = new ArrayList<>();

    }

    public ArrayList<GuitarString> getStrings() {
        ArrayList<GuitarString> copy = new ArrayList<>();
        copy = this.strings;
        return copy;
    }


}
