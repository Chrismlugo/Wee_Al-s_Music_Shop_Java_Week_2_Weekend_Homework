import Behaviours.ISell;
import Instruments.Guitar;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public int countStock() {
        return stock.size();
    }

    public void addStock(ISell item) {
        this.stock.add(item);

    }

    public void removeStock(ISell item) {
        this.stock.remove(item);
    }

    public int profit() {
        int total = 0;
        for(ISell item : this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
