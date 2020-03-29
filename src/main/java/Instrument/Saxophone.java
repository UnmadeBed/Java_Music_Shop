package Instrument;

public class Saxophone extends Instrument {
    private String size;

    public Saxophone(String type, String material, String colour) {
        super(type, material, colour);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
