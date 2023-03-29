package Toys;

public abstract class Toys implements interfaceOfToy {

    private int id;
    private String name;
    private int quantity;
    private double frequencyOfLoss;


    @Override
    public int getId() {
        return id;

    }

    @Override
    public String getName() {
        return name;

    }

    @Override
    public int getQuantity() {
        return quantity;

    }

    @Override
    public double getFrequencyOfLoss() {
        return frequencyOfLoss;

    }

}
