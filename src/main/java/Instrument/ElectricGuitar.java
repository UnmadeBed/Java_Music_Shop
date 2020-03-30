package Instrument;

import Behaviours.IPlay;

public class ElectricGuitar extends Instrument implements IPlay {
    private int numberOfStrings;
    private String effectsPedal;
    private boolean whammy;

    public ElectricGuitar(String type, String material, String colour, double buyingCost, double sellingPrice) {
        super(type, material, colour, buyingCost, sellingPrice);
        this.numberOfStrings = numberOfStrings;
        this.effectsPedal = effectsPedal;
        this.whammy = whammy;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getEffectsPedal() {
        return effectsPedal;
    }

    public boolean hasWhammy() {
        return whammy;
    }

    public String play() {
        return "Twang";
    }
}
