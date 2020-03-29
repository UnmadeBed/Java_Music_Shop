package Instrument;

import Behaviours.IPlay;

public class Bass extends Instrument implements IPlay {
    private int numberOfStrings;
    private String effectsPedal;

    public Bass(String type, String material, String colour) {
        super(type, material, colour);
                this.numberOfStrings = numberOfStrings;
                this.effectsPedal = effectsPedal;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getEffectsPedal() {
        return effectsPedal;
    }

    public String play(String sound) {
        return sound;
    }
}
