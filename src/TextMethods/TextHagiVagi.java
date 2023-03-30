package TextMethods;

import Toys.HagiVagi;

public class TextHagiVagi {

    HagiVagi hagiVagi = new HagiVagi();

    public void textHagiVagi(){

        System.out.println("Для игрушки с ID " + hagiVagi.getId() + " - " + hagiVagi.getName()
                + " что будем делать?");
        System.out.println("1 - Увеличим количество игрушек? (сейчас их " + hagiVagi.getQuantity() + ")");
        System.out.println("2 - Увеличим шанс выпадения игрушек? (сейчас он равен "
                + hagiVagi.getFrequencyOfLoss() + ")");
        System.out.println("3 - Разыграть игрушку");
        System.out.println("0 - нияего не делать");

    }

}
