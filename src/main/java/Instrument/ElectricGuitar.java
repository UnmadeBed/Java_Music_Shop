package Instrument;

public class ElectricGuitar extends Instrument{
    private int numberOfStrings;
    private String effectsPedal;
    private boolean whammy;

    public ElectricGuitar(String type, String material, String colour) {
        super(type, material, colour);
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
}
