package Toys;

public class DonaldDuck extends Toys {

    private final int id = 2;

    private final String name = "Дональд Дак";

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
