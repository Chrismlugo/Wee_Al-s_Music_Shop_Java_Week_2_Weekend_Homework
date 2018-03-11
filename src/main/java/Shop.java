import Abstract.Instrument;
import Abstract.Item;
import Behaviours.ISell;
import Instruments.Bass;
import Instruments.Guitar;
import Instruments.Saxophone;
import Instruments.Trumpet;

import java.util.ArrayList;
import java.util.Iterator;

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

    public ArrayList<Instrument> getInstruments(){
        ArrayList<Instrument> copy = new ArrayList<>();
        for(ISell item : this.stock){
            if(item instanceof Instrument){
                copy.add((Instrument) item);
            }
        }
        return copy;
    }

    public ArrayList<Guitar> getGuitars() {
        ArrayList<Guitar> copy = new ArrayList<>();
        for(Instrument item: getInstruments()){
            if(item instanceof Guitar){
                copy.add((Guitar)item);
            }
        }
        return copy;
    }
    public ArrayList<Trumpet> getTrumpets() {
        ArrayList<Trumpet> copy = new ArrayList<>();
        for(Instrument item: getInstruments()){
            if(item instanceof Trumpet){
                copy.add((Trumpet)item);
            }
        }
        return copy;
    }

    public ArrayList<Saxophone> getSaxophones() {
        ArrayList<Saxophone> copy = new ArrayList<>();
        for(Instrument item: getInstruments()){
            if(item instanceof Saxophone){
                copy.add((Saxophone) item);
            }
        }
        return copy;
    }

    public ArrayList<Bass> getBassGuitars() {
        ArrayList<Bass> copy = new ArrayList<>();
        for(Instrument item: getInstruments()){
            if(item instanceof Bass){
                copy.add((Bass) item);
            }
        }
        return copy;
    }

    public ArrayList<ISell> getStockOfMake(String make) {
        ArrayList<ISell> copy = new ArrayList<>();
        for(ISell item : stock){
            if(item instanceof Item ){
                if(((Item) item).getMake() == make){
                    copy.add(item);
                }
            }
        }
        return copy;
    }

    public  int countInstrumentStock(){
        return getInstruments().size();
    }

    public int countGuitarStock() {
       return getGuitars().size();
    }


    public int countTrumpetStock() {
        return getTrumpets().size();
    }

    public int countSaxophoneStock(){
        return getSaxophones().size();
    }

    public int countBassStock() {
        return getBassGuitars().size();
    }


}
