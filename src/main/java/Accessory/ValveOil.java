package Accessory;

import Abstract.Item;
import Behaviours.ISell;

public class ValveOil extends Item implements ISell {
    public ValveOil(String make, int buyPrice, int sellPrice) {
        super(make, buyPrice, sellPrice);
    }

    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
