package TextMethods;

import Toys.MickiMouse;

public class TextMickiMouse {

    MickiMouse mickiMouse = new MickiMouse();

    public void textMickiMouse(){

        System.out.println("Для игрушки с ID " + mickiMouse.getId() + " - " + mickiMouse.getName()
                + " что будем делать?");
        System.out.println("1 - Увеличим количество игрушек? (сейчас их " + mickiMouse.getQuantity() + ")");
        System.out.println("2 - Увеличим шанс выпадения игрушек? (сейчас он равен "
                + mickiMouse.getFrequencyOfLoss() + ")");
        System.out.println("0 - нияего не делать");

    }

}
