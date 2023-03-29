package Toys;

public abstract class Toys implements interfaceOfToy {

    private final int id;

    private final String name;

    private int quantity = 0;

    private double frequencyOfLoss = 0;

    public Toys(int id, String name, int quantity, double frequencyOfLoss) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequencyOfLoss = frequencyOfLoss;
    }

    public int getId() {
        return id;

    }

    public String getName() {
        return name;

    }

    public int getQuantity() {
        return quantity;

    }

    public double getFrequencyOfLoss () {
        return frequencyOfLoss;

    }

}
