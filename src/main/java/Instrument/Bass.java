package Instrument;

public class Bass extends Instrument {
    private int numberOfStrings;

    public Bass(String type, String material, String colour) {
        super(type, material, colour);
                this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
