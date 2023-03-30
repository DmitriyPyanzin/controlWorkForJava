package TextMethods;

import Toys.SponchBob;

public class TextSponchBob {

    SponchBob sponchBob = new SponchBob();

    public void textSponchBob(){

        System.out.println("Для игрушки с ID " + sponchBob.getId() + " - " + sponchBob.getName()
                + " что будем делать?");
        System.out.println("1 - Увеличим количество игрушек? (сейчас их " + sponchBob.getQuantity() + ")");
        System.out.println("2 - Увеличим шанс выпадения игрушек? (сейчас он равен "
                + sponchBob.getFrequencyOfLoss() + ")");
        System.out.println("0 - нияего не делать");

    }

}
