package Instrument;

import Behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {
    private String size;

    public Saxophone(String type, String material, String colour, double buyingCost, double sellingPrice) {
        super(type, material, colour, buyingCost, sellingPrice);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play() {
        return "Hawh";
    }
}
