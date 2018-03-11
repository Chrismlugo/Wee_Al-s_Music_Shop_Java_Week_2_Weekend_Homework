package Accessory;

import Abstract.Item;
import Behaviours.ISell;
import Enum.StringPackType;
import Instruments.GuitarString;

import java.util.ArrayList;

public class PackOfGuitarStrings extends Item implements ISell {
    private StringPackType stringPackType;
    private ArrayList<GuitarString> strings;

    public PackOfGuitarStrings(StringPackType stringPackType, String make, int buyPrice, int sellPrice) {
        super(make, buyPrice, sellPrice);
        this.stringPackType = stringPackType;
        this.strings = new ArrayList<>();
        populatePack();

    }


    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }


    public int getNumberOfStrings(){
        return stringPackType.getNumberOfStrings();
    }

    public void addString(GuitarString string){
        strings.add(string);

    }

    public void populatePack(){
        for(int i = 0; i < getNumberOfStrings(); i++){
            GuitarString guitarString = new GuitarString();
            addString(guitarString);
        }

    }

    public int countPack(){
        return strings.size();
    }
}
