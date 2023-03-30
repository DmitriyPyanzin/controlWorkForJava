package Toys;

import java.util.ArrayList;
import java.util.Random;

public class Raffle {

    Random rand = new Random();
    HagiVagi hv = new HagiVagi();
    DonaldDuck dd = new DonaldDuck();
    SponchBob sb = new SponchBob();
    MickiMouse mm = new MickiMouse();


    public void raffle(ArrayList<String> list, int answer) {
        int num;

        if (answer == 1 && hv.getQuantity() != 0) {
            if (hv.getFrequencyOfLoss() == 100) {
                list.add(hv.getName());
                hv.changeQuantityToys(-1);
                System.out.println("Выпала " + hv.getName());

            } else if (hv.getFrequencyOfLoss() != 0) {
                System.out.println("У игрушки нет шансов!");

            } else {
                num = rand.nextInt(0, 101);
                if (num > hv.getFrequencyOfLoss()) {
                    System.out.println("Не повезло, игрушка не выпала!");

                } else {
                    list.add(hv.getName());
                    hv.changeQuantityToys(-1);
                    System.out.println("Выпала " + hv.getName());
                }
            }

        } else if (answer == 2 && dd.getQuantity() != 0) {
            if (dd.getFrequencyOfLoss() == 100) {
                list.add(dd.getName());
                dd.changeQuantityToys(-1);
                System.out.println("Выпала " + dd.getName());

            } else if (dd.getFrequencyOfLoss() != 0) {
                System.out.println("У игрушки нет шансов!");

            } else {
                num = rand.nextInt(0, 101);
                if (num > dd.getFrequencyOfLoss()) {
                    System.out.println("Не повезло, игрушка не выпала!");

                } else {
                    list.add(dd.getName());
                    dd.changeQuantityToys(-1);
                    System.out.println("Выпала " + dd.getName());
                }
            }

        } else if (answer == 3 && sb.getQuantity() != 0) {
            if (sb.getFrequencyOfLoss() == 100) {
                list.add(sb.getName());
                sb.changeQuantityToys(-1);
                System.out.println("Выпала " + sb.getName());

            } else if (sb.getFrequencyOfLoss() != 0) {
                System.out.println("У игрушки нет шансов!");

            } else {
                num = rand.nextInt(0, 101);
                if (num > sb.getFrequencyOfLoss()) {
                    System.out.println("Не повезло, игрушка не выпала!");

                } else {
                    list.add(sb.getName());
                    sb.changeQuantityToys(-1);
                    System.out.println("Выпала " + sb.getName());
                }
            }

        } else if (answer == 4 && mm.getQuantity() != 0) {
            if (mm.getFrequencyOfLoss() == 100) {
                list.add(mm.getName());
                mm.changeQuantityToys(-1);
                System.out.println("Выпала " + mm.getName());

            } else if (mm.getFrequencyOfLoss() != 0) {
                System.out.println("У игрушки нет шансов!");

            } else {
                num = rand.nextInt(0, 101);
                if (num > mm.getFrequencyOfLoss()) {
                    System.out.println("Не повезло, игрушка не выпала!");

                } else {
                    list.add(mm.getName());
                    mm.changeQuantityToys(-1);
                    System.out.println("Выпала " + mm.getName());
                }
            }

        } else
            System.out.println("Игрушек нет для розыгрыша");

    }

}
