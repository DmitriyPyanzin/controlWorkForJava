package Toys;

public class MickiMouse extends Toys {

    private final int id = 4;

    private final String name = "Микки Маус";

    private int quantity = 0;

    private double frequencyOfLoss = 0;



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

    @Override
    public String toString() {
        return id + " - " + name + ", количество - " + quantity + ", шанс выпадения - " + frequencyOfLoss;
    }
}
