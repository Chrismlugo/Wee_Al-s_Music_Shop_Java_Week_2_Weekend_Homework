package Abstract;

import Behaviours.ISell;

public abstract class Item {
    public String make;
    public int buyPrice;
    public int sellPrice;

    public Item(String make, int buyPrice, int sellPrice) {
        this.make = make;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMake() {
        return make;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
