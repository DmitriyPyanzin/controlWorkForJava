package Toys;

import InputMethods.*;

public class ChangeQuantity {

    public void changeQuantity(int answer) {
        int num = 0;

        System.out.println("На сколько ты хочешь увеличить количество игрушек?");
        System.out.println("Помни, что ты не можешь добавить больше 25 штук на один розыгрыш: ");

        try {
            num = new UserInput().changeQuantity();
        } catch (ScannerException e) {
            System.err.println("Ошибка: " + e.getMessage());
            new UserInput().nextLine();
        } catch (NumberException | MaxToysException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        if (answer == 1) {
            if (new HagiVagi().getQuantity() == 25) {
                System.out.println("Нельзя больше добавлять игрушек");

            } else if (new HagiVagi().getQuantity() + num > 25) {
                System.out.println("Слишком много игрушек нельзя добавить, теперь их максимальное количество");
                new HagiVagi().changeQuantityToys(Math.abs(new HagiVagi().getQuantity() - num));
                System.out.println("Количество игрушек стало " + new HagiVagi().getQuantity());

            } else {
                new HagiVagi().changeQuantityToys(num);
                System.out.println("Количество игрушек стало " + new HagiVagi().getQuantity());

            }

        } else if (answer == 2) {
            if (new DonaldDuck().getFrequencyOfLoss() == 25) {
                System.out.println("Нельзя больше добавлять игрушек");

            } else if (new DonaldDuck().getFrequencyOfLoss() + num > 25) {
                System.out.println("Слишком много игрушек нельзя добавить, теперь их максимальное количество");
                new DonaldDuck().changeQuantityToys(Math.abs(new DonaldDuck().getFrequencyOfLoss() - num));
                System.out.println("Количество игрушек стало " + new DonaldDuck().getFrequencyOfLoss());

            } else {
                new DonaldDuck().changeQuantityToys(num);
                System.out.println("Количество игрушек стало " + new DonaldDuck().getFrequencyOfLoss());

            }

        } else if (answer == 3) {
            if (new SponchBob().getQuantity() == 25) {
                System.out.println("Нельзя больше добавлять игрушек");

            } else if (new SponchBob().getQuantity() + num > 25) {
                System.out.println("Слишком много игрушек нельзя добавить, теперь их максимальное количество");
                new SponchBob().changeQuantityToys(Math.abs(new SponchBob().getQuantity() - num));
                System.out.println("Количество игрушек стало " + new SponchBob().getQuantity());

            } else {
                new SponchBob().changeQuantityToys(num);
                System.out.println("Количество игрушек стало " + new SponchBob().getQuantity());

            }

        } else {
            if (new MickiMouse().getQuantity() == 25) {
                System.out.println("Нельзя больше добавлять игрушек");

            } else if (new MickiMouse().getQuantity() + num > 25) {
                System.out.println("Слишком много игрушек нельзя добавить, теперь их максимальное количество");
                new MickiMouse().changeQuantityToys(Math.abs(new MickiMouse().getQuantity() - num));
                System.out.println("Количество игрушек стало " + new MickiMouse().getQuantity());

            } else {
                new MickiMouse().changeQuantityToys(num);
                System.out.println("Количество игрушек стало " + new MickiMouse().getQuantity());

            }
        }
    }
}
