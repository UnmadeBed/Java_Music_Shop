package Instrument;

import Behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {
    private String size;

    public Saxophone(String type, String material, String colour) {
        super(type, material, colour);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play(String sound) {
        return sound;
    }
}
