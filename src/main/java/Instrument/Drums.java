package Instrument;

public class Drums extends Instrument {
    private int numberOfCymbals;
    private boolean hasSeat;

    public Drums(String type, String material, String colour) {
        super(type, material, colour);
        this.numberOfCymbals = numberOfCymbals;
        this.hasSeat = hasSeat;
    }

    public int getNumberOfCymbals() {
        return numberOfCymbals;
    }

    public boolean hasSeat() {
        return hasSeat;
    }
}
