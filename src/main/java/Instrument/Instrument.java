package Instrument;

public abstract class Instrument {
    private String type;
    private String material;
    private String colour;
    private double buyingCost;
    private double sellingPrice;

    public Instrument(String type, String material, String colour, double buyingCost, double sellingPrice) {
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.buyingCost = buyingCost;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyingCost() {
        return buyingCost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        double difference = getSellingPrice() - getBuyingCost();
        return difference;
    }
}
