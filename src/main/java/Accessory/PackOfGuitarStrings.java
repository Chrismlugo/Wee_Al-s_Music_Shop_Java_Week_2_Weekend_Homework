package Accessory;

import Abstract.Item;
import Behaviours.ISell;
import Instruments.GuitarString;

import java.util.ArrayList;

public class PackOfGuitarStrings extends Item implements ISell {
    private ArrayList<GuitarString> strings;

    public PackOfGuitarStrings(String make, int buyPrice, int sellPrice) {
        super(make, buyPrice, sellPrice);
        this.strings = new ArrayList<>();

    }

    public ArrayList<GuitarString> getStrings() {
        ArrayList<GuitarString> copy = new ArrayList<>();
        copy = this.strings;
        return copy;
    }


    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
