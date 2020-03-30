package Accessories;

import Behaviours.ISell;

public abstract class Accessory {

    private String name;
    private double buyingCost;
    private double sellingPrice;

    public Accessory(String name, double buyingCost, double sellingCost) {
        this.name = name;
        this.buyingCost = buyingCost;
        this.sellingPrice = sellingCost;
    }

    public String getName() {
        return name;
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
