package Instrument;

import Behaviours.IPlay;

public class Drums extends Instrument implements IPlay {
    private int numberOfCymbals;
    private boolean hasSeat;

    public Drums(String type, String material, String colour, double buyingCost, double sellingPrice) {
        super(type, material, colour, buyingCost, sellingPrice);
        this.numberOfCymbals = numberOfCymbals;
        this.hasSeat = hasSeat;
    }

    public int getNumberOfCymbals() {
        return numberOfCymbals;
    }

    public boolean hasSeat() {
        return hasSeat;
    }

    public String play() {
        return "Badumtish";
    }
}
