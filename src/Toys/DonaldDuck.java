package Toys;

public class DonaldDuck extends Toys {

    private final int id = 2;

    private final String name = "Дональд Дак";

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
    public String toString() {
        return id + " - " + name + ", количество - " + quantity + ", шанс выпадения - " + frequencyOfLoss;

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
