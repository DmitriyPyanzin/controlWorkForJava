package Toys;

public abstract class Toys implements interfaceOfToy {

    public int id;
    public String name;
    public static int quantity;
    public static int frequencyOfLoss;


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
    public int getFrequencyOfLoss() {
        return frequencyOfLoss;

    }

    @Override
    public void changeQuantityToys(int num) {
        quantity = quantity + num;

    }

    @Override
    public void changeLossToys(int num) {
        frequencyOfLoss = frequencyOfLoss + num;

    }

}
