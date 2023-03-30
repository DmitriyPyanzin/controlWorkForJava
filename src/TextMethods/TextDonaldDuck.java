package TextMethods;

import Toys.DonaldDuck;

public class TextDonaldDuck {

    DonaldDuck donaldDuck = new DonaldDuck();

    public void textDonaldDuck(){

        System.out.println("Для игрушки с ID " + donaldDuck.getId() + " - " + donaldDuck.getName()
                + " что будем делать?");
        System.out.println("1 - Увеличим количество игрушек? (сейчас их " + donaldDuck.getFrequencyOfLoss() + ")");
        System.out.println("2 - Увеличим шанс выпадения игрушек? (сейчас он равен "
                + donaldDuck.getFrequencyOfLoss() + ")");
        System.out.println("3 - Разыграть игрушку");
        System.out.println("0 - нияего не делать");

    }

}
