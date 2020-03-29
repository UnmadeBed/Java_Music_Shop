package Instrument;

public class Bass extends Instrument {
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
}
